package com.cyient.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenEmrLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new FirefoxDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("https://www.cyient.com/");
		  
  String actualTitle = driver.getTitle();
  System.out.println(actualTitle);
  
  String actualUrl = driver.getCurrentUrl();
  System.out.println(actualUrl);
  
	}

}
