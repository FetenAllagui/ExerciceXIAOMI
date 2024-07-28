package page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class XiaomiHomePage {
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[2]")
	List<WebElement> submenus;
	@FindBy(xpath = "/html/body/div[1]/div[5]/section/div/div/div/div/div/section[1]/div/div[1]/div/div/div/div/div/h4")
	WebElement verifmenu;

	@FindBy(xpath = "/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verifsubmenu;

	public XiaomiHomePage() {
		PageFactory.initElements(Config.driver, this);
	}

	

	public void mouseHoverOnMenuandClickOnSubmenu(String menutitle, String subMenutitle) {
		try {
			for (WebElement menu : menus) {
				if (menu.getText().contains(menutitle)) {
					Config.actions = new Actions(Config.driver);
					Config.actions.moveToElement(menu).perform();
					Config.attente(10);
					Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					for (WebElement submenu : submenus) {
						if (submenu.getText().contains(subMenutitle)) {
							submenu.click();
							Config.attente(10);
					
						}
					}
				}
			}
		} catch (Exception e) {

		}

	}
	public String VerifSubmenu () {
		String ActualText = verifsubmenu.getText();
		return ActualText;
	}
}