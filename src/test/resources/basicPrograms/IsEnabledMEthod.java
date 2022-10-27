package org.basicPrograms;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsEnabledMEthod {

	public static void main(String[] args) {
		BaseUtility bs=new BaseUtility();
		WebDriver driver=bs.startUp("ch","http://localhost:99/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password' and @name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}

}
