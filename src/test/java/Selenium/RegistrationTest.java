package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

    static WebDriver driver;

    @BeforeClass
    public static void setup () {
        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
    }
    @AfterClass
    public static void cleanup () {
        driver.quit ();
    }


    @Test
    public void lang () {
        driver.navigate ().to ("https://accounts.ukr.net/registration");
        driver.findElement (By.className ("header__lang-long-name"));

        // System.out.println ("Lang: " +  );

        WebElement languageUa = driver.findElement (By.xpath ("/html/body/div/div/header/div/div[2]/button[1]/span[1]"));
        System.out.println ("Color of current language: " + languageUa.getCssValue ("color"));
        WebElement languageRu = driver.findElement (By.xpath ("/html/body/div/div/header/div/div[2]/button[2]/span[1]"));
        System.out.println ("Color of inactive language: " + languageRu.getCssValue ("color"));
        WebElement languageEn = driver.findElement (By.xpath ("/html/body/div/div/header/div/div[2]/button[3]/span[1]"));
        System.out.println ("Color of inactive language: " + languageEn.getCssValue ("color"));

    }
   @Test
    public void login ()  {
        driver.navigate ().to ("https://accounts.ukr.net/registration");
        WebElement loginField = driver.findElement (By.id ("id-login"));
        loginField.sendKeys ("1");
        loginField.click ();
        driver.findElement (By.xpath ("/html/body/div/div/main/form/section[1]/div/div/p[1]"));
        WebElement ErrorLogin = driver.findElement (By.className ("login-suggestions__error"));
        System.out.println ("Color of suggestion error: " + ErrorLogin.getCssValue ("color"));
        WebElement Suggestion = driver.findElement (By.className ("login-suggestions__title"));
        System.out.println ("Color of suggestion: " + Suggestion.getCssValue ("color"));
        WebElement SuggestionItem = driver.findElement (By.className ("login-suggestions__item"));
        System.out.println ("Color of suggestion Item: " + SuggestionItem.getCssValue ("color"));


    }

}

