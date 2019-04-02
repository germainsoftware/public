package com.germainsoftware.apm.testing.siebel;

import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByAll;

public class IP13Definitions {

    // Login
    static By USERNAME_FIELD = new ByAll(By.name("SWEUserName"), By.tagName("input"));
    static By PASSWORD_FIELD = new ByAll(By.name("SWEPassword"), By.tagName("input"));
    static By LOGIN_BUTTON = By.cssSelector(".loginButton a");

    // My Activities
    static By MY_ACTIVITIES_LINK = new ByAll(By.linkText("My Activities"), By.tagName("a"));
    static By MY_ACTIVITIES_NEW_BUTTON = By.cssSelector("button[title=\"Activities:New\"]");

    // Sales Orders
    static By SALES_ORDERS_TAB = new ByAll(By.partialLinkText("Sales Orders"), By.tagName("a"));
    static By SALES_ORDERS_ADD_AND_GO_BUTTON = By.cssSelector("button[title=\"Add:Add & Go\"]");

    // My Sales Orders
    static By MY_SALES_ORDERS_LINK = new ByAll(By.linkText("My Sales Orders"), By.tagName("a"));
    static By MY_SALES_ORDERS_NEW_BUTTON = By.cssSelector("button[title=\"Sales Orders:New\"]");
    static By MY_SALES_ORDERS_ORDER_TYPE_DROPDOWN = new ByAll(By.name("s_1_1_58_0"), By.tagName("input"));
    static By MY_SALES_ORDERS_ACCOUNT_INPUT = new ByAll(By.name("s_1_1_43_0"), By.tagName("input"));
    static By MY_SALES_ORDERS_LAST_NAME_INPUT = new ByAll(By.name("s_1_1_71_0"), By.tagName("input"));
    static By MY_SALES_ORDERS_LAST_NAME_ICON_INPUT = new ByAll(By.id("s_1_1_71_0_icon"), By.tagName("img"));
    static By MY_SALES_ORDERS_STATUS_INPUT = new ByAll(By.name("s_1_1_61_0"), By.tagName("input"));

    // Home Tab
    static By HOME_TAB = new ByAll(By.partialLinkText("Home"), By.tagName("a"));

    // Service Tab
    static By SERVICE_TAB = new ByAll(By.partialLinkText("Service"), By.tagName("a"));
    static By SERVICE_ADD_AND_GO_BUTTON = By.cssSelector("button[title=\"Add:Add & Go\"]");
    static By SERVICE_ACCOUNT_FIELD = new ByAll(By.name("s_6_1_14_0"), By.tagName("input"));
    static By SERVICE_LAST_NAME_ICON = new ByAll(By.id("s_6_1_15_0_icon"), By.tagName("img"));
    static By SERVICE_PRIORITY_DROPDOWN = new ByAll(By.name("s_6_1_19_0"), By.tagName("input"));

    // SR Information
    static By SERVICE_REQUEST_INFO_HEADER = new ByAll(By.id("HTML_Label_2_Label"), By.tagName("span"));

    // Person Selector Popup
    static By CONTACT_SELECTOR_OK_BUTTON = By.cssSelector("button[title=\"Pick Contact:OK\"]");
    static By CONTACT_SELECTOR_BASELINE_ROW = By.cssSelector("td[title=\"Baseline\"]");
}