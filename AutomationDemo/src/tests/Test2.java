package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actitime.ActiTimeHomePO;
import actitime.ActiTimeLoginPO;

public class Test2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jackb\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.acttime.com/samrtapp/login.do");

		ActiTimeLoginPO po=new ActiTimeLoginPO(driver);
		po.unTxtBx().sendKeys("jyoth42921");
		po.pwTxtBx().sendKeys("5E9uSy6y");
		po.loginBtn().click();
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Enter time"));
		ActiTimeHomePO homePO=new ActiTimeHomePO(driver);
		homePO.logoutBtn().click();
		

}


}


