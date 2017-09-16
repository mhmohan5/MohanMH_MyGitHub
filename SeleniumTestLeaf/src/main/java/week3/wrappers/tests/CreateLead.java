package week3.wrappers.tests;

import org.junit.Test;

import wrappers.GenericWrappers;

public class CreateLead extends GenericWrappers {

	@Test
	
	public void CreateLeadAtTest() {

		 invokeApp("chrome","http://leaftaps.com/opentaps");
		 enterById("username", "DemoSalesManager");
		 enterById("password", "crmsfa");
		 clickByClassName("decorativeSubmit");
		 clickByLink("CRM/SFA");
		 clickByLink("Create Lead");
		 enterById("createLeadForm_companyName", "Cognizant");
		 enterById("createLeadForm_firstName", "Mohan");
		 enterById("createLeadForm_lastName", "MH");
		 clickByClassName("smallSubmit");
		 closeBrowser();
		
	}

}
