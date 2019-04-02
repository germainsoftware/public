package com.germainsoftware.apm.testing.siebel;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import org.junit.*;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class IP13Login {

    private WebDriver driver;
    private final String HOSTNAME = "YOUR_HOSTNAME";
    private final String USERNAME = "YOUR_USERNAME";
    private final String PASSWORD = "YOUR_PASSWORD";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.CHROME);
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        for (int i = 0; i < 10; i++) {
            DateTime dt = new DateTime();
            driver = new ChromeDriver();
            driver.get(HOSTNAME + "/callcenter_enu/start.swe?SWECmd=Start&SWEHo=");
            driver.findElement(By.id("s_swepi_1")).click();
            driver.findElement(By.id("s_swepi_1")).clear();
            driver.findElement(By.id("s_swepi_1")).sendKeys(USERNAME);
            driver.findElement(By.id("s_swepi_2")).clear();
            driver.findElement(By.id("s_swepi_2")).sendKeys(PASSWORD);
            driver.findElement(By.id("s_swepi_22")).click();
            Duration duration = new Duration(dt, DateTime.now());
            System.out.println(duration.getMillis());
            driver.close();
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
