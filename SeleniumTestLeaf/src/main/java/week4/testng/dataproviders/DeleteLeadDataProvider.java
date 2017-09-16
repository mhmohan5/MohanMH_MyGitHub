package week4.testng.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.OpenTaps;

public class DeleteLeadDataProvider extends OpenTaps {

	@Test(dataProvider="fetchdata")
	public void DeleteLeadTestCase(String searchText) {

	
		//Launch the chrome browser with the Leaftaps site Login page, go to CRM/SFA page
		//logincrmsfa();
		
		//click on leads link
		clickByLink("Leads");
		
		//click on find leads
		clickByLink("Find Leads");
		
		//Click on Phone
		clickByXpath("//span[text()='Phone']");

		//Enter phone number
		enterByXpath("//input[@name='phoneNumber']", searchText);
		
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
	@DataProvider(name = "fetchdata")
	public Object[][] getdata(){
	
	Object[][] data = new Object[1][1];
	data[0][0]="9";
	return data;		
	}

}
