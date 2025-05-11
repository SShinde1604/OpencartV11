package test_Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;  // make it static so that you can use same instance in Extent report manager
	public Properties p;

	@Parameters({"os", "browser"})
	@BeforeClass(groups= {"Sanity", "Regression", "Master"})

	public void setup(String os, String br) throws InterruptedException, IOException
	{	
		// loading config.properties file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);

		switch(br.toLowerCase())

		{ 
		case "chrome": driver=new ChromeDriver(); break;
		case "edge": driver=new EdgeDriver(); break;
		case "firefox": driver=new FirefoxDriver(); break;
		default : System.out.println("Invalid browser names"); return;	

		}


		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(p.getProperty("AppURL2"));   // reading url from properties file	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
	}

	@AfterClass(groups= {"Sanity", "Regression", "Master"})
	public void close()
	{
		driver.quit();
	}


	public String randomString()
	{
		String randomstring= RandomStringUtils.randomAlphabetic(6);
		return randomstring;	
	}


	public String randomNumber()
	{
		String randomNumber = RandomStringUtils.randomNumeric(10);
		return randomNumber;
	}


	public String randomAlphaNumeric()
	{
		String Alpha= RandomStringUtils.randomAlphabetic(3);
		String Num= RandomStringUtils.randomNumeric(3);
		return (Alpha+"@"+Num);
	}

	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try 
		{
			FileUtils.copyFile(source, new File(destination));
		} 
		catch (Exception e) 
		{
			e.getMessage();
		}
			return destination;
	}
	
	
}
