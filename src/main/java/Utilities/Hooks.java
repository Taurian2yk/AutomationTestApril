package Utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    BrowserDriver browserDriver = new BrowserDriver();

    @Before
    public void beforeTest()
    {
        browserDriver.openBrowser();
    }

    @After
    public void afterTest()
    {
        browserDriver.closeBrowser();
    }

}
