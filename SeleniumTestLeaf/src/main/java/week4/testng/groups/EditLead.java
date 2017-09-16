package week4.testng.groups;

import org.testng.annotations.Test;

import wrappers.OpenTaps;


public class EditLead extends OpenTaps {

	@Test(groups = {"sanity"})
	public void EditLeadTestCase() {

	
		//Launch the chrome browser with the Leaftaps site Login page, go to CRM/SFA page
		//logincrmsfa();
		
		//click on leads link
		clickByLink("Leads");
		
		//click on find leads
		clickByLink("Find Leads");
		
		//Enter first name
		enterByXpath("(//input[@name='firstName'])[3]", "test");
		
		//Click Find leads button
		clickByXpath("//button[text()='Find Leads']");
		
		//Click on first resulting lead
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		
		//Verify title of the page
		verifyTitle("Find Leads | opentaps CRM");
		
		
		//Click Edit
		clickByLink("Edit");
		
		//Change the company name
		enterById("updateLeadForm_companyName", "Cognizant Tech Corp");
		
		//Click Update
		clickByXpath("//input[@value='Update']");
		
		//Confirm the changed name appears
		verifyTextContainsById("viewLead_companyName_sp", "Cognizant Tech Corp");
		
		//Close the browser (Do not log out)
		//closeBrowser();
	}

}
