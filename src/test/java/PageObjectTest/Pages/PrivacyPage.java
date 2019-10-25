package PageObjectTest.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PrivacyPage extends Page {
    public PrivacyPage (WebDriver driver) {
        super (driver);
    }

    public String getPrivacytUrl () {
        return driver.getCurrentUrl ();
    }

    public String getPrivacyLogo () {
        return wait.until (ExpectedConditions.visibilityOf (driver.findElement (By.cssSelector ("img")))).getAttribute ("src");
    }


    public String getNamePrivacy () {
        return wait.until (ExpectedConditions.visibilityOf (driver.findElement (By.cssSelector ("h2")))).getText ();
    }

    public void isPrivacyUrlEqualTo (String privacyUrl) {
        Assert.assertEquals (privacyUrl, getPrivacytUrl ());
    }

    public void isLogoEqualTo (String Logo) {
        Assert.assertEquals (Logo, getPrivacyLogo ());
    }

    public void isNamePrivacyEqualTo (String NamePrivacy) {
        Assert.assertEquals (NamePrivacy, getNamePrivacy ());
    }
}










