package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public Addtocart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void addtocartbutton() {
		addtocart.click();
	}
	
	

}
