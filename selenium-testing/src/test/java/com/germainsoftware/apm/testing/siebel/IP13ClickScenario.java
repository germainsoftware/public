package com.germainsoftware.apm.testing.siebel;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IP13ClickScenario {

    private WebDriver driver;
    private final String HOSTNAME = "http://10.0.1.5/callcenter_enu/";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.FIREFOX);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testKPISLAThresholdCase() throws Exception {
        long delay = 500L;
        driver.get(HOSTNAME);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scenario: login > monitoringCOnfig > KPI > User Click > User Click SLA

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_1")));
        driver.findElement(By.id("s_swepi_1")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_1")));
        driver.findElement(By.id("s_swepi_1")).sendKeys("SADMIN");
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_2")));
        driver.findElement(By.id("s_swepi_2")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_2")));
        driver.findElement(By.id("s_swepi_2")).sendKeys("SADMIN");
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_swepi_22")));
        driver.findElement(By.id("s_swepi_22")).click();
        Thread.sleep(delay);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-146")));
            driver.findElement(By.id("ui-id-146")).click();
            Thread.sleep(delay);
        } catch (NoSuchElementException e){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div[1]/ul/li[10]")));
            driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div[1]/ul/li[10]")).click();
            Thread.sleep(delay);
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("All Service Requests")));
        driver.findElement(By.linkText("All Service Requests")).click();
        Thread.sleep(delay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("1-3125860")));
        driver.findElement(By.linkText("1-3125860")).click();
        Thread.sleep(delay);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-260")));
            driver.findElement(By.id("ui-id-260")).click();
            Thread.sleep(delay);
        } catch (NoSuchElementException e){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul/li[6]")));
            driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div/div/div[6]/div/div[1]/div/div[2]/div[2]/ul/li[7]")).click();
            Thread.sleep(delay);
        }
        
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
