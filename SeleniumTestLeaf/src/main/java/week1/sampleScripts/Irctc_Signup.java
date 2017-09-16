package week1.sampleScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_Signup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("mhmohan5");
		driver.findElementById("userRegistrationForm:password").sendKeys("9790787978");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("9790787978");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What make was your first car or bike?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Unicorn");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Mohan");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("M");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("H");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("01");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("FEB");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1991");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Government");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("826659994568");
		driver.findElementById("userRegistrationForm:idno").sendKeys("BLRPM1734Q");
		driver.findElementById("userRegistrationForm:email").sendKeys("mhmohan5@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9790787978");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("F1, Ruby Apts");
		driver.findElementById("userRegistrationForm:street").sendKeys("DavidNagar");
		driver.findElementById("userRegistrationForm:area").sendKeys("NewPerungalathur");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");

	}

}
