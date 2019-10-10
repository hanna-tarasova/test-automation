package Selenium;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import java.io.File;
import java.io.IOException;

public class Listener extends AbstractWebDriverEventListener {

    public void afterNavigateRefresh(WebDriver driver) {
        // Do nothing.
    }



    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println(("Start to find element by: "+by+""));
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println(("Element was found By: "+ by +"  "));
    }



    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        System.out.println("Error "+throwable.getMessage().split(":")[0]);


        File tempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(tempFile, new File(System.currentTimeMillis() + "screen.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Screenshot captured");
    }
}

