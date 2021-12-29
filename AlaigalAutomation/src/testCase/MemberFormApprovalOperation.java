package testCase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
		AdminMemberFormApproval.memberSearch.sendKeys("Jagadesh");

		
		int rowNum = BaseClass.driver.findElements(By.xpath("//*[@id=\"datatable\"]/tbody/tr")).size();
		System.out.println(rowNum);
		int rowcolumn = BaseClass.driver.findElements(By.xpath("//*[@id=\"datatable\"]/tbody/tr/td")).size();
		System.out.println(rowcolumn);
		
		
		 WebElement table = BaseClass.driver.findElement(By.xpath("//*[@id=\"datatable\"]"));
		 List<WebElement> headers = table.findElements(By.tagName("th"));		   
		 int colIndex = 0;
		   
		 for(int i = 0; i <= headers.size()-1; i++) {
			 System.out.println(headers.get(i).getText());
		    if(headers.get(i).getText().equals("FIRST NAME")) {
		    	colIndex =  i+1;
		    }
		 }		
		
	    
		for(int i=1; i <= rowNum; i++) {
			String firstname = BaseClass.driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[" + i + "]/td["+ colIndex +"]")).getText();
			//System.out.println(firstname);
			if(firstname.equals("Jagadesh")) {
				//approach 1-> get by xpath and click
				BaseClass.driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr["+i+"]/td[5]/child::a[@class = 'item-edit'][1]")).click();
				//approach 2 -> get by tag name and click
				//*[@id="datatable"]/tbody/tr[1]/td[5]/child::a[@class = 'item-edit'][1]
				//WebElement td = BaseClass.driver.findElement(By.xpath("//*[@id=\"datatable\"]/tbody/tr[" + i + "]/td[5]"));
				//List<WebElement> links = td.findElements(By.tagName("a"));								
				//links.get(0).click();
				break;
				//BaseClass.driver.quit();
			
			}		
		}
		
		WebElement personal =	BaseClass.driver.findElement(By.xpath("//*[@class='col-md-5']"));
		List<WebElement> para=personal.findElements(By.tagName("p"));
	
		System.out.println(para.size());
		System.out.println(para.get(0).getText());
		Assert.assertEquals("First Name : Jagadesh", para.get(0).getText());
	}
}
	


