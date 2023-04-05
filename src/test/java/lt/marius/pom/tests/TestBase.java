package lt.marius.pom.tests;

import lt.marius.pom.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public abstract class TestBase {

    @BeforeTest
    public abstract void setUp();

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }
}
