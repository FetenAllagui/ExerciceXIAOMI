package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class MaisonConnectee {
	@FindBy(xpath = "/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3")
	List<WebElement> productlist;
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement verifproduct;
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement btnajouterpanier;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div")
	WebElement listpanier;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/ul/li/div[2]/a[1]")
	WebElement verifpanier;

	public MaisonConnectee() {
		PageFactory.initElements(Config.driver, this);
	}

	public void selectproduct(String nameproduct) throws Exception {
		try {
			for (WebElement product : productlist) {
			if (product.getText().contains(nameproduct)) {
				product.click();
			}
		}
	}catch (Exception e) {
		
	}	
	}

	public String checkproduct() {

		String ActualMessage = verifproduct.getText();
		return ActualMessage;
	}

	public void ajouteraupanier() {
		btnajouterpanier.click();
	}

	public void clickersurpanier() {
		listpanier.click();
	}

	public String verifproduitpanier() {
		String Actualtext = verifpanier.getText();
		return Actualtext;
	}

}
