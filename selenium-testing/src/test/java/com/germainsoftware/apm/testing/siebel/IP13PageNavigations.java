package com.germainsoftware.apm.testing.siebel;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import org.junit.*;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IP13PageNavigations {

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
            driver = new ChromeDriver();
            driver.get(HOSTNAME + "/callcenter_enu/start.swe?SWECmd=Start&SWEHo=");
            driver.findElement(By.id("s_swepi_1")).click();
            driver.findElement(By.id("s_swepi_1")).clear();
            driver.findElement(By.id("s_swepi_1")).sendKeys(USERNAME);
            driver.findElement(By.id("s_swepi_2")).clear();
            driver.findElement(By.id("s_swepi_2")).sendKeys(PASSWORD);
            driver.findElement(By.id("s_swepi_22")).click();
            DateTime dt = new DateTime();
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Stage Execution")));
            driver.findElement(By.linkText("Stage Execution")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Charges")));
            driver.findElement(By.linkText("Charges")).click();
            WebElement el = driver.findElement(By.linkText("Opportunities"));
            Actions actions = new Actions(driver);
            actions.moveToElement(el).click().perform();
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Quotes")));
            WebElement el1 = driver.findElement(By.linkText("Explorer"));
            actions = new Actions(driver);
            actions.moveToElement(el1).click().perform();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Quotes")));
            el = driver.findElement(By.linkText("Quotes"));
            actions = new Actions(driver);
            actions.moveToElement(el).click().perform();
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
