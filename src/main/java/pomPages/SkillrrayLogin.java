package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrrayLogin {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerastab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement gobtn;
	
	public SkillrrayLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearsButton() {
		gerastab.click();
	}
	
	public void demoskillraryapp() {
		demoapp.click();
	}
	
	public void serachtextbox(String course) {
		serachtb.sendKeys(course);
	}
	
	public void serachbutton() {
		gobtn.click();
	}
	
	

}
