package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepsDefinition {
    @When("enter the page url")
    public void enter_the_page_url() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" Enter the page Url");

    }

    @Given("click on Google")
    public void click_on_google() {
        System.out.println(" Click on google");
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("page has to load")
    public void page_has_to_load() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" Web page loaded");

        throw new io.cucumber.java.PendingException();
    }

    @When("enter a text")
    public void enter_a_text() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" Enter a text");

        throw new io.cucumber.java.PendingException();
    }

    @Then("give a list of search results")
    public void give_a_list_of_search_results() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" Search  results displayed");

        throw new io.cucumber.java.PendingException();
    }

    @Given("Click on Google")
    public void clickOnGoogle() {
        System.out.println(" Print 1");
    }

    @Then("Page has to load")
    public void pageHasToLoad() {
        System.out.println(" Print 2");
    }

    @When("Enter a text")
    public void enterAText() {
        System.out.println(" Print 3");
    }

    @Then("Show list of search results")
    public void showListOfSearchResults() {
        System.out.println(" Print 4");
    }
}
