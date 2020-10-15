package com.germainsoftware.apm.testing.dashboard;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import java.time.LocalDateTime;
import org.junit.*;
import java.time.temporal.ChronoUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigConsoleScenario {

    private WebDriver driver;
    private final String HOSTNAME = "http://localhost:8080/germainapm/config/s/";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.CHROME);
    }

    @Test
    public void testKPISLAThresholdCase() throws Exception {
        long delay = 500L;
        driver.get(HOSTNAME);
        // scenario: login > monitoringCOnfig > KPI > User Click > User Click SLA

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("admin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("admin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
        driver.findElement(By.cssSelector(".btn.btn-success")).click();
        Thread.sleep(delay);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("monitoringConfig")));
        driver.findElement(By.linkText("monitoringConfig")).click();
        Thread.sleep(delay);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("keyPerformanceIndicators")));
        driver.findElement(By.linkText("keyPerformanceIndicators")).click();
        Thread.sleep(delay);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("User Click")));
        driver.findElement(By.linkText("User Click")).click();
        Thread.sleep(delay);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("serviceLevelAgreements (1)")));
        driver.findElement(By.linkText("serviceLevelAgreements (1)")).click();
        Thread.sleep(delay);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("User Click SLA [0]")));
        driver.findElement(By.linkText("User Click SLA [0]")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
