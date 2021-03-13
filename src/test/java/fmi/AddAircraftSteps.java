package fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screenmodel.AddAircraftScreenModel;

public class AddAircraftSteps {

	
	public AddAircraftScreenModel model = new AddAircraftScreenModel();
	
	@Given("^Потребителят се намира на прозореца за добавяне на самолети$")
	public void потребителят_се_намира_на_прозореца_за_добавяне_на_самолети() throws Throwable {
		model.navigateToMe();
	}

	@When("^Потребителят въведе номер на опашка на самолет \"([^\"]*)\"$")
	public void потребителят_въведе_номер_на_опашка_на_самолет(String arg1) throws Throwable {
		model.setTailNumber(arg1);
	}

	@When("^Потребителят въведе тип на самолета \"([^\"]*)\"$")
	public void потребителят_въведе_тип_на_самолета(String arg1) throws Throwable {
		model.setAircraftType(arg1);
	}

	@When("^Потребителят въведе капацитет на екипажа (\\d+)$")
	public void потребителят_въведе_капацитет_на_екипажа(int arg1) throws Throwable {
		model.setPaxCapacity(String.valueOf(arg1));
	}

	@When("^Потребителят въведе капацитет на товар (\\d+)$")
	public void потребителят_въведе_капацитет_на_товар(int arg1) throws Throwable {
		model.setCargoCapicity(String.valueOf(arg1));
	}

	@When("^Потребителят натиска бутона за добавяне на самолет$")
	public void потребителят_натиска_бутона_за_добавяне_на_самолет() throws Throwable {
		model.clickCreateButton();
	}

	@Then("^Подскача съобщение \"([^\"]*)\"$")
	public void подскача_съобщение(String arg1) throws Throwable {
		final String resultMessage = model.getCreateMessage();
		assertEquals(arg1, resultMessage);
	}

}
