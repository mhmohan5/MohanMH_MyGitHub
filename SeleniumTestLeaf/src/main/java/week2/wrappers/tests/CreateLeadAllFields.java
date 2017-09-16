package week2.wrappers.tests;

import org.junit.Test;

import wrappers.GenericWrappers;

public class CreateLeadAllFields extends GenericWrappers {

	@Test
	public void CreateLead() {
		
		//Launch the chrome browser with the Leaftaps site Login page
		invokeApp("chrome","http://leaftaps.com/opentaps");
		
		//Logging to the application by entering the username,password and click on Login button
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		
		//Click on CRM/SFA Link and then on Create Lead Link
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		
		//Fill the fields in the Create Lead Page
		enterById("createLeadForm_companyName", "Cognizant");
		enterById("createLeadForm_firstName", "Mohan");
		enterById("createLeadForm_lastName", "MH");
		selectVisibileTextById("createLeadForm_dataSourceId", "Cold Call");
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Automobile");		
		enterById("createLeadForm_firstNameLocal", "MohanLocal");
		enterById("createLeadForm_lastNameLocal", "MHLocal");
		enterById("createLeadForm_personalTitle", "Mr");
		enterById("createLeadForm_generalProfTitle", "MrTitle");
		enterById("createLeadForm_departmentName", "Information Technology");
		enterById("createLeadForm_annualRevenue", "2000000");
		selectVisibileTextById("createLeadForm_currencyUomId", "UYP - Uruguayan New Peso");
		selectVisibileTextById("createLeadForm_industryEnumId", "Computer Hardware");
		enterById("createLeadForm_numberEmployees", "32500");
		selectVisibileTextById("createLeadForm_ownershipEnumId", "LLC/LLP");
		enterById("createLeadForm_sicCode", "1234abcd");
		enterById("createLeadForm_tickerSymbol", "SAMPLE");
		enterById("createLeadForm_description", "This is a create lead page program");
		enterById("createLeadForm_importantNote", "Important note in importand area");
		enterById("createLeadForm_primaryPhoneCountryCode", "91");
		enterById("createLeadForm_primaryPhoneAreaCode", "44");
		enterById("createLeadForm_primaryPhoneNumber", "97907879");
		enterById("createLeadForm_primaryPhoneAskForName", "MHMohan");
		enterById("createLeadForm_primaryPhoneExtension", "123");
		enterById("createLeadForm_primaryEmail", "accessmodifiers.testleaf@accessmodifiers.testleaf.com");
		enterById("createLeadForm_primaryWebUrl", "http://accessmodifiers.testleaf.com");
		enterById("createLeadForm_generalToName", "MohanMH");
		enterById("createLeadForm_generalAttnName", "MH");
		enterById("createLeadForm_generalAddress1", "Ruby apts");
		enterById("createLeadForm_generalAddress2", "David Ngr");
		enterById("createLeadForm_generalCity", "CHN");
		selectVisibileTextById("createLeadForm_generalCountryGeoId", "India");
		selectVisibileTextById("createLeadForm_generalStateProvinceGeoId","TAMILNADU" );
		enterById("createLeadForm_generalPostalCode", "6000");
		enterById("createLeadForm_generalPostalCodeExt", "63");
		
		//Click on createLead Button		
		clickByClassName("smallSubmit");
		
		String firstname = getTextById("viewLead_firstName_sp");
		System.out.println("This is the first name of the Lead created : "+firstname);
	}

}
