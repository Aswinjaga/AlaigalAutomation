package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneToOneMeeting {
	
	
	@FindBy(xpath = "(//*[@class='menu-title text-truncate'])[5]")
	public static WebElement metting;
	
	@FindBy(xpath = "//*[@id=\'main-menu-navigation\']/li[5]/ul/li[1]")
	public static WebElement meetbtn;
	
	@FindBy(xpath = "//select[@name='reference']")
	public static WebElement selectMember;
	
	@FindBy(xpath = "//*[@value='1']")
	public static WebElement name;
	
	@FindBy(xpath = "//input[@type='date']")
	public static WebElement date;
	
	
	@FindBy(xpath = "//*[@type='file']")
	public static WebElement selectPhoto;
	
	@FindBy(xpath = "//textarea[@name='business_des']")
	public static WebElement description;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement submitbtn;
	
}

