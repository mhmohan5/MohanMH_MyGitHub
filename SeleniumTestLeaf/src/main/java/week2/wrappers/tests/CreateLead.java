package week2.wrappers.tests;

import wrappers.GenericWrappers;

public class CreateLead {

	public static void main(String[] args) {
		
		GenericWrappers gw = new GenericWrappers();
		gw.invokeApp("chrome","http://leaftaps.com/opentaps");
		gw.enterById("username", "DemoSalesManager");
		gw.enterById("password", "crmsfa");
		gw.clickByClassName("decorativeSubmit");
		gw.clickByLink("CRM/SFA");
		gw.clickByLink("Create Lead");
		gw.enterById("createLeadForm_companyName", "Cognizant");
		gw.enterById("createLeadForm_firstName", "Mohan");
		gw.enterById("createLeadForm_lastName", "MH");
		gw.clickByClassName("smallSubmit");
		
	}

}
