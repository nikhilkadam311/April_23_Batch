package org.basicPrograms;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkart_Login {

	public static void main(String[] args) {
		BaseUtility bs =new BaseUtility();
		WebDriver driver=bs.startUp("ch","https://www.flipkart.com/");
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("7385961556");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sonal@123");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		driver.findElement(By.xpath("//div[@class='go_DOp']//div//div//div//div[@class='exehdJ'][1]")).click();

	}

}