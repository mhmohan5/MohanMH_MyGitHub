package week2.wrappers.tests;

import wrappers.GenericWrappers;

public class Login {

	public static void main(String[] args) {
			
		GenericWrappers gw = new GenericWrappers();
		gw.invokeApp("chrome", "http://leaftaps.com/opentaps");
		gw.enterById("username", "DemoSalesManager");
		gw.enterById("password", "crmsfa");
		gw.clickByClassName("decorativeSubmit");
		gw.clickByClassName("decorativeSubmit");
		gw.closeBrowser();
	}
	
}









