package com.germainsoftware.apm.testing.siebel;

import com.germainsoftware.apm.utils.BrowserSelector;
import com.germainsoftware.apm.utils.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import static com.germainsoftware.apm.testing.siebel.IP13Definitions.*;

public class IP13FullScenarioSafari {

    private WebDriver driver;
    private int timeoutSecs = 10;
    private final String HOSTNAME = "YOUR_HOSTNAME";
    private final String USERNAME = "YOUR_USERNAME";
    private final String PASSWORD = "YOUR_PASSWORD";

    @Before
    public void setUp() throws Exception {
        driver = new DriverManager().getDriver(BrowserSelector.SAFARI);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        // Adjust for your environment
        long delay = 1000L;

        // Get the login page
        LocalDateTime time1 = LocalDateTime.now();
        String base = String.format("%s/callcenter_enu/", HOSTNAME);
        driver.get(base);

        waitForElement(ExpectedConditions.visibilityOfElementLocated(USERNAME_FIELD));
        LocalDateTime time2 = LocalDateTime.now();

        // Login
        driver.findElement(USERNAME_FIELD).sendKeys(USERNAME);
        driver.findElement(PASSWORD_FIELD).sendKeys(PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();

        //	Wait for page to load
        waitForElement(ExpectedConditions.visibilityOfElementLocated(MY_ACTIVITIES_LINK));
        LocalDateTime time3 = LocalDateTime.now();

        // Navigate to Sales Orders
        driver.findElement(SALES_ORDERS_TAB).click();

        // Add & Go button
        waitForElement(ExpectedConditions.elementToBeClickable(SALES_ORDERS_ADD_AND_GO_BUTTON));
        LocalDateTime time4 = LocalDateTime.now();

        // "My Sales Orders" link
        driver.findElement(MY_SALES_ORDERS_LINK).click();

        // "New" button
        waitForElement(ExpectedConditions.elementToBeClickable(MY_SALES_ORDERS_NEW_BUTTON));
        LocalDateTime time5 = LocalDateTime.now();
        driver.findElement(MY_SALES_ORDERS_NEW_BUTTON).click();

        // "Order Type" input
        waitForElement(ExpectedConditions.elementToBeClickable(MY_SALES_ORDERS_ORDER_TYPE_DROPDOWN));
        driver.findElement(MY_SALES_ORDERS_ORDER_TYPE_DROPDOWN).clear();
        driver.findElement(MY_SALES_ORDERS_ORDER_TYPE_DROPDOWN).sendKeys("Web Order");
        Thread.sleep(delay);

        // "Account" input
        waitForElement(ExpectedConditions.elementToBeClickable(MY_SALES_ORDERS_ACCOUNT_INPUT));
        driver.findElement(MY_SALES_ORDERS_ACCOUNT_INPUT).sendKeys("12");
        Thread.sleep(delay);

        // "Last Name" input
        waitForElement(ExpectedConditions.elementToBeClickable(MY_SALES_ORDERS_LAST_NAME_INPUT));
        driver.findElement(MY_SALES_ORDERS_LAST_NAME_INPUT).clear();
        driver.findElement(MY_SALES_ORDERS_LAST_NAME_INPUT).sendKeys("Baseline");
        Thread.sleep(delay);

        driver.findElement(MY_SALES_ORDERS_LAST_NAME_ICON_INPUT).click();

        // "OK" button
        waitForElement(ExpectedConditions.visibilityOfElementLocated(CONTACT_SELECTOR_OK_BUTTON));

        // Click on record
        // Need to use actions here because there is a DIV overlaying the TD
        WebElement el = driver.findElement(CONTACT_SELECTOR_BASELINE_ROW);
        Actions actions = new Actions(driver);
        actions.moveToElement(el).click().perform();
        waitForElement(ExpectedConditions.attributeContains(CONTACT_SELECTOR_BASELINE_ROW, "class", "edit-cell"));

        // Click on OK
        driver.findElement(CONTACT_SELECTOR_OK_BUTTON).click();
        Thread.sleep(delay);

        // Status
        waitForElement(ExpectedConditions.elementToBeClickable(MY_SALES_ORDERS_STATUS_INPUT));
        driver.findElement(MY_SALES_ORDERS_STATUS_INPUT).clear();
        driver.findElement(MY_SALES_ORDERS_STATUS_INPUT).sendKeys("New");
        Thread.sleep(delay);
        LocalDateTime time6 = LocalDateTime.now();

        // NAVIGATE HOME
        driver.findElement(HOME_TAB).click();

        //	"My Activities"
        waitForElement(ExpectedConditions.visibilityOfElementLocated(MY_ACTIVITIES_LINK));
        LocalDateTime time7 = LocalDateTime.now();

        // DRILLDOWN MY ACTIVITIES
        driver.findElement(MY_ACTIVITIES_LINK).click();
        waitForElement(ExpectedConditions.elementToBeClickable(MY_ACTIVITIES_NEW_BUTTON));
        LocalDateTime time8 = LocalDateTime.now();

        // Send CTRL+S

        // NAVIGATE SERVICE
        // "Service" tab
        driver.findElement(SERVICE_TAB).click();

        // Add & Go button
        waitForElement(ExpectedConditions.elementToBeClickable(SERVICE_ADD_AND_GO_BUTTON));
        LocalDateTime time9 = LocalDateTime.now();

        // CREATE SERVICE REQUEST
        // "Account" input
        waitForElement(ExpectedConditions.elementToBeClickable(SERVICE_ACCOUNT_FIELD));
        driver.findElement(SERVICE_ACCOUNT_FIELD).sendKeys("12");
        Thread.sleep(delay);

        // "Last Name" popup
        waitForElement(ExpectedConditions.elementToBeClickable(SERVICE_LAST_NAME_ICON));
        driver.findElement(SERVICE_LAST_NAME_ICON).click();
        // "OK" button
        waitForElement(ExpectedConditions.elementToBeClickable(CONTACT_SELECTOR_OK_BUTTON));
        // Click on record
        waitForElement(ExpectedConditions.elementToBeClickable(CONTACT_SELECTOR_BASELINE_ROW));
        driver.findElement(CONTACT_SELECTOR_BASELINE_ROW).click();
        // Click on OK
        waitForElement(ExpectedConditions.elementToBeClickable(CONTACT_SELECTOR_OK_BUTTON));
        driver.findElement(CONTACT_SELECTOR_OK_BUTTON).click();
        Thread.sleep(delay);

        // "Priority" input
        waitForElement(ExpectedConditions.elementToBeClickable(SERVICE_PRIORITY_DROPDOWN));
        driver.findElement(SERVICE_PRIORITY_DROPDOWN).clear();
        driver.findElement(SERVICE_PRIORITY_DROPDOWN).sendKeys("1-ASAP");
        Thread.sleep(delay);

        // Click "Add & Go" button
        waitForElement(ExpectedConditions.elementToBeClickable(SERVICE_ADD_AND_GO_BUTTON));
        driver.findElement(SERVICE_ADD_AND_GO_BUTTON).click();

        // "SR Information"
        waitForElement(ExpectedConditions.visibilityOfElementLocated(SERVICE_REQUEST_INFO_HEADER));
        LocalDateTime time10 = LocalDateTime.now();

        System.out.println("Login page load: " + (double) ChronoUnit.MILLIS.between(time1, time2) / 1000.0);
        System.out.println("Login: " + (double) ChronoUnit.MILLIS.between(time2, time3) / 1000.0);
        System.out.println("Navigate Sales Order: " + (double) ChronoUnit.MILLIS.between(time3, time4) / 1000.0);
        System.out.println("Navigate My Sales Order: " + (double) ChronoUnit.MILLIS.between(time4, time5) / 1000.0);
        System.out.println("New Sales Order: " + (double) ChronoUnit.MILLIS.between(time5, time6) / 1000.0);
        System.out.println("Navigate Home: " + (double) ChronoUnit.MILLIS.between(time6, time7) / 1000.0);
        System.out.println("Dilldown Sales Order: " + (double) ChronoUnit.MILLIS.between(time7, time8) / 1000.0);
        System.out.println("Navigate Services: " + (double) ChronoUnit.MILLIS.between(time8, time9) / 1000.0);
        System.out.println("Create Service Request: " + (double) ChronoUnit.MILLIS.between(time9, time10) / 1000.0);
        System.out.println("Total: " + (double) ChronoUnit.MILLIS.between(time1, time10) / 1000.0);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    // Explicit wait using WebDriverWait doesn't work in Safari
    private <T> void waitForElement(ExpectedCondition<T> condition) {
        T element = null;
        LocalDateTime start = LocalDateTime.now();
        while (element == null && ChronoUnit.SECONDS.between(LocalDateTime.now(), start) < timeoutSecs) {
            try {
                element = condition.apply(driver);
            } catch (Exception e) {
                // do nothing
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e2) {
                    // do nothing
                }

            }
        }
        if (element == null) {
            throw new RuntimeException("Condition: " + condition + ", didn't pass within: " + timeoutSecs + "secs");
        }
    }
}
