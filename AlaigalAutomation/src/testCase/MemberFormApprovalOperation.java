package testCase;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseClass;
import elements.AdminMemberFormApproval;
import elements.AdminSigninElement;

public class MemberFormApprovalOperation {
	
	@Test
	public static void memberApproval() throws IOException {
		BaseClass.init();
		//BaseClass.driver.get(BaseClass.properties().getProperty("AdminURL"));
		BaseClass.driver.get("https://myvideoscript.com/aligal/index.php/admin/login");
		
		AdminSigninElement.advanBtn.click();
		AdminSigninElement.proceesBtn.click();
		//AdminSigninElement.adminUserName.sendKeys(BaseClass.properties().getProperty("AdminEmail"));
		AdminSigninElement.adminUserName.sendKeys("admin@gmail.com");
		//AdminSigninElement.adminPassword.sendKeys(BaseClass.properties().getProperty("AdminPassword"));
		AdminSigninElement.adminPassword.sendKeys("Admin@123");
		AdminSigninElement.adminsubmitbtn.click();
		
		AdminMemberFormApproval.memberFormApprovalBtn.click();
		Select select= new Select(AdminMemberFormApproval.entries);
		select.selectByIndex(1);
		AdminMemberFormApproval.memberSearch.sendKeys("jagadesh");
		
	}

}
