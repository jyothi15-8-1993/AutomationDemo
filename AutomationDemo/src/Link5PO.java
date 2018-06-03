import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Link5PO {
	public Link5PO(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//a")
		private List<WebElement> allLinks;
		public WebElement allLinks(int i) {
			return allLinks.get(i);
		}
		public int allLinksNum() {
			return allLinks.size();
		}
		
		
		@FindBy(xpath="//input[@type='checkbox']")
		private List<WebElement> allChkBx;
		public WebElement allChkBx(int i) {
			return allChkBx.get(i);
		}
		public int allChkBxNum() {
			return allChkBx.size();
			
		}
		
	}