package week1.sampleScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead_XpathLocator 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//importing chrome driver 
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//creating instance of chrome driver
		ChromeDriver driver = new ChromeDriver();
		//launching the browser and performing the neccesary steps
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("mohan");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
}
}
