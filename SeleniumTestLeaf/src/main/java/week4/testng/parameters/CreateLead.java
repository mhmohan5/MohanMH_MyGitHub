package week4.testng.parameters;

import org.testng.annotations.Test;

import wrappers.OpenTapsTestng;

public class CreateLead extends OpenTapsTestng {

	@Test

	public void CreateLeadAtTest() {

		//logincrmsfa();
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "Cognizant");
		enterById("createLeadForm_firstName", "Mohan");
		enterById("createLeadForm_lastName", "MH");
		clickByClassName("smallSubmit");
		//closeBrowser();

	}

}
