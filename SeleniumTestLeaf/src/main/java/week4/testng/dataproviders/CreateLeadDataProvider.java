package week4.testng.dataproviders;
import wrappers.OpenTapsTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadDataProvider extends OpenTapsTestng {
	
	@Test(dataProvider = "fetchdata", invocationCount = 2, threadPoolSize = 2)
	public void CreateLeadAtTest(String cName, String fName, String lName) {

		//logincrmsfa();
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", cName);
		enterById("createLeadForm_firstName", fName);
		enterById("createLeadForm_lastName", lName);
		clickByClassName("smallSubmit");
		//closeBrowser();
	}
	@DataProvider(name = "fetchdata")
	public Object[][] getdata(){
	
	Object[][] data = new Object[2][3];
	data[0][0]="CTS";
	data[0][1]="MOHAN";
	data[0][2]="MH";
	data[1][0]="ACCENTURE";
	data[1][1]="MOHAN";
	data[1][2]="MH";	
	return data;		
	}
	
	
}
