package org.basicPrograms;


import org.Utilities.BaseUtility;
import org.openqa.selenium.WebDriver;

public class OpenUrl {

	public static void main(String[] args) {
		String url="https://www.facebook.com/login/";
		BaseUtility bs=new BaseUtility();
		WebDriver driver=bs.startUp("ff", url);
		String expTitle="Log in to Facebook";
		String actTitle=driver.getTitle();
		if(expTitle.equals(actTitle))
		{
			System.out.println("login page title is same as expected title");
		}
		else {
			System.out.println("login page title is not same as expected title");
		}
		
		String actUrl=driver.getCurrentUrl();
		String expUrl="https://www.facebook.com/login/";
		if(expUrl.equalsIgnoreCase(actUrl))
		{
			System.out.println("Url is same as current url");
		}
		else
		{
			System.out.println("Url is not same as current url");
		}
	}

}
