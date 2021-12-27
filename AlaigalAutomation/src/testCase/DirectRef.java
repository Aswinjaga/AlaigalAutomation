package testCase;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseClass;
import elements.DirectRefElement;
import elements.MemberSignIn;
import elements.OneToOneMeeting;


public class DirectRef {


	@Test
	public void directRefOperation() throws IOException, AWTException, InterruptedException,IllegalArgumentException {

		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("URL"));


		MemberSignIn.advanced.click();
		MemberSignIn.proccedLink.click();
		MemberSignIn.eMail.sendKeys(BaseClass.properties().getProperty("Email"));
		MemberSignIn.passWord.sendKeys(BaseClass.properties().getProperty("Password"));
		MemberSignIn.loginBtn.click();

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
		action.moveToElement(DirectRefElement.DirectRefPhoto).click().perform();;
		StringSelection selection = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		BaseClass.robotClass().keyPress(KeyEvent.VK_CONTROL); 
		BaseClass.robotClass().keyPress(KeyEvent.VK_V);
		BaseClass.robotClass().keyRelease(KeyEvent.VK_V); 
		BaseClass.robotClass().keyRelease(KeyEvent.VK_CONTROL);
		BaseClass.robotClass().keyPress(KeyEvent.VK_ENTER);

	}
}