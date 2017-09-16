package week2.samplescripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");
		
		driver.findElementByLinkText("Checkbox").click();
		//to select the ccheck box
		WebElement checkbox = driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/input[1]");
		
		checkbox.click();
		
		//to verify whether checkbox is checked or not
		
		if(checkbox.isSelected())
			System.out.println("checkbox is selected");
		else
			System.out.println("Checkbox is not selected");	

	}

}
