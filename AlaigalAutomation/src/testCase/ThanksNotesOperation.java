package testCase;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseClass;
import elements.MemberSignIn;
import elements.ThanksNotesElement;

public class ThanksNotesOperation {
	
	@Test
	public void thanksNotes() throws IOException {
		
		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("URL"));
		
		
		MemberSignIn.advanced.click();
		MemberSignIn.proccedLink.click();
		MemberSignIn.eMail.sendKeys(BaseClass.properties().getProperty("Email"));
		MemberSignIn.passWord.sendKeys(BaseClass.properties().getProperty("Password"));
		MemberSignIn.loginBtn.click();
		
		ThanksNotesElement.thanksNotesBtn.click();
		ThanksNotesElement.thanksNotes.click();
		Select select=new Select(ThanksNotesElement.thanksNotesSelect1);
		select.selectByValue("1");
		//ThanksNotesElement.thanksNotesDate.sendKeys(BaseClass.properties().getProperty("ThanksDate"));
		ThanksNotesElement.thanksNotesDate.sendKeys("12-28-2021");
		//ThanksNotesElement.thanksNotesAmount.sendKeys(BaseClass.properties().getProperty("ThanksAmount"));
		ThanksNotesElement.thanksNotesDate.sendKeys("200000");
		//ThanksNotesElement.thanksNotesDescription.sendKeys(BaseClass.properties().getProperty("Thanksdescription"));
		ThanksNotesElement.thanksNotesDescription.sendKeys("Thanks for giving Business");
		//ThanksNotesElement.thanksNotesSubmit.click();
		BaseClass.driver.quit();
}
}