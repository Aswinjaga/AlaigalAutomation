package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectRefElement {
	
	@FindBy(xpath = "(//*[@class='d-flex align-items-center'])[13]")
	public static WebElement refBtn;

	@FindBy(xpath = "(//*[@class='d-flex align-items-center'])[15]")
	public static WebElement DirectRefBtn;
	
	@FindBy(xpath = "//*[@name='reference']")
	public static WebElement SelectBtn;
	
	@FindBy(xpath = "//option[@value='1']")
	public static WebElement SelectName;
	
	@FindBy(xpath = "//input[@name='ref_due_date']")
	public static WebElement refDate;
	
	@FindBy(xpath = "//input[@id='amount']")
	public static WebElement DirectRefAmount;
	
	@FindBy(xpath = "//*[@name='business_des']")
	public static WebElement DirectRefDescription;
	
	@FindBy(xpath = "//*[@type='file']")
	public static WebElement DirectRefPhoto;
	
	@FindBy(xpath = "//*[@id='submitbtn1']")
	public static WebElement DirectSubmit;
}


