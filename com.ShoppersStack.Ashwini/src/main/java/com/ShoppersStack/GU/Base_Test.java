package com.ShoppersStack.GU;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack.pom.Home_Page;
import com.ShoppersStack.pom.Login_Page;
import com.ShoppersStack.pom.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test {
	
	public File_Utility fileutility= new File_Utility();
	public WebDriver driver;
	public static WebDriver sdriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public Welcome_Page welcome;
	public Login_Page loginpage;
	public Home_Page homepage;
	public JavaUtility javaUtility = new JavaUtility();
	public WebDriverWait wait;
	public Webdriver_Utility webDriverUtility = new Webdriver_Utility();
	
	
	
	@BeforeSuite
	public void beforesuit() 
	{
		System.out.println("@BeforeSuit");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("@BeforeTest");
		
		spark = new ExtentSparkReporter(FrameWork_Constant.extentReportPath+javaUtility.localDateTime()+".html");
		reports= new ExtentReports();
		reports.attachReporter(spark);
		
	}
	@BeforeGroups
	public void beforeGroups() 
	{
		System.out.println("@BeforeGroups");
	}
	@BeforeClass
	public void beforeClass() throws IOException 
	{
		System.out.println("@BeforeClass");
		
		
//		String Browsername = fileutility.readPropertyData("Browsername");
//		String url = fileutility.readPropertyData("url");
//		
		 
		
		//https://www.shoppersstack.com/
		 String url = System.getProperty("url");
		String Browsername = System.getProperty("Browsername");
		
	//	String Browsername = "chrome";
		if(Browsername.contains("chrome"))
		{
			driver=new ChromeDriver();
	
		}
 
		else if(Browsername.contains("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else if(Browsername.contains("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else 
		{
			System.out.println("Enter valid browser name");
		}
		
		sdriver = driver;
		 homepage = new Home_Page(driver);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException 
	{
		System.out.println("@BeforeMethod");
		String username = fileutility.readPropertyData("username");
		String password = fileutility.readPropertyData("password");
		
		welcome = new Welcome_Page(driver);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(welcome.getLoginbutton()));
		Thread.sleep(5000);
		
		welcome.getLoginbutton().click();
		
		
		loginpage = new Login_Page(driver);
		loginpage.getEmail_TextField().sendKeys(username);
		loginpage.getPasswordText().sendKeys(password);
		loginpage.getLoginButton().click();
		
		
		
	}
	

	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("@AfterMethod");
		
		homepage.getAccountSetting().click();
		homepage.getLogoutbutton().click();

	}
	
	@AfterClass
	public void afterClass() throws InterruptedException 
	{
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterGroups
	public void afterGroups() 
	{
		System.out.println("@AfterGroups");
		
	}
	
	@AfterTest
	public void AfterTest() 
	{
		System.out.println("@BeforeTest");
		reports.flush();
	}
	
	@AfterSuite
	public void Aftersuit() 
	{
		System.out.println("@BeforeSuit");
	}
	

}
