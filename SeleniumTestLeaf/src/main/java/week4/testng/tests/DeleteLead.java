package week4.testng.tests;

import org.testng.annotations.Test;

import wrappers.OpenTaps;

public class DeleteLead extends OpenTaps {

	@Test
	public void DeleteLeadTestCase() {

	
		//Launch the chrome browser with the Leaftaps site Login page, go to CRM/SFA page
		//logincrmsfa();
		
		//click on leads link
		clickByLink("Leads");
		
		//click on find leads
		clickByLink("Find Leads");
		
		//Click on Phone
		clickByXpath("//span[text()='Phone']");

		//Enter phone number
		enterByXpath("//input[@name='phoneNumber']", "9");
		
		//Click Find leads button
		clickByXpath("//button[text()='Find Leads']");
		 
		//Capture lead ID of First Resulting lead
		String capturedId=getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");

		//Click on first resulting lead
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		
		//Verify title of the page
		verifyTitle("Find Leads | opentaps CRM");
		
		//Click Delete
		clickByLink("Delete");
		
		//click on find leads
		clickByLink("Find Leads");
		
		//Enter captured lead ID
	    //enterByXpath("//input[@name='id']", capturedId);
		enterByName("id", capturedId);
		
		//Click Find leads button
		clickByXpath("//button[text()='Find Leads']");

		//Verify error msg
		verifyTextByXpath("//div[text()='No records to display']", "No records to display");

		//Close the browser (Do not log out)
		//closeBrowser();
	}

}
