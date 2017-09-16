package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class GenericWrappers implements Wrappers{
	RemoteWebDriver driver;
	int i = 1;

	public void invokeApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();	
			}else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer32.exe");
				driver = new InternetExplorerDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println(browser+" is launched successfully and maximized");
		} catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("Element "+idValue+" is found and entered with \""+data+"\"");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+idValue+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		} 
	}

	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("Element "+nameValue+" is found and entered with \""+data+"\"");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+nameValue+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		} 
	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).clear();
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("Element "+xpathValue+" is found and entered with \""+data+"\"");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+xpathValue+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		} 
	}

	public boolean verifyTitle(String title) {
		boolean bReturn = false;
		try {
			if(title.equals(driver.getTitle())) {
				System.out.println("The expected title \"" +title+"\" is same as the current page title: \""+ driver.getTitle()+"\"");
				bReturn = true;

			}else {
				System.out.println("The expected title \"" +title+"\" is not same as the current page title: \""+ driver.getTitle()+"\"");
			}

		} 
		catch (WebDriverException e) {
			System.err.println("Browser not reachable");

		}
		return bReturn;
	}

	public void verifyTextById(String id, String text) {
		try {
			if(text.equals(driver.findElementById(id).getText()))
			{
				System.out.println("The expected text \""+text+"\" matches with the webelement text: \""+ driver.findElementById(id).getText()+"\"");
			}
			else 
				System.out.println("The expected text \""+text+"\" does not matches with the webelement text: \""+ driver.findElementById(id).getText()+"\"");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not found");
			//	throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			//	throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}
	
	public void verifyTextContainsById(String id, String text) {
		try {
			if(driver.findElementById(id).getText().contains(text))
			{
				System.out.println("The expected text \""+text+"\" matches with the webelement text: \""+ driver.findElementById(id).getText()+"\"");
			}
			else 
				System.out.println("The expected text \""+text+"\" does not matches with the webelement text: \""+ driver.findElementById(id).getText()+"\"");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not found");
			//	throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			//	throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void verifyTextByXpath(String xpath, String text) {

		try {
			if(text.equals(driver.findElementByXPath(xpath).getText()))
			{
				System.out.println("The expected text \""+text+"\" matches with the webelement text \""+ driver.findElementByXPath(xpath).getText()+"\"");
			}
			else 
				System.out.println("The expected text \""+text+"doesn't match with the webelement text \""+ driver.findElementByXPath(xpath).getText()+"\"");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+xpath+" is not found");
			//	throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			//	throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			if(driver.findElementByXPath(xpath).getText().contains(text))
			{
				System.out.println("The expected text \""+text+"\" matches with the webelement text \""+ driver.findElementByXPath(xpath).getText()+"\"");
			}
			else 
				System.out.println("The expected text \""+text+"\" doesnt match with the webelement text \""+ driver.findElementByXPath(xpath).getText()+"\"");
		}catch (NoSuchElementException e) {
			System.err.println("Element "+xpath+" is not found");
			//throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			//throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void clickById(String id) {
		try {
			driver.findElementById(id).click();
			System.out.println("Element "+id+" is found and clicked");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		} 

	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("Element "+classVal+" is found and clicked");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+classVal+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void clickByName(String name) {
		try {
			driver.findElementByName(name).click();
			System.out.println("Element "+name+" is not found and clicked");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+name+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}


	}

	public void clickByLink(String name) {
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("Element "+name+" is found and clicked");
		}catch (NoSuchElementException e) {
			System.err.println("Element "+name+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}

	}

	public void clickByLinkNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("Element "+name+" is found and clicked without taking a snap");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+name+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		}
	}

	public void clickByXpath(String xpathVal) {

		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("Element "+xpathVal+" is found and clicked");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+xpathVal+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {

		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("Element "+xpathVal+" is found and clicked without taking a snap");
		}  catch (NoSuchElementException e) {
			System.err.println("Element "+xpathVal+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		}

	}

	public String getTextById(String idVal) {

		try {
			String text=driver.findElementById(idVal).getText();
			System.out.println("Element "+idVal+" is found and text value is returned");
			return text;
		} catch (NoSuchElementException e) {
			System.err.println("Element "+idVal+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public String getTextByXpath(String xpathVal) {

		try {
			String text=driver.findElementByXPath(xpathVal).getText();
			System.out.println("Element "+xpathVal+" is found and text value is returned");
			return text;
		} catch (NoSuchElementException e) {
			System.err.println("Element "+xpathVal+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public String getTextFromTextBoxById(String idVal) {
		try {
			String text = driver.findElementById(idVal).getAttribute("value");
			System.out.println("Element "+idVal+" is found and text value is returned");
			return text;
		} catch (NoSuchElementException e) {
			System.err.println("Element "+idVal+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public String getTextByClass(String className) {
		try {
			String text = driver.findElementByClassName(className).getText();
			System.out.println("Element "+className+" is found and text value is returned");
			return text;
		} catch (NoSuchElementException e) {
			System.err.println("Element "+className+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void selectVisibileTextById(String id, String value) {

		try {
			WebElement dropdownelement = driver.findElementById(id);
			Select dropdown = new Select(dropdownelement); 
			dropdown.selectByVisibleText(value);
			System.out.println("Element "+id+" is found and "+value+" is selected");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void selectIndexById(String id, int value) {
		try {
			WebElement dropdownelement = driver.findElementById(id);
			Select dropdown = new Select(dropdownelement); 
			dropdown.selectByIndex(value);
			System.out.println("Element "+id+" is found and "+value+" is selected");
		} catch (NoSuchElementException e) {
			System.err.println("Element "+id+" is not found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void switchToParentWindow() {
		try {
			Set<String> winHandles = driver.getWindowHandles();
			for(String allHandles : winHandles)
			{
				driver.switchTo().window(allHandles);
				break;
			}
			System.out.println("switchToParentWindow method is successfull");
		} catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void switchToLastWindow() {
		try {
			Set<String> winHandles = driver.getWindowHandles();
			for(String allHandles : winHandles)
			{
				driver.switchTo().window(allHandles);
			}
			System.out.println("switchToLastWindow method is successfull");
		}catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		} finally
		{
			takeSnap();
		}
	}

	public void acceptAlert() {

		try {
			driver.switchTo().alert().accept();
			System.out.println("acceptAlert method is successfull");
		} catch (NoAlertPresentException e) {
			System.err.println("Alert not found");
			throw new RuntimeException();
		}catch (UnhandledAlertException e)
		{
			System.err.println("Alert is not handled");
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		}

	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("dismissAlert method is successfull");
		} catch (NoAlertPresentException e) {
			System.err.println("Alert not found");
			throw new RuntimeException();
		}catch (UnhandledAlertException e)
		{
			System.err.println("Alert is not handled");
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		}

	}

	public String getAlertText() {
		try {
			String alerttext=driver.switchTo().alert().getText();
			System.out.println("getAlertText method is successfull");
			return alerttext;
		} catch (NoAlertPresentException e) {
			System.err.println("Alert not found");
			throw new RuntimeException();
		}
		catch (UnhandledAlertException e)
		{
			System.err.println("Alert is not handled");
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		}	
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/snap"+i+".jpg");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;

	}
	@AfterMethod(groups = {"common"})
	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("closeBrowser method is successfull");
		} catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		}	

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("closeAllBrowsers method is successfull");
		} catch (WebDriverException e) {
			System.err.println("Browser is unreachable");
			throw new RuntimeException();
		}	

	}

}