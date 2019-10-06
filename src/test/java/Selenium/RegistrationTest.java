package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegistrationTest {

    static WebDriver driver;

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
    public void lang () {
        driver.navigate ().to ("https://accounts.ukr.net/registration");
        WebElement lang = driver.findElement (By.className ("header__lang-long-name"));
        System.out.println ("Is choice of language available?  " + lang.isDisplayed ());

        WebElement languageUa = driver.findElement (By.xpath ("/html/body/div/div/header/div/div[2]/button[1]/span[1]"));
        System.out.println ("Color of current language: " + languageUa.getCssValue ("color"));
        WebElement languageRu = driver.findElement (By.xpath ("/html/body/div/div/header/div/div[2]/button[2]/span[1]"));
        System.out.println ("Color of inactive language: " + languageRu.getCssValue ("color"));
        WebElement languageEn = driver.findElement (By.xpath ("/html/body/div/div/header/div/div[2]/button[3]/span[1]"));
        System.out.println ("Color of inactive language: " + languageEn.getCssValue ("color"));

        Assert.assertEquals ("rgba(52, 56, 64, 1)", languageUa.getCssValue ("color"));
        Assert.assertEquals ("rgba(102, 153, 0, 1)", languageRu.getCssValue ("color"));
        Assert.assertEquals ("rgba(102, 153, 0, 1)", languageEn.getCssValue ("color"));

    }


    @Test
    public void login () {
        driver.navigate ().to ("https://accounts.ukr.net/registration");
        WebElement loginField = driver.findElement (By.id ("id-login"));
        loginField.sendKeys ("123");
        loginField.click ();
        WebElement sugg = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[1]/div/div/p[1]"));
        System.out.println ("Is suggestion displayed " + sugg.isDisplayed ());

        WebElement ErrorLogin = driver.findElement (By.className ("login-suggestions__error"));
        System.out.println ("Color of suggestion error: " + ErrorLogin.getCssValue ("color"));
        WebElement Suggestion = driver.findElement (By.className ("login-suggestions__title"));
        System.out.println ("Color of suggestion: " + Suggestion.getCssValue ("color"));
        WebElement SuggestionItem = driver.findElement (By.className ("login-suggestions__item"));
        System.out.println ("Color of suggestion Item: " + SuggestionItem.getCssValue ("color"));

        Assert.assertEquals ("rgba(219, 75, 55, 1)", ErrorLogin.getCssValue ("color"));
        Assert.assertEquals ("rgba(140, 148, 158, 1)", Suggestion.getCssValue ("color"));
        Assert.assertEquals ("rgba(78, 78, 78, 1)", SuggestionItem.getCssValue ("color"));
    }

    @Test
    public void personalData () {
        driver.navigate ().to ("https://accounts.ukr.net/registration");
        WebElement firstName = driver.findElement (By.id ("id-first-name"));
        firstName.sendKeys ("1");
        Actions clickSuggF = new Actions (driver);
        clickSuggF.clickAndHold (firstName)
                .release (firstName)
                .build ()
                .perform ();
        WebElement suggDataF = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[4]"));
        System.out.println ("Is suggestion for first name displayed? " + suggDataF.isDisplayed ());


        WebElement secondName = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[1]/div/div[2]/input"));
        secondName.sendKeys ("1");
        Actions clickSuggS = new Actions (driver);
        clickSuggF.clickAndHold (secondName)
                .release (secondName)
                .build ()
                .perform ();
        WebElement suggDataS = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[4]"));
        System.out.println ("Is suggestion for second name displayed? " + suggDataS.isDisplayed ());

        WebElement birthDay = driver.findElement (By.id ("id-birth-day"));
        secondName.sendKeys ("1");
        Actions clickSuggB = new Actions (driver);
        clickSuggB.clickAndHold (birthDay)
                .release (birthDay)
                .build ()
                .perform ();
        WebElement suggDataB = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[4]"));
        System.out.println ("Is suggestion for birthday displayed? " + suggDataB.isDisplayed ());

        WebElement month = driver.findElement (By.className ("input-select__target"));
        month.click ();
        WebElement suggDataM = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[4]"));
        System.out.println ("Is suggestion for month displayed? " + suggDataM.isDisplayed ());


        WebElement year = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[2]/div/div[2]/input"));
        year.sendKeys ("1");
        Actions clickSuggY = new Actions (driver);
        clickSuggY.clickAndHold (year)
                .release (year)
                .build ()
                .perform ();
        WebElement suggDataY = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[4]"));
        System.out.println ("Is suggestion for year displayed? " + suggDataY.isDisplayed ());

        System.out.println ("suggestion text for ukr lang: " + suggDataF.getText ());

      //  Assert.assertEquals ("Ваші особисті дані знадобляться для відновлення доступу до пошти за допомогою паспорта, якщо інші способи виявляться неможливими. Тому ім'я, прізвище і дата народження, вказані тут, повинні збігатися з вашими паспортними даними. Інакше ніхто, навіть ми, не зможе допомогти вам – доступ до пошти буде втрачено назавжди.", suggDataF.getText ());


        driver.findElement (By.xpath ("/html/body/div/div/header/div/div[2]/button[2]/span[1]")).click ();
        driver.findElement (By.id ("id-first-name")).sendKeys ("1");
        Actions clickSuggFR = new Actions (driver);
        clickSuggF.clickAndHold (firstName)
                .release (firstName)
                .build ()
                .perform ();
        WebElement suggDataFR = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[4]"));
        System.out.println ("suggestion text for Ru lang: " + suggDataFR.getText ());

       // Assert.assertEquals ("Ваши личные данные понадобятся для восстановления доступа к почте с помощью паспорта, если другие способы окажутся невозможными. Поэтому имя, фамилия и дата рождения, указываемые здесь, должны совпадать с вашими паспортными данными. В противном случае никто, даже мы, не сможет помочь вам – доступ к ящику будет утерян навсегда.", suggDataFR.getText ());


        driver.findElement (By.xpath ("/html/body/div/div/header/div/div[2]/button[3]")).click ();
        driver.findElement (By.id ("id-first-name")).sendKeys ("1");
        Actions clickSuggFE = new Actions (driver);
        clickSuggFE.clickAndHold (firstName)
                .release (firstName)
                .build ()
                .perform ();
        WebElement suggDataFE = driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[4]"));

        System.out.println ("suggestion text for En lang: " + suggDataFE.getText ());
       // Assert.assertEquals (" You should add your personal information to be able to regain access to your mailbox with your ID if any other recovery options become impossible. Your first name, last name and birthdate specified here, should match those in your ID. Otherwise, this option will also become unavailable, and nobody, not even us, would be capable of recovering access to your account – your mailbox will be permanently unavailable.", suggDataFE.getText ());
    }




    @Test
    public void sendForm () {
        driver.navigate ().to ("https://accounts.ukr.net/registration");
        driver.findElement (By.id ("id-login")).sendKeys ("33445566895509876");
        driver.findElement (By.id ("id-password")).sendKeys ("безопасный");
        driver.findElement (By.id ("id-password-repeat")).sendKeys ("безопасный");
        driver.findElement (By.id ("id-first-name")).sendKeys ("r");
        driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[1]/div/div[2]/input")).sendKeys ("rr");
        driver.findElement (By.id ("id-birth-day")).sendKeys ("3");
        driver.findElement (By.className ("input-select__target")).click ();
        driver.findElement (By.className ("input-option")).click ();
        driver.findElement (By.xpath ("/html/body/div/div/main/form/section[3]/section[2]/div/div[2]/input")).sendKeys ("2001");
        driver.findElement (By.className ("verifier__text-button")).click ();

        System.out.println ("What color of unfilled fields: " + driver.findElement (By.xpath ("/html/body/div/div/main/form/section[6]/div/div/p")).getCssValue ("color"));
        System.out.println ("What text of unfilled fields: " + driver.findElement (By.xpath ("/html/body/div/div/main/form/section[6]/div/div/p")).getText ());



    }
    @Test
    public void CheckTermsIsOpenedUa () {
        driver.navigate ().to ("https://accounts.ukr.net/registration");
        String winHandleBefore = driver.getWindowHandle ();
        driver.findElement (By.linkText ("Угоди про конфіденційність")).click ();
        for (String winHandle : driver.getWindowHandles ()) {
            driver.switchTo ().window (winHandle);
        }
        String TermsUrl = driver.getWindowHandle ();
        String Url = driver.switchTo ().window (TermsUrl).getCurrentUrl ();
        WebElement Name = driver.findElement (By.xpath ("/html/body/table/tbody/tr[2]/td/div/h2"));


        Assert.assertEquals ("https://www.ukr.net/terms/", Url);
        Assert.assertEquals ("Угода про конфіденційність", Name.getAttribute ("textContent"));
    }






    @Test
    public void CheckTermsIsOpenedRu () {
        driver.navigate ().to ("https://accounts.ukr.net/registration");
        driver.findElement (By.xpath ("/html/body/div/div/header/div/div[2]/button[2]/span[1]")).click ();
        String winHandleBefore = driver.getWindowHandle ();
        driver.findElement (By.linkText ("Соглашением о конфиденциальности")).click ();
        for (String winHandle : driver.getWindowHandles ()) {
            driver.switchTo ().window (winHandle);
        }
        String TermsUrl = driver.getWindowHandle ();
        String Url = driver.switchTo ().window (TermsUrl).getCurrentUrl ();
        WebElement Name = driver.findElement (By.xpath ("/html/body/table/tbody/tr[2]/td/div/h2"));

        Assert.assertEquals ("https://www.ukr.net/ru/terms/", Url);
        Assert.assertEquals ("Соглашение о конфиденциальности", Name.getAttribute ("textContent"));
    }


        @Test
        public void CheckLogoIsCorrect ()
        {
            driver.navigate ().to ("https://accounts.ukr.net/registration");
            String originalW = driver.getWindowHandle();
            driver.findElement (By.linkText ("Угоди про конфіденційність")).click ();
            for (String winHandle : driver.getWindowHandles ()) {
                driver.switchTo ().window (winHandle);
            }
            String Logo = driver.findElement(By.xpath ("/html/body/table/tbody/tr[1]/td/div/a/img")).getAttribute ("currentSrc");


            Assert.assertEquals ("https://www.ukr.net/img/terms-logo-ua.gif", Logo);
        }


};




