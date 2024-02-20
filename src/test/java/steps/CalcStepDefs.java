package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalcStepDefs {

    @Given("^get firstnumber$")
    public void getFistNumber() {
            System.out.println("Number1");
    }

    @Then("get secondnumber")
    public void getSecondnumber() {
        System.out.println("Number2");
    }

    @When("clicked plus button")
    public void clickedPlusButton() {
        System.out.println("clicked plus");

    }

    @Then("add firsttnumber and secondnumber")
    public void addFirsttnumberAndSecondnumber() {
        System.out.println("Numbers added");
    }

    @When("clicked minus button")
    public void clickedMinusButton() {
        System.out.println("Clicked minus");
    }

    @Then("subtract secondnumber from firstnumber")
    public void subtractSecondnumberFromFirstnumber() {
        System.out.println("Numbers subtracted");
    }
}
