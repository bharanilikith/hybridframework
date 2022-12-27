package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillrrayLogin;
import pomPages.Testing;

public class Testcase2 extends StepGroup{
	
	@Test
	public void tc2() throws IOException {
	SkillrrayLogin s=new SkillrrayLogin(driver);
	s.gearsButton();
	s.demoskillraryapp();
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	driverutilies.switchTabs(driver);
	driverutilies.dropdown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
	
	
	Testing t=new Testing(driver);
	driverutilies.draganddrop(driver,t.getSelenium(),t.getCart());
	Point loc = t.getFacebook().getLocation();
	int x = loc.getX();
	int y=loc.getY();
	
	driverutilies.scrollBar(driver,x,y);
	t.facebookicon();
	}

}
