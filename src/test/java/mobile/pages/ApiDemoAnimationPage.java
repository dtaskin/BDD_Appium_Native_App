package mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ApiDemoAnimationPage {
    public ApiDemoAnimationPage(AndroidDriver<AndroidElement> androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(accessibility = "Custom Evaluator")
    public AndroidElement customEvaluatorOption;

    @AndroidFindBy(accessibility = "Play")
    public AndroidElement playOption;
}
