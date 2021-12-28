package testCase;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseClass;
import elements.InviteGuestElement;
import elements.MemberSignIn;

public class GuestOperation {
	
	@Test
	public void guestModule() throws IOException, AWTException, InterruptedException {
		
		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("URL"));
		
		
		MemberSignIn.advanced.click();
		MemberSignIn.proccedLink.click();
		MemberSignIn.eMail.sendKeys(BaseClass.properties().getProperty("Email"));
		MemberSignIn.passWord.sendKeys(BaseClass.properties().getProperty("Password"));
		MemberSignIn.loginBtn.click();
		
		InviteGuestElement.guest.click();
		InviteGuestElement.inviteGuestBtn.click();
		
		//InviteGuestElement.guestName.sendKeys(BaseClass.properties().getProperty("GuestName1"));
		InviteGuestElement.guestName.sendKeys("jaga");
		//InviteGuestElement.companyName.sendKeys(BaseClass.properties().getProperty("CompanyName1"));
		InviteGuestElement.companyName.sendKeys("KR Store");
		//InviteGuestElement.companyAdreess.sendKeys(BaseClass.properties().getProperty("CompanyAddress1"));
		InviteGuestElement.companyAdreess.sendKeys("59,vaniyar street");
		//InviteGuestElement.contactNo.sendKeys(BaseClass.properties().getProperty("ContactNo1"));
		InviteGuestElement.contactNo.sendKeys("7373992281");
		//InviteGuestElement.email.sendKeys(BaseClass.properties().getProperty("InviteEmail"));
		InviteGuestElement.email.sendKeys("jaga.aswin@gmail.com");

		String file1="D:\\download 1.jpg";
		Actions action=new Actions(BaseClass.driver);
		action.moveToElement(InviteGuestElement.businesscard).click().perform();;
		StringSelection selection = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		BaseClass.robotClass().keyPress(KeyEvent.VK_CONTROL); 
		BaseClass.robotClass().keyPress(KeyEvent.VK_V);
		BaseClass.robotClass().keyRelease(KeyEvent.VK_V); 
		BaseClass.robotClass().keyRelease(KeyEvent.VK_CONTROL);
		BaseClass.robotClass().keyPress(KeyEvent.VK_ENTER);
		
		String file2="D:\\download 1.jpg";
		action.moveToElement(InviteGuestElement.idproof).click().perform();;
		StringSelection selection1 = new StringSelection(file2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null);
		Thread.sleep(3000);
		BaseClass.robotClass().keyPress(KeyEvent.VK_CONTROL); 
		BaseClass.robotClass().keyPress(KeyEvent.VK_V);
		BaseClass.robotClass().keyRelease(KeyEvent.VK_V); 
		BaseClass.robotClass().keyRelease(KeyEvent.VK_CONTROL);
		BaseClass.robotClass().keyPress(KeyEvent.VK_ENTER);
		
		String file3="D:\\download 1.jpg";
		action.moveToElement(InviteGuestElement.profilePic).click().perform();;
		StringSelection selection2 = new StringSelection(file3);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2, null);
		Thread.sleep(3000);
		BaseClass.robotClass().keyPress(KeyEvent.VK_CONTROL); 
		BaseClass.robotClass().keyPress(KeyEvent.VK_V);
		BaseClass.robotClass().keyRelease(KeyEvent.VK_V); 
		BaseClass.robotClass().keyRelease(KeyEvent.VK_CONTROL);
		BaseClass.robotClass().keyPress(KeyEvent.VK_ENTER);
		
		//InviteGuestElement.inviteSubmit.click();
}
}