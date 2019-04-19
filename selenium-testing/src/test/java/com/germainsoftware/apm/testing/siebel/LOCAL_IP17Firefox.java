package com.germainsoftware.apm.testing.siebel;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IP17Chrome {
  private WebDriver driver;
  private boolean acceptNextAlert = true;

  
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", IP17Chrome.class.getClassLoader().getResource("chromedriver.exe").getPath());
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
        driver = new ChromeDriver();
      
        // Adjust for your environment
        //String type = "Siebel:Performance OOTB";
        //String userAgent = "IE";
        //String hostname = "10.0.1.5";
        //context.system.name = "WIN-J76SB3D1VCD";
        //context.system.hostname = "WIN-J76SB3D1VCD";

        // Get the login page
        String base = String.format("https://10.0.1.18/siebel/app/callcenter/enu?SWECmd=Login&SWEPL=1&SRN=&SWETS=1553866279558", "10.0.1.18");
        driver.get(base);

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 130);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='SWEUserName']")));

        // LOGIN BEGIN
        /*
        UserClick tx = new UserClick();
        tx.type = type; 
        tx.userAgent.family = userAgent; tx.target.hostname = hostname;
        tx.name = "Login";
        tx.timestamp = LocalDateTime.now();
        */
        // Search for username / password input and fill the inputs
        driver.findElement(By.xpath("//input[@name='SWEUserName']")).clear();
        driver.findElement(By.xpath("//input[@name='SWEUserName']")).sendKeys("SADMIN");
        driver.findElement(By.xpath("//input[@name='SWEPassword']")).clear();
        driver.findElement(By.xpath("//input[@name='SWEPassword']")).sendKeys("ip2017");
        driver.findElement(By.id("s_swepi_22")).click();
        //	"My Activities"
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Activities")));
/*
        tx.success = true;
        tx.duration = DateTimeUtils.computeDuration(tx.timestamp, LocalDateTime.now());
        datamart.insert(tx, context);
*/
        // NAVIGATE activities
/*
        tx = new UserClick();
        tx.type = type; 
        tx.userAgent.family = userAgent; tx.target.hostname = hostname;
        tx.name = "Navigate Activities";
        tx.timestamp = LocalDateTime.now();
*/

        // "Activities" tab
        driver.findElement(By.partialLinkText("Activities")).click();

        // Add button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("s_2_1_24_0_Ctrl")));
/*
        tx.success = true;
        tx.duration = DateTimeUtils.computeDuration(tx.timestamp, LocalDateTime.now());
        datamart.insert(tx, context);
*/

        // new activity
/*
        tx = new UserClick();
        tx.type = type; 
    `        tx.userAgent.family = userAgent; tx.target.hostname = hostname;
        tx.name = "New Activity";
        tx.timestamp = LocalDateTime.now();
*/
        // "Add activity" link
        driver.findElement(By.id("s_2_1_24_0_Ctrl")).click();
        // "New" button 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s_2_2_81_0_icon")));
/*
        tx.success = true;
        tx.duration = DateTimeUtils.computeDuration(tx.timestamp, LocalDateTime.now());
        datamart.insert(tx, context);
*/
        // drilldown to activity
/*
        tx = new UserClick();
        tx.type = type; 
        tx.userAgent.family = userAgent; tx.target.hostname = hostname;
        tx.name = "Drilldown Activity";
        tx.timestamp = LocalDateTime.now();
*/
        // click on "Appointment type"
        driver.findElement(By.partialLinkText("Appointment")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//**[@id='s_1_1_36_0_icon']")));
  
        
/*
        
        tx.success = true;
        tx.duration = DateTimeUtils.computeDuration(tx.timestamp, LocalDateTime.now());
        datamart.insert(tx, context);
*/

        // click open assgined to 
/*
        tx = new UserClick();
        tx.type = type; 
        tx.userAgent.family = userAgent; tx.target.hostname = hostname;
        tx.name = "Activity Assigned To";
        tx.timestamp = LocalDateTime.now();
*/
        driver.findElement(By.id("s_1_1_36_0_icon")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-180")));

        driver.findElement(By.xpath("//**[@title='Pick Assigned To:Cancel']")).click();
/*
        tx.success = true;
        tx.duration = DateTimeUtils.computeDuration(tx.timestamp, LocalDateTime.now());
        datamart.insert(tx, context);
*/
        // open menu and navigate to SR
        driver.findElement(By.id("s_1_1_36_0_icon")).click();
        driver.findElement(By.xpath("//**[@title='First Level View Bar']")).click();

  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
  
 
  
}
