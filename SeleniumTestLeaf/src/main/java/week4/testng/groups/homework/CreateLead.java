package week4.testng.groups.homework;

import org.testng.annotations.Test;

import wrappers.OpenTaps;

public class CreateLead extends OpenTaps {

	@Test(groups = {"smoke"})

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
