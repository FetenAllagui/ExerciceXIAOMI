package TestSuite;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MaisonConnectee;

public class MaisonConnecteeStepDev {
	@Given("user is on maison connectée page")
	public void user_is_on_maison_connectée_page() {
			Config.confChrome();
			Config.driver= new ChromeDriver ();
			Config.maximizewindow();
			String url=  "https://mistore.com.tn/product-category/maison-connectee/";
			Config.driver.get(url);
			
			}

	@When("User click on product {string}")
	public void user_click_on_product(String nameproduct) throws Exception {
		MaisonConnectee home= new MaisonConnectee ();
		home.selectproduct(nameproduct);
	}

	@Then("user is directed to the product page that contains message {string}")
	public void user_is_directed_to_the_product_page_that_contains_message(String nameproduct) {
		MaisonConnectee home= new MaisonConnectee ();
		String ActualMessage =home.checkproduct();
		Assert.assertTrue("NAME PRODUCT IS INCORRECT", ActualMessage.contains(nameproduct));
	}}
