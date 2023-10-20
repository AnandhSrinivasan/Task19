package org.Locators_Guvi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task19_Locators {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.guvi.in/register");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String webpage = driver.getCurrentUrl();
		System.out.println(webpage);
		
		WebElement logo= driver.findElement(By.xpath("//img[@alt='GUVI logo'][1]"));
		logo.getText();
		
		WebElement signwithgoogle = driver.findElement(By.id("WebElement logo"));
		signwithgoogle.click();
		
		WebElement orwithemail = driver.findElement(By.xpath("//span[text()='OR Sign-up with Email']"));
		orwithemail.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("LEO");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("DAS");
		
		WebElement emailid = driver.findElement(By.xpath("//input[@id='emailInput']"));
		emailid.sendKeys("LEODAS@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwordInput']"));
		password.sendKeys("parthiban1999");
		
		WebElement signupbutton = driver.findElement(By.xpath("//button[@id='signup']"));
		signupbutton.click();
		
		WebElement alreadyreg =  driver.findElement(By.xpath("//p[@class='secondary-link']"));
		alreadyreg.getText();
		
		WebElement loginanotherway =  driver.findElement(By.xpath("//a[text()='Log in']"));
		loginanotherway.click();
		
		Thread.sleep(3000);
		
		WebElement Dobbybot =  driver.findElement(By.xpath("/html/body/div[6]/button/img"));
		Dobbybot.click();
		
		Thread.sleep(3000);
		
		WebElement botname =   driver.findElement(By.id("chat-title"));
		botname.getText();
		
		Thread.sleep(3000);
		
		WebElement botsubtitle =  driver.findElement(By.xpath("//div[@class='sub-title']"));
		botsubtitle.getText();
		
		Thread.sleep(3000);
		
		WebElement welcomemessage =  driver.findElement(By.xpath("//div[text()='Welcome to the GUVI bot!']"));
		welcomemessage.getText();
		
		Thread.sleep(3000);
		
		WebElement yourmessage =   driver.findElement(By.xpath("//input[@aria-label='Type your message']"));
		yourmessage.sendKeys("Hai DobbyBot");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@id='sendIcon']")).click();
		
	}

}
