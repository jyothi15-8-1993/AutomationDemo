package actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPO {
	
		public ActiTimeLoginPO(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@id='username']")
		private WebElement unTxtBx;
		public WebElement unTxtBx() {
			return unTxtBx;
		}
		@FindBy(xpath="//input[@name='pwd']")
		private WebElement pwTxtBx;
		public WebElement pwTxtBx() {
			return pwTxtBx;
		}
		@FindBy(xpath="//a[@id='loginButton']")
		private WebElement loginBtn;
		public WebElement loginBtn() {
			return loginBtn;	
		}
		@FindBy(xpath="(//span[@class='errormsg'])[1]")
		private WebElement errormsg;
		public WebElement errormsg() {
			return errormsg;
		
		
		}
		

	}


