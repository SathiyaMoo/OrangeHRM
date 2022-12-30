package commonfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {

	public static Properties properties ;

	public ChromeDriver driver;
	
	public FirefoxDriver driverf;

	public  Properties loadPropertyFile() throws IOException {

		FileInputStream fileinputstream = new FileInputStream("config.properties");
		 properties = new Properties();
		properties.load(fileinputstream);
		return properties;
	}
	
	@BeforeSuite
	public void LounchBrowser () throws IOException {
		 loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		
        if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver = new ChromeDriver(ch);
		
		}else if (browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			 driverf = new FirefoxDriver();
			
		}
        
        driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}

	@AfterSuite
	public void tearDown() {

	}
}
