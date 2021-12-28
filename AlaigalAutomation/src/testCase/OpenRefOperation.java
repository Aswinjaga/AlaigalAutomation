package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import elements.MemberSignIn;
import elements.OpenRefElement;

public class OpenRefOperation {
	
	@Test
	public void directRef() throws IOException {
		
		BaseClass.init();
		BaseClass.driver.get(BaseClass.properties().getProperty("URL"));
		
		
		MemberSignIn.advanced.click();
		MemberSignIn.proccedLink.click();
		MemberSignIn.eMail.sendKeys(BaseClass.properties().getProperty("Email"));
		MemberSignIn.passWord.sendKeys(BaseClass.properties().getProperty("Password"));
		MemberSignIn.loginBtn.click();
		
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
		OpenRefElement.OpenSubmit.click();
		BaseClass.driver.quit();

}
}