package mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ApiDemoTextPage {
    public ApiDemoTextPage(AndroidDriver<AndroidElement> androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(id = "android:id/list")
    public List<AndroidElement> testPageOptions;

    @AndroidFindBy (accessibility = "LogTextBox")
    public AndroidElement logTextBoxOption;

    @AndroidFindBy (accessibility = "Add")
    public AndroidElement addOption;

    @AndroidFindBy (id = "io.appium.android.apis:id/text")
    public AndroidElement testText;

    @AndroidFindBy (accessibility = "Do nothing")
    public AndroidElement doNothingButton;



}
