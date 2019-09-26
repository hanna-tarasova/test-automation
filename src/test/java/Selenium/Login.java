package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    private final Object lock = new Object ();
    static WebDriver driver;
    static Cookie cookie1;
    static Cookie cookie2;




    @BeforeClass
    public static void setup () {
        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
    }

//    @AfterClass
//    public static void cleanup () {
//        driver.quit ();
//    }

    @Test
    public void login () throws InterruptedException {
        driver.navigate ().to ("https://accounts.ukr.net/");
        driver.findElement (By.id ("id-l")).sendKeys ("tarasova.hanna" + Keys.ENTER);
        Thread.sleep (1000);
        driver.findElement (By.id ("id-p")).sendKeys ("tarasova" + Keys.ENTER);
        driver.findElement (By.cssSelector (".button")).click ();
        cookie1 = (Cookie) driver.manage ().getCookies ();



        // System.out.println("Cookie " + cookie1.toString ());
        driver.manage ().deleteAllCookies ();

        driver.navigate ().to ("https://mail.ukr.net/");
        driver.manage ().deleteAllCookies ();

        Thread.sleep (1000);
        driver.navigate ().refresh ();
        driver.quit ();
        Thread.sleep (4000);
        driver = new ChromeDriver ();
        driver.navigate ().to ("https://mail.ukr.net/");


         cookie2 = cookie1;

        driver.manage ().addCookie (cookie2);
        Thread.sleep (6000);
    }

    ;
};
