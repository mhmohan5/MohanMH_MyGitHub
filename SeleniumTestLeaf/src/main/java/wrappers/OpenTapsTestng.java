//with parameter used from xml
package wrappers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class OpenTapsTestng extends GenericWrappers {
	@Parameters({"browser","URL","uname","pwd"})
	@BeforeMethod
	
	public void logincrmsfa(String brow, String ur, String un, String pw) {
	
		
		//Launch the chrome browser with the Leaftaps site Login page
				invokeApp(brow,ur);

				//Logging to the application by entering the username,password and click on Login button
				enterById("username", un);
				enterById("password", pw);
				clickByClassName("decorativeSubmit");

				//Click on CRM/SFA Link 
				clickByLink("CRM/SFA");
	}
	
}
