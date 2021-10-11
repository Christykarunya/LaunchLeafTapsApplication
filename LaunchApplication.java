package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
		//Setup driver
		WebDriverManager.chromedriver().setup();
		//to open a chrome browser
		ChromeDriver driver=new ChromeDriver();
		//to load application
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

}
