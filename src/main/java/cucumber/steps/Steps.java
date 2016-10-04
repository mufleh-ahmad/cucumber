package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^test$")
	public void testStep() {
		System.out.println("Guru is dhakkan");
	}
	
	@When("^I am doing this$")
	public void i_am_doing_this() throws Throwable {
	    System.out.println("why");
	}
	
	

}
