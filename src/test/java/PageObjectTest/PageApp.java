package PageObjectTest;

import PageObjectTest.Pages.Page;
import PageObjectTest.Pages.PrivacyPage;
import PageObjectTest.Pages.RegistrationPage;
import PageObjectTest.Pages.TermsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageApp {


    private WebDriver driver;
    private RegistrationPage registrationPage;
    private Page page;
    private TermsPage termsPage;
    private PrivacyPage privacyPage;

    String UrlPrivacy;

    public PageApp () {
        //WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver();
        registrationPage = new RegistrationPage (driver);
        page = new Page (driver);
        termsPage = new TermsPage (driver);
        privacyPage = new PrivacyPage (driver);
    }
    public void openRegistrationPage () {
            registrationPage.openRegistrationPage ();
    }

    public void closeTab () {
        driver.close ();
    }

    public void openUA () {
        registrationPage.setUkrLang ();
    }

    public void openRU () {
        driver.navigate().refresh();
        registrationPage.setRusLang ();
    }

    public void openEN () {
        registrationPage.setEngLang ();
    }

    public void checkPrivacyUrl (String UrlPrivacy) {
        registrationPage.clickPrivacy ();
        privacyPage.switchToSecondTab ();
        privacyPage.isPrivacyUrlEqualTo (UrlPrivacy);
        privacyPage.closeTab ();
        privacyPage.switchToFirstTab ();
    }

    public void checkPrivacyName (String NamePrivacy) {
        registrationPage.clickPrivacy ();
        privacyPage.switchToSecondTab ();
        privacyPage.isNamePrivacyEqualTo (NamePrivacy);
        privacyPage.closeTab ();
        privacyPage.switchToFirstTab ();
    }
    public void checkLogo (String Logo) {
        registrationPage.clickPrivacy ();
        privacyPage.switchToSecondTab ();
        privacyPage.getPrivacyLogo ();
        privacyPage.isLogoEqualTo (Logo);
        privacyPage.closeTab ();
        privacyPage.switchToFirstTab ();
    }

        public void checkTermsUrl (String UrlTerms){
            registrationPage.clickTerms ();
            termsPage.switchToSecondTab ();
            termsPage.isTermsUrlequalTo (UrlTerms);
            termsPage.closeTab ();
            termsPage.switchToFirstTab ();
        }


        public void checkTermsName (String NameTerms){
            registrationPage.clickTerms ();
            termsPage.switchToSecondTab ();
            termsPage.isNameTermsEqualTo (NameTerms);
            termsPage.closeTab ();
            termsPage.switchToFirstTab ();
        }

        public void refreshPage (){
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("scroll(250, 0)");
        }
    };


