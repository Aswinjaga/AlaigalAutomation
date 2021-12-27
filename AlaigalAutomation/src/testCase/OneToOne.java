package testCase;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseClass;
import elements.MemberSignIn;
import elements.OneToOneMeeting;

public class OneToOne {

	@Test
	public void OneToOneMeet() throws IOException, AWTException, InterruptedException {
		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("URL"));


		MemberSignIn.advanced.click();
		MemberSignIn.proccedLink.click();
		MemberSignIn.eMail.sendKeys(BaseClass.properties().getProperty("Email"));
		MemberSignIn.passWord.sendKeys(BaseClass.properties().getProperty("Password"));
		MemberSignIn.loginBtn.click();

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


		//OneToOneMeeting.submitbtn.click();

	}

}
