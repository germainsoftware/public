package com.germainsoftware.apm.testing.other;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import java.time.LocalDateTime;
import org.junit.*;
import java.time.temporal.ChronoUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BBCScenario {

    private WebDriver driver;
    private final String HOSTNAME = "https://www.bbc.com/";

    @Before
    public void setUp() throws Exception {
        DriverManager mgr = new DriverManager();
        driver = mgr.getDriver(BrowserSelector.CHROME);
    }

    @Test
    public void testKPISLAThresholdCase() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long delay = 1500L;
        driver.get(HOSTNAME);
        WebDriverWait wait = new WebDriverWait(driver, 30);
       
        try{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//BUTTON[@id='bbccookies-continue-button']/span[2]")));
        driver.findElement(By.xpath("//BUTTON[@id='bbccookies-continue-button']/span[2]")).click();
        Thread.sleep(delay);
        }catch(Exception e){}
        
       js.executeScript("window.scrollBy(0,884)");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='page']/section[4]")));
        driver.findElement(By.xpath("//DIV[@id='page']/section[4]")).click();
        Thread.sleep(delay);

        js.executeScript("window.scrollBy(0,0)");

        Dimension el3 = new Dimension(2048,1010);
        driver.manage().window().setSize(el3);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Travel")));
        driver.findElement(By.linkText("Travel")).click();
        Thread.sleep(delay);

        Dimension el4 = new Dimension(2048,1010);
        driver.manage().window().setSize(el4);

        js.executeScript("window.scrollBy(0,529)");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='homepage-two-column']/div[2]/div[1]/div[2]/ul/li[1]/article/div/div/div/div[1]/div[1]/a/div/img")));
        driver.findElement(By.xpath("//DIV[@id='homepage-two-column']/div[2]/div[1]/div[2]/ul/li[1]/article/div/div/div/div[1]/div[1]/a/div/img")).click();
        Thread.sleep(delay);

        Dimension el5 = new Dimension(2048,1010);
        driver.manage().window().setSize(el5);

        js.executeScript("window.scrollBy(0,1688)");

        js.executeScript("window.scrollBy(0,2088)");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='best-of-secondary']/div/div/div/div/ul/li[3]/article/div/div/div/div[1]/div[1]/a/div/img")));
        driver.findElement(By.xpath("//DIV[@id='best-of-secondary']/div/div/div/div/ul/li[3]/article/div/div/div/div[1]/div[1]/a/div/img")).click();
        Thread.sleep(delay);

        Dimension el6 = new Dimension(2048,1010);
        driver.manage().window().setSize(el6);

        js.executeScript("window.scrollBy(0,466)");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='homepage-two-column']/div[3]/div[1]/div[2]/ul/li[1]/article/div/div/div/div[1]/div[1]/a/div/img")));
        driver.findElement(By.xpath("//DIV[@id='homepage-two-column']/div[3]/div[1]/div[2]/ul/li[1]/article/div/div/div/div[1]/div[1]/a/div/img")).click();
        Thread.sleep(delay);

        Dimension el7 = new Dimension(2048,1010);
        driver.manage().window().setSize(el7);

        js.executeScript("window.scrollBy(0,852)");

        js.executeScript("window.scrollBy(0,2571)");

        js.executeScript("window.scrollBy(0,2371)");

        js.executeScript("window.scrollBy(0,672)");

        js.executeScript("window.scrollBy(0,0)");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sport")));
        driver.findElement(By.linkText("Sport")).click();
        Thread.sleep(delay);

        Dimension el8 = new Dimension(2048,1010);
        driver.manage().window().setSize(el8);

        js.executeScript("window.scrollBy(0,33)");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Britain's Geoghegan Hart wins first Grand Tour stage to vault into Giro contention")));
        driver.findElement(By.linkText("Britain's Geoghegan Hart wins first Grand Tour stage to vault into Giro contention")).click();
        Thread.sleep(delay);

        Dimension el9 = new Dimension(2048,1010);
        driver.manage().window().setSize(el9);

        js.executeScript("window.scrollBy(0,1066)");

        js.executeScript("window.scrollBy(0,1950)");

        js.executeScript("window.scrollBy(0,2834)");

        js.executeScript("window.scrollBy(0,3482)");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Music")));
        driver.findElement(By.linkText("Music")).click();
        Thread.sleep(delay);

        Dimension el10 = new Dimension(2048,1010);
        driver.manage().window().setSize(el10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@id='root']/div[3]/main/div[1]/div[1]/div/div/div/div/div[1]/div[2]/div[3]/div/a[1]/div/div/picture/img")));
        driver.findElement(By.xpath("//DIV[@id='root']/div[3]/main/div[1]/div[1]/div/div/div/div/div[1]/div[2]/div[3]/div/a[1]/div/div/picture/img")).click();
        Thread.sleep(delay);

        js.executeScript("window.scrollBy(0,933)");

        js.executeScript("window.scrollBy(0,2500)");

        Dimension el11 = new Dimension(2048,1010);
        driver.manage().window().setSize(el11);

        js.executeScript("window.scrollBy(0,2933)");

        js.executeScript("window.scrollBy(0,3633)");

        js.executeScript("window.scrollBy(0,4133)");


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
