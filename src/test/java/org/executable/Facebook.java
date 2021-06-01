package org.executable;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.objectrepository.SignUp;
import org.resources.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook extends BaseClass {

	SignUp s;

	@BeforeClass
	public void launch() {
		LaunchBrowser();
		LaunchApp(
				"https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504238004%7Ce%7Cfacebook%20login%7C&placement=&creative=318504238004&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066388443%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9061894%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAwMP9BRCzARIsAPWTJ_ERjiobj53UrhumuIfTxkdg7GsPdEyazORDlUlvNckb0i5IpGJlGWsaAijHEALw_wcB");
		TakeUrl();
		getTitle();

	}

	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	public void EndTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	@Parameters({ "firstName", "lastName", "email", "Reemail", "password" })
	public void faceBook(String firstName, String lastName, String email, String Reemail, String password) {
		s = new SignUp();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		s.getFirstName().sendKeys(firstName);
		s.getLastName().sendKeys(lastName);
		s.getEmail().sendKeys(email);
		s.getReEmail().sendKeys(Reemail);
		s.getPassword().sendKeys(password);
		SBV(s.getDay(), "2");
		SBV(s.getMonth(), "3");
		SBV(s.getYear(), "1995");
		click(s.getSex());
		click(s.getSubmit());

	}
	@AfterClass
	public void closeBrowser() {
		quit();
		
	}

}
