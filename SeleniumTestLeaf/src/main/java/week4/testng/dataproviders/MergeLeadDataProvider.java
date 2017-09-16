package week4.testng.dataproviders;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.OpenTaps;


public class MergeLeadDataProvider extends OpenTaps {

	@Test( dataProvider="fetchdata", timeOut=20000)
	public void MergeLeadAtTest(String fromId, String toId) {

		
		//Click on Leads Link
		clickByXpath("(//a[contains(text(),'Leads')])[1]");

		//Click on merge leads link and clik on Lookup icon near from lead field
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt=\"Lookup\"])[1]");

		//Switch to new window opened
		switchToLastWindow();

		//Fill the fields int the merge lead window
		enterByXpath("//input[@class=' x-form-text x-form-field']", fromId);
		clickByXpath("//button[text()='Find Leads']");

		//click the first result from the search results
		clickByXpathNoSnap("(//a[contains(text(),'"+fromId+"')])[1]");

		//go to the parent window
		switchToParentWindow();

		//get the text from from lead text box
		String fromid =  getTextFromTextBoxById("ComboBox_partyIdFrom");

		//Click on the look up icon near 'To Lead'
		clickByXpath("(//img[@alt='Lookup'])[2]");

		//Switch to the new window opened
		switchToLastWindow();

		//Fill the fields int the merge lead window
		enterByXpath("//input[@class=' x-form-text x-form-field']", toId);
		clickByXpath("//button[text()='Find Leads']");

		//click the first result from the search results
		clickByXpathNoSnap("(//a[contains(text(),'"+toId+"')])[1]");

		//go to the parent window
		switchToParentWindow();

		//click on merge button
		clickByLinkNoSnap("Merge");

		//Accept the alert
		acceptAlert();

		//click on find leads
		clickByLink("Find Leads");

		//enter the from lead id extracted in the from lead id field
		enterByXpath("//input[@name='id']", fromid);

		//click on find leads button
		clickByXpath("//button[contains(text(),'Find Leads')]");

		//Test Case Validation
		String searchresultinfo =  getTextByClass("x-paging-info");
		String validation = "No records to display";
		if(validation.equals(searchresultinfo))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}

		//close the browser
		
		
		//closeBrowser();
		//verifyTextContainsByXpath("//div[text()='No records to display']", "No records to display");
	}
	@DataProvider(name = "fetchdata")
	public Object[][] getdata(){
		Object[][] data = new Object[1][2];
		data[0][0]="1";
		data[0][1]="5";
		return data;
	}
	
}
