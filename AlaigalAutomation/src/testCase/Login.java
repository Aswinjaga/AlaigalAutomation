package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import elements.MemberSignIn;

public class Login {
	
	
	@Test
	public void loginOperation() throws IOException {
		
		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("URL"));
		
		
		MemberSignIn.advanced.click();
		MemberSignIn.proccedLink.click();
		MemberSignIn.eMail.sendKeys(BaseClass.properties().getProperty("Email"));
		MemberSignIn.passWord.sendKeys(BaseClass.properties().getProperty("Password"));
		MemberSignIn.loginBtn.click();
		
		BaseClass.driver.quit();
	}

}
