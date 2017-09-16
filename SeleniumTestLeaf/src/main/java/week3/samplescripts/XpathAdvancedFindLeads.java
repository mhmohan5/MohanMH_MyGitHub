package week3.samplescripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdvancedFindLeads {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		/*      (//div[@class='x-grid3-cell-inner x-grid3-col-lastName'])[1]/a/div/preceding::div[1]


				(//div[@class='x-grid3-cell-inner x-grid3-col-lastName'])/a/preceding::a[3]

				((//div[@class='x-grid3-cell-inner x-grid3-col-lastName'])/a/preceding::a[3])[3]

				 (//div[@class='x-grid3-cell-inner x-grid3-col-lastName'])/a/preceding::a[3]/following::a[11]
		 */
	}
}
