package week4.testng.groups;

import org.testng.annotations.Test;

import wrappers.OpenTaps;

public class CreateLeadFail extends OpenTaps {

	@Test(groups = {"smoke1"})

	public void CreateLeadAtTest() {

		//logincrmsfa();
		clickByLink("Create Lead1");
		enterById("createLeadForm_companyName", "Cognizant");
		enterById("createLeadForm_firstName", "Mohan");
		enterById("createLeadForm_lastName", "MH");
		clickByClassName("smallSubmit");
		//closeBrowser();

	}

}
