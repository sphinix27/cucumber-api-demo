package cucumber.api.demo;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Then;

/**
 * APIAssertionSteps
 */
public class APIAssertionSteps {

    private Helper helper;

    public APIAssertionSteps(Helper helper) {
        this.helper = helper;
    }

    @Then("status code is {int}")
    public void statusCode(Integer statusCode) {
        assertThat(this.helper.getResponse().getStatusCode()).isEqualTo(statusCode);
    }
}