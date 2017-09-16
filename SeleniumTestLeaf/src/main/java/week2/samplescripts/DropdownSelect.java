package week2.samplescripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//selecing by index ( last option ) - first dropdown
		WebElement first = driver.findElementById("dropdown1");
		Select firstsel = new Select(first);
		List<WebElement> firstop = firstsel.getOptions();
		int lastoption = firstop.size()-1;
		int i = 0;
		for (WebElement neop: firstop )
		{
			
			if (i==lastoption)
				neop.click();
			i++;
		}
		
		//selecting the second dropdown by text
		WebElement second = driver.findElementByName("dropdown2");
		Select secsel = new Select(second);
		//List<WebElement> secop = secsel.getOptions();
		secsel.selectByVisibleText("Appium");
		
		//selecting the third dropdown by value
		WebElement third = driver.findElementByName("dropdown3");
		Select thirdsel = new Select(third);
		thirdsel.selectByValue("3");
		
		//to get the number of values in the fourth dropdown
		WebElement fourth = driver.findElementByClassName("dropdown");
		Select fourthsel = new Select(fourth);
		List<WebElement> fourthseloptions = fourthsel.getOptions();
		int fourthcount = fourthseloptions.size();
		System.out.println("Number of options in the fourth dropdown is "+fourthcount);
		
		//selecting the value in the fifth dropdown by send keys
		// Not working   driver.findElementByXPath("(//div[@class='example'])[5]").sendKeys("Loadrunner");
		
		WebElement fifth = driver.findElementByXPath("(//div[@class='example'])[5]/select");
		Select fifthsel = new Select(fifth);
		fifthsel.selectByVisibleText("Loadrunner");
	
		
		//selecting muptiple options
		WebElement sixth = driver.findElementByXPath("(//div[@class='example'])[6]/select");
		Select sixthsel = new Select(sixth);
		sixthsel.selectByVisibleText("Selenium");
		sixthsel.selectByVisibleText("Appium");
		sixthsel.deselectAll();
		sixthsel.selectByVisibleText("Selenium");		
	}

}
