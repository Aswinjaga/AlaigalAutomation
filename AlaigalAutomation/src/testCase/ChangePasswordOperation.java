package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import elements.ChangePassowrdElement;
import elements.MemberSignIn;

public class ChangePasswordOperation {
	
	@Test
	public void changePasSword() throws IOException {
		
		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("URL"));
		
		
		MemberSignIn.advanced.click();
		MemberSignIn.proccedLink.click();
		MemberSignIn.eMail.sendKeys(BaseClass.properties().getProperty("Email"));
		MemberSignIn.passWord.sendKeys(BaseClass.properties().getProperty("Password"));
		MemberSignIn.loginBtn.click();
		ChangePassowrdElement.memberProfile.click();
		ChangePassowrdElement.changePassword.click();
		//ChangePassowrdElement.oldPassword.sendKeys(BaseClass.properties().getProperty("OldPassword1"));
		ChangePassowrdElement.oldPassword.sendKeys("Aswin@12345");
		//ChangePassowrdElement.password.sendKeys(BaseClass.properties().getProperty("Password1"));
		ChangePassowrdElement.password.sendKeys("Aswin@1234");
		//ChangePassowrdElement.repeatPassword.sendKeys(BaseClass.properties().getProperty("ConfirmPassword"));
		ChangePassowrdElement.repeatPassword.sendKeys("Aswin@1234");
		
		//ChangePassowrdElement.changePasswordsubmit.click();
		BaseClass.driver.quit();
		

}
}