package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import elements.DirectRefElement;
import elements.InviteGuestElement;
import elements.MemberLogout;
import elements.MemberSignIn;
import elements.OneToOneMeeting;
import elements.OpenRefElement;



public class BaseClass {
	
	public static WebDriver driver;
	public static Properties getprop;
	public static Robot robot;
	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "D:\\adm\\selenium\\jar file\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, MemberSignIn.class);
		PageFactory.initElements(driver, MemberLogout.class);;
		PageFactory.initElements(driver,OneToOneMeeting.class );
		PageFactory.initElements(driver,DirectRefElement.class );
		PageFactory.initElements(driver, OpenRefElement.class);
		PageFactory.initElements(driver, InviteGuestElement.class);
		return driver;
	}
		public static Properties properties() throws IOException {
			
			FileInputStream fs=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\AlaigalAutomation\\testData.properties");
			getprop= new Properties();
			getprop.load(fs);
			return getprop;
	}
		
		public static Robot robotClass() throws AWTException {
			 robot=new Robot();
			 return robot;
			
		}
		
	
}
