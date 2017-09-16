/*Psudeocode

1. launch the application url
2. inspect the page and find the frame attributes
3. GO INTO THE respective frame where try it button is there using findelement or frame()
4. click on the try it button using find element by
5. handle the alert pop up by using switchto method and perfrom the action on the alert
6. capture the text in the alert using gettext() method
7. verify the text inside the frame by getting the text value element
8. compare the text taken from the alert and text in the frame*/

package week2.samplescripts;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleIrctc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		//Clicking on the contact us Link from the homepage
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> wHandles = driver.getWindowHandles(); // to get the current windows open 
		
		//using for each loop to go the latest window
		for ( String allWin : wHandles)
		{
			driver.switchTo().window(allWin);
		}
		
		System.out.println("Title of the contact us dialog box is : "+driver.getTitle());
		System.out.println("TitlSe of the contact us dialog box is : "+ driver.getCurrentUrl());
		
		//To go back to the first window
		
		//driver.switchTo().window(mainWindow);
		
		wHandles = driver.getWindowHandles(); // to update the current windows open
		
		for(String allWin : wHandles)
		{
			driver.switchTo().window(allWin); 
			break; // iteration stops after the the control switches to the first window
		}
		//To close the parent window
		driver.close();
		
				
	}

}
