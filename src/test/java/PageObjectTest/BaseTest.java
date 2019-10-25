package PageObjectTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseTest {
    static PageApp page;

    @BeforeClass
        public static void startApp() {
            page = new PageApp();
            page.openRegistrationPage();
        }

        @AfterClass
        public static void stopApp()
        {
            page.closeTab();
        }
    }





