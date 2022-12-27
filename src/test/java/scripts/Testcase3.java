package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Selenium;
import pomPages.SkillrrayLogin;
import pomPages.WishList;

public class Testcase3 extends StepGroup{

	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillrrayLogin s=new SkillrrayLogin(driver);
	s.serachtextbox(pdata.getPropertydata("coursename"));
	s.serachbutton();
	
	Selenium se=new Selenium(driver);
	se.corejavaselenium();
	
	WishList w=new WishList(driver);
	w.closepopup();
	driverutilies.switchframe(driver);
	
	w.palybtn();
	Thread.sleep(10000);
	w.pausebtn();
	driverutilies.switchbackframe(driver);
	w.wishlist();
	
	
	}
}
