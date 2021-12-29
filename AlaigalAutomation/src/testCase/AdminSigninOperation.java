package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import elements.AdminSigninElement;

public class AdminSigninOperation {

	@Test
	public void adminSignin() throws IOException {


		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("AdminURL"));

		AdminSigninElement.advanBtn.click();
		AdminSigninElement.proceesBtn.click();
		AdminSigninElement.adminUserName.sendKeys(BaseClass.properties().getProperty("AdminEmail"));
		AdminSigninElement.adminPassword.sendKeys(BaseClass.properties().getProperty("AdminPassword"));
		AdminSigninElement.adminsubmitbtn.click();
	}

}
