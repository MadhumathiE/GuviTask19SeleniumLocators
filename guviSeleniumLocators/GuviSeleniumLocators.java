package guviSeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuviSeleniumLocators {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.guvi.in/register");
		driver.manage().window().maximize();
		//WebElement signupButton = driver.findElement(By.linkText("Sign up"));
		//signupButton.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Madhumathi");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("E");
		WebElement emailid = driver.findElement(By.id("emailInput"));
		emailid.sendKeys("madhu@1234");
		WebElement password = driver.findElement(By.id("passwordInput"));
		password.sendKeys("Madhu@1234");
		WebElement mobileno = driver.findElement(By.id("mobileNumberInput"));
		mobileno.sendKeys("0123456789");
		WebElement signupButton = driver.findElement(By.id("signup"));
		signupButton.click();

	}

}
