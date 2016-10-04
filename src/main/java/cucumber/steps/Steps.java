package cucumber.steps;

import cucumber.api.java.en.Given;

public class Steps {

	@Given("^test$")
	public void testStep() {
		System.out.println("Guru is dhakkan");
	}
}
