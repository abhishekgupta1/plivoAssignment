package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class getRequest {

	@When("User hits the API")
	public void user_hits_the_API() {
	}

	@Given("api URL {string} , channel name {string}, and User-Token {string},")
	public void api_URL_channel_name_and_User_Token(String string, String string2, String string3) {

	}

	@Then("Verify the response received under {int} Second")
	public void verify_the_response_received_under_Second(Integer int1) {

	}

	@Then("Verify the response is in JSON Format")
	public void verify_the_response_is_in_JSON_Format() {

	}

	@Then("Verify the response is a valid Json")
	public void verify_the_response_is_a_valid_Json() {

	}

	@Then("Verify the Schema of the Response")
	public void verify_the_Schema_of_the_Response() {

	}

	@Then("Verify the property Channel-id, Channel-name, Channel-Creator in the response JSON")
	public void verify_the_property_Channel_id_Channel_name_Channel_Creator_in_the_response_JSON() {

	}

	@Then("Verify the property Already-In-Channel should be true")
	public void verify_the_property_Already_In_Channel_should_be_true() {

	}

	@Given("api URL {string} , channel new name {string}, Channel ID {string} and User-Token {string},")
	public void api_URL_channel_new_name_Channel_ID_and_User_Token(String string, String string2, String string3,
			String string4) {

	}

	@Then("Verify the property Channel-id, Channel-New-Name, Channel-Creator in the response JSON")
	public void verify_the_property_Channel_id_Channel_New_Name_Channel_Creator_in_the_response_JSON() {

	}

	@Given("api URL {string} and User-Token {string},")
	public void api_URL_and_User_Token(String string, String string2) {

	}

	@Then("Verify the channel new name {string} which is been created and check the Archived Status which should be false")
	public void verify_the_channel_new_name_which_is_been_created_and_check_the_Archived_Status_which_should_be_false(
			String string) {

	}

	@Given("api URL {string}, Channel-ID {string} and User-Token {string},")
	public void api_URL_Channel_ID_and_User_Token(String string, String string2, String string3) {

	}

	@Then("Verify the Success Response Status-Code {int}")
	public void verify_the_Success_Response_Status_Code(Integer int1) {
	}
	
	@Then("Verify the property Channel-id, Channel-Name, Channel-Creator in the response JSON")
	public void verify_the_property_Channel_id_Channel_Name_Channel_Creator_in_the_response_JSON() {
	 
	}
}
