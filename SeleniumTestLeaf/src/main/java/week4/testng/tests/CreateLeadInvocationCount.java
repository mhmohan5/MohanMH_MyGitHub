package week4.testng.tests;

import org.testng.annotations.Test;

import wrappers.OpenTaps;

public class CreateLeadInvocationCount extends OpenTaps {
	@Test(invocationCount=2)
	//@Test(invocationCount = 2, invocationTimeOut = 120000)

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
