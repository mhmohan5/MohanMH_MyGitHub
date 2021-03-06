package week4.testng.parameters;

import org.testng.annotations.Test;

import wrappers.OpenTapsTestng;

public class DuplicateLead extends OpenTapsTestng {

	@Test
	public void DuplicateLeadClass() {

		//logincrmsfa();

		//Click  on Leads Link
		clickByXpath("(//a[contains(text(),'Leads')])[1]");

		//click on find leads
		clickByLink("Find Leads");

		//click on the email tab in find lead section
		clickByXpath("(//span[@class='x-tab-strip-text '])[3]");

		//Enter the email address in the email addresss field
		enterByXpath("//input[@name='emailAddress']", "test");

		//click on find leads button
		clickByXpath("//button[text()='Find Leads']");

		//capture the first name and last name of the first result in the search results
		String firstName = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]");
		String lastName = getTextByXpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-lastName '])[1]");

		//Click the first lead id in the search results
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");

		//click on duplicate lead button and capture the duplicate id header, validate the same with the expected header
		clickByLink("Duplicate Lead");
		String duplicateLeadHeader = getTextByXpath("//div[text()='Duplicate Lead']");
		if(duplicateLeadHeader.equals("Duplicate Lead"))
			System.out.println("Duplicate Lead Header matched");
		else
			System.out.println("Duplicate Lead Header does not match");

		//click on create lead button
		clickByXpath("//input[@value='Create Lead']");

		//capture the first name and last name from the view lead screen
		String viewFirstName = getTextById("viewLead_firstName_sp");
		String viewLastName = getTextById("viewLead_lastName_sp");

		if(firstName.equals(viewFirstName)&&lastName.equals(viewLastName))
			System.out.println("Results are matched");
		else
			System.out.println("Results are not matched");

		//close the browser
		//closeBrowser();
	}

}
