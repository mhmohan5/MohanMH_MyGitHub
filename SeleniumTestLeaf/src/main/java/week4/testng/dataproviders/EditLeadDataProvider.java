package week4.testng.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.OpenTaps;


public class EditLeadDataProvider extends OpenTaps {

	@Test(dataProvider="fetchdata")
	public void EditLeadTestCase(String fName, String cName) {

	
		//Launch the chrome browser with the Leaftaps site Login page, go to CRM/SFA page
		//logincrmsfa();
		
		//click on leads link
		clickByLink("Leads");
		
		//click on find leads
		clickByLink("Find Leads");
		
		//Enter first name
		enterByXpath("(//input[@name='firstName'])[3]", fName);
		
		//Click Find leads button
		clickByXpath("//button[text()='Find Leads']");
		
		//Click on first resulting lead
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		
		//Verify title of the page
		verifyTitle("Find Leads | opentaps CRM");
		
		
		//Click Edit
		clickByLink("Edit");
		
		//Change the company name
		enterById("updateLeadForm_companyName", cName);
		
		//Click Update
		clickByXpath("//input[@value='Update']");
		
		//Confirm the changed name appears
		verifyTextContainsById("viewLead_companyName_sp", cName);
		
		//Close the browser (Do not log out)
		//closeBrowser();
	}
	@DataProvider(name="fetchdata")
	public Object[][] getdata(){
		Object [][] data = new Object [1][2];
		data[0][0]="test";
		data[0][1]="Cognizant Tech Corp";
		return data;
	}

}
