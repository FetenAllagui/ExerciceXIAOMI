package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions actions;
	public static void confChrome () {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
	}
	public static void maximizewindow () {
		driver.manage().window().maximize();
	}
	public static void attente (long s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	}


