package wrappers;

import org.testng.annotations.BeforeMethod;

public class OpenTaps extends GenericWrappers {
	@BeforeMethod(groups = {"common"})
	public void logincrmsfa() {
	
		
		//Launch the chrome browser with the Leaftaps site Login page
				invokeApp("chrome","http://leaftaps.com/opentaps/control/main");

				//Logging to the application by entering the username,password and click on Login button
				enterById("username", "DemoSalesManager");
				enterById("password", "crmsfa");
				clickByClassName("decorativeSubmit");

				//Click on CRM/SFA Link 
				clickByLink("CRM/SFA");
	}
	
}
