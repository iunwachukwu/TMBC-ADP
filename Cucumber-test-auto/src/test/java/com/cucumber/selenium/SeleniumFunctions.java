package com.cucumber.selenium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Innocent Nwachukwu
 *
 */
public class SeleniumFunctions {
	
	private WebElement userName;
	private WebElement password;
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	
	public static String baseURL = "https://github.com/";
	
	public void createDriver() throws MalformedURLException, InterruptedException {
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
		waitVar = new WebDriverWait(driver, 15);
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	public void isHomePageDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign in")));
		driver.findElement(By.linkText("Sign in")).isDisplayed();
		
	}
	
	public void clickSignInLink() {
		driver.findElement(By.linkText("Sign in")).click();
		
	}
	
	public void isLogInSectionDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.className("auth-form-body")));
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.className("btn")));
		
	}
	
	
	public void clickSignInButton() {
		
		userName = driver.findElement(By.xpath(".//*[@id='login_field']"));
		userName.sendKeys("iunwachukwu");
		
		password = driver.findElement(By.xpath(".//*[@id='password']"));
		password.sendKeys("tmbc@adp19");
		
		driver.findElement(By.className("btn")).click();
		
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='your_repos']/div/div[2]/ul/li[1]/a/span/span")));
		
		driver.findElement(By.xpath(".//*[@id='your_repos']/div/div[2]/ul/li[1]/a/span/span")).click();
		
	}
	
}
