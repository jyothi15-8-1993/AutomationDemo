package actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePO {
	public ActiTimeHomePO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logoutBtn;
	public WebElement logoutBtn() {
		return logoutBtn;
	}

}
