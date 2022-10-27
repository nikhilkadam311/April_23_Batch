package org.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseUtility {
	public void visibilityOfMethod(WebElement ele,int time,WebDriver driver)
	{
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
	public void visibilityOfElementMethod(By loc,int time,WebDriver driver)
	{
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	public WebDriver startUp(String browserName,String url)
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("ch")||browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("start-maximized");
			driver=new ChromeDriver(option);
			//driver.manage().window().setSize(new Dimension(300,400));
		}
		else if(browserName.equalsIgnoreCase("ff")||browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().setSize(new Dimension(300,500));
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			EdgeOptions option=new EdgeOptions();
			option.addArguments("start-maximized");
			driver=new EdgeDriver(option);
		}
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		return driver;
		/*public void attributeContains(WebDriver driver,int time,By locator,String attribute,String value)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.attributeContains(locator,attribute,value));	
		}
		public void attributeContainsWebElement(int time,WebDriver driver,String attributeValue,String value,WebElement ele)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.attributeContains(ele, attributeValue,value));
		}
		public void attributeToBeMethod(By loc, String attributeValue, String value,int time,WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.attributeToBe(loc, attributeValue,value));
		}
		public void elementToBeClickableMethod(By loc,int time,WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeClickable(loc));
			
		}
		public void frameToBeAvailableAndSwitchToItMethod(By loc,int time,WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeClickable(loc));
		}
		public void invisibilityofMethod(WebElement ele,int time,WebDriver driver1)
		{
			WebDriverWait wait=new WebDriverWait(driver1,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.invisibilityOf(ele));
		}
		public void textToBePresentInElementMethod (WebElement ele,int time,WebDriver driver,String text)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.textToBePresentInElement(ele,text));
		}
		*/
	}

}