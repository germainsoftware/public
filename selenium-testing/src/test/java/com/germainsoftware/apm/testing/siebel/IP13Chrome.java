package com.germainsoftware.apm.testing.siebel;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import java.time.temporal.ChronoUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IP13Chrome {

    private WebDriver driver;
    private boolean acceptNextAlert = true;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", IP13Chrome.class.getClassLoader().getResource("chromedriver.exe").getPath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        long delay = 0L;

        // Adjust for your environment
        
        // Get the login page
        String base = String.format("http://%s/callcenter_enu/", "YOUR_SERVER_HOSTNAME");
        driver.get(base);

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='SWEUserName']")));

        // LOGIN BEGIN
        // Search for username / password input and fill the inputs
        driver.findElement(By.xpath("//input[@name='SWEUserName']")).sendKeys("SADMIN");
        driver.findElement(By.xpath("//input[@name='SWEPassword']")).sendKeys("SADMIN");
        driver.findElement(By.id("s_swepi_22")).click();
        //	"My Activities"
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_5_1_22_0_mb")));
        LocalDateTime start =  LocalDateTime.now();
        // NAVIGATE SALES ORDER
        // "Sales Orders" tab
        driver.findElement(By.partialLinkText("Sales Orders")).click();

        // Add & Go button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("s_2_1_9_0_Ctrl")));

        // DRILLDOWN MY SALES ORDERS 
        // "My Sales Orders" link
        driver.findElement(By.id("s_4_2_19_0_mb")).click();
        // "New" button 
        wait.until(ExpectedConditions.elementToBeClickable(By.id("s_1_1_92_0_Ctrl")));

        // NEW SALES ORDER 
        // "New" button 
        //driver.findElement(By.id("s_1_1_92_0_Ctrl")).click();

        // "Order Type" input
        //wait.until(ExpectedConditions.elementToBeClickable(By.name("s_1_1_58_0")));
        //driver.findElement(By.name("s_1_1_58_0")).clear();
        //driver.findElement(By.name("s_1_1_58_0")).sendKeys("Web Order");
        //Thread.sleep(delay);

        // "Account" input 
        //wait.until(ExpectedConditions.elementToBeClickable(By.name("s_1_1_43_0")));
        //driver.findElement(By.name("s_1_1_43_0")).sendKeys("12");
        //Thread.sleep(delay);

        // "Last Name" input
        //wait.until(ExpectedConditions.elementToBeClickable(By.name("s_1_1_71_0")));
        //driver.findElement(By.name("s_1_1_71_0")).clear();
        //driver.findElement(By.name("s_1_1_71_0")).sendKeys("Baseline");
        Thread.sleep(delay);

        // driver.findElement(By.id("s_1_1_71_0_icon")).click();
        // "OK" button 
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Pick Contact:OK']")));
        // Click on record
        // Need to use actions here because there is a DIV overlaying the TD
        //WebElement el = driver.findElement(By.xpath("//td[@title='Baseline']"));
        //Actions actions = new Actions(driver);
        //actions.moveToElement(el).click().perform();
        //wait.until(ExpectedConditions.attributeContains(By.xpath("//td[@title='Baseline']"), "class", "edit-cell"));
        // Click on OK
        //driver.findElement(By.xpath("//button[@title='Pick Contact:OK']")).click();
        //Thread.sleep(delay);
        // Status 
        //wait.until(ExpectedConditions.elementToBeClickable(By.name("s_1_1_61_0")));
        //driver.findElement(By.name("s_1_1_61_0")).clear();
        //driver.findElement(By.name("s_1_1_61_0")).sendKeys("New");
        //Thread.sleep(delay);

        // Send CTRL+S
        //driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "s"));

        // NAVIGATE HOME
        // "Home" tab
        driver.findElement(By.partialLinkText("Home")).click();
        //	"My Activities"
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_5_1_22_0_mb")));

        // DRILLDOWN MY ACTIVITIES
        // "My Activities" link
        driver.findElement(By.id("s_5_1_22_0_mb")).click();
        // "New" button 
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Activity:New']")));


        // Send CTRL+S

        // NAVIGATE SERVICE
        // "Service" tab
        driver.findElement(By.partialLinkText("Service")).click();

        // Add & Go button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("s_6_1_7_0_Ctrl")));

        // CREATE SERVICE REQUEST
        // "Account" input 
        wait.until(ExpectedConditions.elementToBeClickable(By.name("s_6_1_14_0")));
        driver.findElement(By.name("s_6_1_14_0")).sendKeys("12");
        Thread.sleep(delay);

        // "Last Name" popup
        wait.until(ExpectedConditions.elementToBeClickable(By.id("s_6_1_15_0_icon")));
        driver.findElement(By.id("s_6_1_15_0_icon")).click();
        // "OK" button 
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Pick Contact:OK']")));
        // Click on record
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@title='Baseline']")));
        driver.findElement(By.xpath("//td[@title='Baseline']")).click();
        // Click on OK
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Pick Contact:OK']")));
        driver.findElement(By.xpath("//button[@title='Pick Contact:OK']")).click();
        Thread.sleep(delay);

        // "Priority" input
        wait.until(ExpectedConditions.elementToBeClickable(By.name("s_6_1_19_0")));
        driver.findElement(By.name("s_6_1_19_0")).clear();
        driver.findElement(By.name("s_6_1_19_0")).sendKeys("1-ASAP");
        Thread.sleep(delay);

        // Click "Add & Go" button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("s_6_1_7_0_Ctrl")));
        driver.findElement(By.id("s_6_1_7_0_Ctrl")).click();

        // "SR Information"
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("HTML_Label_2_Label")));

        // NAVIGATE TO HOME 
        // "Home" tab
        driver.findElement(By.partialLinkText("Home")).click();

        //	"My Activities"
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_5_1_22_0_mb")));

        // LOGOUT
        String logout = Keys.chord(Keys.CONTROL, Keys.SHIFT, "x");
        driver.findElement(By.tagName("html")).sendKeys(logout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='SWEUserName']")));
        long diff = ChronoUnit.MILLIS.between(start, LocalDateTime.now());
        System.out.println( (double)diff / 1000.0);
        
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
