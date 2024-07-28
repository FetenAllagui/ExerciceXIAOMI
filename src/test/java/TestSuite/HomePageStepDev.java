package TestSuite;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.XiaomiHomePage;

public class HomePageStepDev {
	@Given("user is on home page")
	public void user_is_on_home_page() {
			Config.confChrome();
			Config.driver= new ChromeDriver ();
			Config.maximizewindow();
			String url=  "https://mistore.com.tn/";
			Config.driver.get(url);
			
			}

	@When("User mouse hover on menu {string} and click on submenu title {string}")
	public void user_mouse_hover_on_menu(String menu, String submenu) {
		XiaomiHomePage home = new XiaomiHomePage ();
		home.mouseHoverOnMenuandClickOnSubmenu(menu, submenu);
	}

	@Then("user is directed to the submenu page that contains message {string}")
	public void user_is_directed_to_the_submenu_page_that_contains_message_maison_Connectée(String verifsubmenu) {
		XiaomiHomePage home = new XiaomiHomePage ();
		String ActualText =home.VerifSubmenu();
		Assert.assertEquals(verifsubmenu, ActualText);
	}

	
}

