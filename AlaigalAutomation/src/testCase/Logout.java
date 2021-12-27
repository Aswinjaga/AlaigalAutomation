package testCase;

import base.BaseClass;
import elements.MemberLogout;
import elements.MemberSignIn;
import java.io.IOException;

import org.testng.annotations.Test;

@Test
public class Logout {


	public void logOut() throws IOException {
		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("URL"));


		MemberSignIn.advanced.click();
		MemberSignIn.proccedLink.click();
		MemberSignIn.eMail.sendKeys(BaseClass.properties().getProperty("Email"));
		MemberSignIn.passWord.sendKeys(BaseClass.properties().getProperty("Password"));
		MemberSignIn.loginBtn.click();
		MemberLogout.logOut.click();
		
		BaseClass.driver.quit(); 
		

	}



}
