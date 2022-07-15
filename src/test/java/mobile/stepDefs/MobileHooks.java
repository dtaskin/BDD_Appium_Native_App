package mobile.stepDefs;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import mobile.pages.*;
import mobile.utils.Driver;


public class MobileHooks {

    public static AndroidDriver<AndroidElement> androidDriver;
    public static ApiDemoHomePage apiDemoHomePage;
    public static ApiDemoViewsPage apiDemoViewsPage;
    public static ApiDemoGraphicsPage apiDemoGraphicsPage;
    public static ApiDemoAnimationPage apiDemoAnimationPage;
    public static ApiDemoTextPage apiDemoTextPage;

    @Before
    public void setup() throws Exception {
        androidDriver = Driver.getDriver();
        apiDemoHomePage = new ApiDemoHomePage(androidDriver);
        apiDemoViewsPage = new ApiDemoViewsPage(androidDriver);
        apiDemoGraphicsPage = new ApiDemoGraphicsPage(androidDriver);
        apiDemoAnimationPage = new ApiDemoAnimationPage(androidDriver);
        apiDemoTextPage = new ApiDemoTextPage(androidDriver);
    }

    @After
    public void tearDown() {
        Driver.quitDriver();
    }
}