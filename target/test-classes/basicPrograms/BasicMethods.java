package org.basicPrograms;

import org.Utilities.BaseUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicMethods {

	public static void main(String[] args) {
		BaseUtility bs=new BaseUtility();
		WebDriver driver=bs.startUp("ch", "https://demoqa.com/radio-button");
		System.out.println("getTitle::"+driver.getTitle());
		System.out.println("getCurrentUrl::"+driver.getCurrentUrl());
		System.out.println("getPageSource::"+driver.getPageSource());
		WebElement ele=driver.findElement(By.cssSelector("label[for='yesRadio']"));
		System.out.println("getText::"+ele.getText());
		//driver.findElement(By.id("yesRadio"));
		WebElement ele2=driver.findElement(By.xpath("//lael[@for='yesRadio']"));
		ele2.click();
		System.out.println("isSelected::"+ele.isSelected());
		System.out.println("isDisplayed::"+ele.isDisplayed());
		System.out.println("isEnabled::"+ele.isEnabled());
		System.out.println("program endss.........");
	}

}
