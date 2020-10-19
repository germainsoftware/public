package com.germainsoftware.apm.testing.other;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import java.time.LocalDateTime;
import org.junit.*;
import java.time.temporal.ChronoUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CNNScenario {

    private WebDriver driver;
    private final String HOSTNAME = "https://cnn.com";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.CHROME);
    }

    @Test
    public void testKPISLAThresholdCase() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long delay = 500L;
        driver.get(HOSTNAME);
        WebDriverWait wait = new WebDriverWait(driver, 30);
       
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        } catch(Exception e){}
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SECTION[@id='intl_homepage1-zone-1']/div[2]/div/div[1]/ul/li[1]/article/a/h2")));
        driver.findElement(By.xpath("//SECTION[@id='intl_homepage1-zone-1']/div[2]/div/div[1]/ul/li[1]/article/a/h2")).click();
        Thread.sleep(delay);

        Dimension el7 = new Dimension(2048,1010);
        driver.manage().window().setSize(el7);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Stephen Collinson")));
        driver.findElement(By.linkText("Stephen Collinson")).click();
        Thread.sleep(delay);

        Dimension el8 = new Dimension(2048,1010);
        driver.manage().window().setSize(el8);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("sport")));
        driver.findElement(By.name("sport")).click();
        Thread.sleep(delay);

        Dimension el9 = new Dimension(2048,1010);
        driver.manage().window().setSize(el9);

        Dimension el10 = new Dimension(2048,1010);
        driver.manage().window().setSize(el10);

        Dimension el11 = new Dimension(2048,1010);
        driver.manage().window().setSize(el11);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//SECTION[@id='sport-zone-1']/div[2]/div[2]/div[1]/ul/li[2]/article/div/div/h3/a/span[1]")));
        driver.findElement(By.xpath("//SECTION[@id='sport-zone-1']/div[2]/div[2]/div[1]/ul/li[2]/article/div/div/h3/a/span[1]")).click();
        Thread.sleep(delay);

        Dimension el12 = new Dimension(2048,1010);
        driver.manage().window().setSize(el12);

        js.executeScript("window.scrollBy(0,884)");

        js.executeScript("window.scrollBy(0,1768)");

        js.executeScript("window.scrollBy(0,3536)");

        js.executeScript("window.scrollBy(0,5248)");

        js.executeScript("window.scrollBy(0,6560)");

        Dimension el13 = new Dimension(2048,1010);
        driver.manage().window().setSize(el13);

        Dimension el14 = new Dimension(2048,1010);
        driver.manage().window().setSize(el14);

        js.executeScript("window.scrollBy(0,7633)");

        Dimension el15 = new Dimension(2048,1010);
        driver.manage().window().setSize(el15);

        js.executeScript("window.scrollBy(0,9304)");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Destinations")));
        driver.findElement(By.linkText("Destinations")).click();
        Thread.sleep(delay);

        Dimension el16 = new Dimension(2048,1010);
        driver.manage().window().setSize(el16);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Bangkok")));
        driver.findElement(By.linkText("Bangkok")).click();
        Thread.sleep(delay);

        Dimension el17 = new Dimension(2048,1010);
        driver.manage().window().setSize(el17);

        WebElement el18 = driver.findElement(By.xpath("//DIV[@id='mount']/div/div[3]/div[2]/div/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/div[4]/div/div[1]/a/div/div/div/div/div[2]"));
        js.executeScript("arguments[0].scrollIntoView(true)", el18);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
