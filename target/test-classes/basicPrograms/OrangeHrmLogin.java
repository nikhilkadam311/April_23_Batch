package org.basicPrograms;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmLogin {
	public static void main(String[] args) {
		BaseUtility bs=new BaseUtility();
		String url="https://opensource-demo.orangehrmlive.com/";
		WebDriver driver=bs.startUp("ch", url);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");;
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");;
		driver.findElement(By.id("btnLogin")).click();

	}
}
