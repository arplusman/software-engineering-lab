package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;
    private double result2;
    private String value3;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

    @Given("^Two input values, (-?\\d+(\\.\\d+)?) and (rvs|sqr)$")
    public void twoInputValuesOpt(int arg0, String dummy, String arg1) {
        value1 = arg0;
        value3 = arg1;
    }

    @When("^I calculate the result of this number using the operator$")
    public void iCalculateNumberUsingOperator() {
        result2 = calculator.calculate(value1, value3);
        System.out.print(result2);
    }

    @Then("^I expect the result to be (-?\\d+(\\.\\d+)?)$")
    public void iExpectTheResultToBe(double arg0, String dummy) {
        Assert.assertEquals(arg0, result2, 0);
    }


}