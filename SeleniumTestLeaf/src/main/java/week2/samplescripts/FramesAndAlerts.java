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

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		//to go into the frame where try it button is present
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		
		Alert alt = driver.switchTo().alert(); 
		
		String alertText = alt.getText();
		String sendText="Hello this is alert program";
		alt.sendKeys(sendText);
		alt.accept();
		
		//String enteredText = driver.findElementByXPath("//p[contains(@text , 'Hello')]").getText();
		String output = driver.findElementByXPath("//p[@id='demo']").getText();
		
		if(output.contains(sendText))
			System.out.println("Output contains the entered text");
		else
			System.out.println("Output does not contain the entered text");
		
		System.out.println("Text captured from the alert box is : "+alertText);
		
		//to come out of the frame
		driver.switchTo().defaultContent();
		
		

	}

}
