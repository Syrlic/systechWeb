package tests.stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class MyStepdefs {

    @Given("^Open main page (.*)$")
    public void openMainPage(String url) {
        open(url);
    }

    @Then("^Check a page header should be (.*)$")
    public void checkPageHeader(String text) {
        $("h1").shouldHave(Condition.text(text));
    }

    @When("Open vacancy submenu page")
    public void openSubmenuPage() {
        $$(".main_menu_item").get(7).hover().$$("a").get(2).click();
    }

    @When("^Look for vacancy (.*)$")
    public void overlookCurrentVacancy(String vacancy) {
     //   $$("section").get(2).$(withText(vacancy)).click();
        $$("section").find(Condition.text(vacancy)).click();
    }

    @When("Click on link")
    public void clickOnLink() {
        $$("li.services_nav_item").find(Condition.text("Отправить резюме")).click();
    }

    @Then("^Check that popup form contains header (.*)$")
    public void checkThatPopupFormContainsHeaderTextValidate(String header) {
        $("#resumePopup_24112").shouldHave(Condition.text(header));
        sleep(5000);
    }
}
