package testCase;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseClass;
import elements.ChangePassowrdElement;
import elements.DirectRefElement;
import elements.InviteGuestElement;
import elements.MemberLogout;
import elements.MemberSignIn;
import elements.OneToOneMeeting;
import elements.OpenRefElement;
import elements.ThanksNotesElement;




public class MemberFlow {

	@BeforeSuite
	public void loginOperation() throws IOException {

		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("URL"));


		MemberSignIn.advanced.click();
		MemberSignIn.proccedLink.click();
		MemberSignIn.eMail.sendKeys(BaseClass.properties().getProperty("Email"));
		MemberSignIn.passWord.sendKeys(BaseClass.properties().getProperty("Password"));
		MemberSignIn.loginBtn.click();
	}
	@Test(priority = 0)
	public void changePasSword() throws IOException {


		ChangePassowrdElement.memberProfile.click();
		ChangePassowrdElement.changePassword.click();
		//ChangePassowrdElement.oldPassword.sendKeys(BaseClass.properties().getProperty("OldPassword1"));
		ChangePassowrdElement.oldPassword.sendKeys("Aswin@12345");
		//ChangePassowrdElement.password.sendKeys(BaseClass.properties().getProperty("Password1"));
		ChangePassowrdElement.password.sendKeys("Aswin@1234");
		//ChangePassowrdElement.repeatPassword.sendKeys(BaseClass.properties().getProperty("ConfirmPassword"));
		ChangePassowrdElement.repeatPassword.sendKeys("Aswin@1234");

		//ChangePassowrdElement.changePasswordsubmit.click();
	}		
	@Test(priority = 1)
	public void OneToOneMeet() throws IOException, AWTException, InterruptedException {

		OneToOneMeeting.metting.click();
		OneToOneMeeting.meetbtn.click();

		Select select= new Select(BaseClass.driver.findElement(By.xpath("//select[@name='reference']")));
		//select.selectByVisibleText(BaseClass.properties().getProperty("selectName1"));
		select.selectByVisibleText("Gokul J");
		//OneToOneMeeting.selectMember.click();
		//OneToOneMeeting.name.click();

		OneToOneMeeting.date.sendKeys("11012021");
		OneToOneMeeting.description.sendKeys("hi");

		String file1="D:\\download 1.jpg";
		Actions action=new Actions(BaseClass.driver);
		action.moveToElement(OneToOneMeeting.selectPhoto).click().perform();;
		StringSelection selection = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		BaseClass.robotClass().keyPress(KeyEvent.VK_CONTROL); 
		BaseClass.robotClass().keyPress(KeyEvent.VK_V);
		BaseClass.robotClass().keyRelease(KeyEvent.VK_V); 
		BaseClass.robotClass().keyRelease(KeyEvent.VK_CONTROL);
		BaseClass.robotClass().keyPress(KeyEvent.VK_ENTER);

		//	OneToOneMeeting.submitbtn.click();

	}
	@Test(priority = 2)
	public void openRef() throws IOException {

		OpenRefElement.refBtn.click();
		OpenRefElement.OpenRefBtn.click();
		//OpenRefElement.OpenProposedTitle.sendKeys(BaseClass.properties().getProperty("ProposedTitle1"));
		OpenRefElement.OpenProposedTitle.sendKeys("Need Bulk Quantity cashew");
		//OpenRefElement.OpenDueDate.sendKeys(BaseClass.properties().getProperty("OpenDueDate1"));
		OpenRefElement.OpenDueDate.sendKeys("12-30-2021");
		//OpenRefElement.OpenAmount.sendKeys(BaseClass.properties().getProperty("OpenAmount1"));
		OpenRefElement.OpenAmount.sendKeys("200000");
		//OpenRefElement.OpenDescription.sendKeys(BaseClass.properties().getProperty("OpenDescription1"));
		OpenRefElement.OpenDescription.sendKeys("Let Me know as soon as possible	");
		//OpenRefElement.OpenSubmit.click();

	}
	@Test(priority = 3)
	public void directRefOperation() throws IOException, AWTException, InterruptedException,IllegalArgumentException {

		DirectRefElement.refBtn.click();
		DirectRefElement.DirectRefBtn.click();
		DirectRefElement.SelectBtn.click();
		DirectRefElement.SelectName.click();
		DirectRefElement.refDate.sendKeys("11012021");
		DirectRefElement.DirectRefAmount.sendKeys("20000");
		DirectRefElement.DirectRefDescription.sendKeys("hi");
		//DirectRefElement.DirectRefPhoto.click();

		String file1="D:\\download 1.jpg";
		Actions action=new Actions(BaseClass.driver);
		action.moveToElement(DirectRefElement.DirectRefPhoto).click().perform();
		StringSelection selection = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		BaseClass.robotClass().keyPress(KeyEvent.VK_CONTROL); 
		BaseClass.robotClass().keyPress(KeyEvent.VK_V);
		BaseClass.robotClass().keyRelease(KeyEvent.VK_V); 
		BaseClass.robotClass().keyRelease(KeyEvent.VK_CONTROL);
		BaseClass.robotClass().keyPress(KeyEvent.VK_ENTER);
		//DirectRefElement.DirectSubmit.click();

	}
	@Test(priority = 4)
	public void thanksNotes() throws IOException {


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

	}
	@Test(priority = 5)
	public void guestModule() throws IOException, AWTException, InterruptedException {

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

	@AfterSuite
	public void logOut() throws IOException, InterruptedException {

		
		MemberLogout.logOut.click();

		BaseClass.driver.quit(); 

	}


}
