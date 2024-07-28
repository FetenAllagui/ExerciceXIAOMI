package TestSuite;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MaisonConnectee;

public class PanierStepDev {
	@Given("user is on the product page")
	public void user_is_on_the_product_page() {
		Config.confChrome();
		Config.driver= new ChromeDriver ();
		Config.maximizewindow();
		String url=  "https://mistore.com.tn/product/mi-door-window-sensor-2/";
		Config.driver.get(url);
	}

	@When("User click on add to cart")
	public void user_click_on_add_to_cart() {
		MaisonConnectee home= new MaisonConnectee ();
		home.ajouteraupanier();
	}
	    

	@When("User click on view your cart")
	public void user_click_on_view_your_cart() {
		MaisonConnectee home= new MaisonConnectee ();
		home.clickersurpanier();
		Config.attente(5);
	}
	   

	@Then("user is directed to the cart list that contains message {string}")
	public void user_is_directed_to_the_cart_list_that_contains_message(String nameproduct) {
		MaisonConnectee home= new MaisonConnectee ();
		String Actualtext =home.verifproduitpanier();
		Assert.assertTrue("NAME PRODUCT IS INCORRECT", Actualtext.contains(nameproduct));
	}

}
