package PageObjectTest.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TermsPage extends Page {


    public TermsPage (WebDriver driver) {
        super (driver);
    }

    public String getTermsUrl () {
        return driver.getCurrentUrl ();
    }


    public String getNameTerms () { return wait.until (ExpectedConditions.visibilityOf (driver.findElement (By.cssSelector ("h3")))).getText (); }


    public void isTermsUrlequalTo (String termsUrl) {
        Assert.assertEquals (termsUrl, getTermsUrl ());
    }


    public void isNameTermsEqualTo (String NameTerms) {
        Assert.assertEquals (NameTerms, getNameTerms ());
    }

}
