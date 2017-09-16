//test case to run parrelly two test data at the same time parallel. this wont work if we use generic wrapper


package week4.testng.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class CreateLeadDataProviderArray {
  @Test(dataProvider = "fetchdata", invocationCount =2, threadPoolSize = 2)
  public void f(String cName, String fName, String lName) {
	  
	//Launch Browser
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			//Call Java Class to another class
			ChromeDriver driver = new ChromeDriver();
			
			//Launch URL
			driver.get("http://192.168.1.17/");
			
			//To maximize
			driver.manage().window().maximize();
			
			//Login
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			
			//LinkClick
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Create Lead").click();
			
			//Form
			driver.findElementById("createLeadForm_companyName").sendKeys(cName);
			driver.findElementById("createLeadForm_firstName").sendKeys(fName);
			driver.findElementById("createLeadForm_lastName").sendKeys(lName);
			driver.findElementByName("submitButton").click();
			driver.close();
			
			
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
