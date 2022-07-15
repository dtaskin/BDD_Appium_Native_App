package mobile.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NotFoundException;

import static org.junit.Assert.*;

import static mobile.stepDefs.MobileHooks.*; // import this so you can use mobilehooks class without class name

public class ApiDemoStepDefs {

    @Given("user gets text of {string} option")
    public void userGetsTextOfOption(String text) {
        switch (text) {
            case "Accessibility":
                assertTrue(apiDemoHomePage.accessibilityOption.isDisplayed());
                break;
            case "Views":
                assertTrue(apiDemoHomePage.viewsOption.isDisplayed());
                break;
            default:
                throw new NotFoundException("Link text is not spelled correctly");
        }
    }

    @Then("user validates that it is {string}")
    public void userValidatesThatItIs(String expectedOptionText) {
        switch (expectedOptionText) {
            case "Accessibility":
                assertEquals(expectedOptionText, apiDemoHomePage.accessibilityOption.getText());
                break;
            case "Views":
                assertEquals(expectedOptionText, apiDemoHomePage.viewsOption.getText());
                break;
            default:
                throw new NotFoundException("Text is not spelled correctly");
        }
    }

    @Given("user taps on {string}")
    public void userTapsOn(String elementText) {
        switch (elementText) {
            case "Accessibility":
                apiDemoHomePage.accessibilityOption.click();
                break;
            case "Views":
                apiDemoHomePage.viewsOption.click();
                break;
            case "Animation":
                apiDemoViewsPage.animationOption.click();
                break;
            case "Shake":
                apiDemoViewsPage.shakeOption.click();
                break;
            case "Custom Evaluator":
                apiDemoAnimationPage.customEvaluatorOption.click();
                break;
            case "Graphics":
                apiDemoHomePage.graphicsOption.click();
                break;
            case "Text":
                apiDemoHomePage.textOption.click();
                break;
            case "LogTextBox":
                apiDemoTextPage.logTextBoxOption.click();
                break;
            case "Add":
                apiDemoTextPage.addOption.click();
                break;
            case "Do nothing":
                apiDemoTextPage.doNothingButton.click();
            default:
                throw new NotFoundException("Text is not spelled correctly");

        }
    }

    @Then("user should be able to see {string}")
    public void userShouldBeAbleToSee(String expectedElementText) {
        assertEquals(expectedElementText, apiDemoHomePage.customView.getText());
    }

//    @Given("user taps on Views")
//    public void userTapsOnViews() {
//        apiDemoHomePage.viewsOption.click();
//    }

//    @And("user taps on Animation")
//    public void userTapsOnAnimation() {
//        apiDemoViewsPage.animationOption.click();
//    }

//    @And("user taps on Shake")
//    public void userTapsOnShake() {
//        apiDemoViewsPage.shakeOption.click();
//    }

    @Then("user should be able to see input box")
    public void userShouldBeAbleToSeeInputBox() {
        assertTrue(apiDemoViewsPage.passwordInputBox.isDisplayed());
    }

    @Given("user gets texts of all options and validates them")
    public void userGetsTextsOfAllOptionsAndValidatesThem(DataTable allExpectedOptions) {
        for (int i = 0; i < allExpectedOptions.asList().size(); i++) {
            assertEquals(allExpectedOptions.asList().get(i), apiDemoHomePage.allMainMenuOptions.get(i).getText());
        }
    }

    @Then("user validates that {string} is visible")
    public void userValidatesThatIsVisible(String text) {
        assertTrue(apiDemoGraphicsPage.arcsOption.isDisplayed());
    }

    @Then("user should see Play Button")
    public void userShouldSeePlayButton() {
        assertTrue(apiDemoAnimationPage.playOption.isDisplayed());
    }

    @Then("user validates options are displayed")
    public void userValidatesOptionsAreDisplayed(DataTable dataTable) {
        for (int i = 0; i < dataTable.asList().size(); i++) {
            assertTrue(apiDemoTextPage.testPageOptions.get(i).isDisplayed());
        }
    }

    @And("user validates the message is {string}")
    public void userValidatesTheMessageIs(String sentence) {
        assertEquals(sentence, apiDemoTextPage.testText.getText());
    }
}