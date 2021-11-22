package tests.stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {

    @Given("^Open main page (.*)$")
    public void openMainPage(String url) {
        open(url);
    }

    @Then("^Check a page header should be (.*)$")
    public void checkAPageHeaderShouldBeTextToValidate(String text) {
        $("h1").shouldHave(Condition.text(text));
    }
}
