package org.Locators_Guvi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task19_Locators {

	// static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.guvi.in/register");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		String webpage = driver.getCurrentUrl();
		System.out.println(webpage);

		WebElement logo = driver.findElement(By.xpath("//img[@alt='GUVI logo'][1]"));
		logo.getText();

		WebElement signwithgoogle = driver.findElement(By.id("WebElement logo"));
		signwithgoogle.click();

		WebElement orwithemail = driver.findElement(By.xpath("//span[text()='ORSign-up with Email']"));
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

		WebElement alreadyreg = driver.findElement(By.xpath("//p[@class='secondary-link']"));
		alreadyreg.getText();

		WebElement loginanotherway = driver.findElement(By.xpath("//a[text()='Login']"));
		loginanotherway.click();

		Thread.sleep(3000);

		WebElement Dobbybot = driver.findElement(By.xpath("/html/body/div[6]/button/img"));
		Dobbybot.click();

		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.id("ymIframe")));
		driver.switchTo();

		Thread.sleep(3000);
		WebElement botname = driver.findElement(By.id("chat-title"));
		botname.getText();

		Thread.sleep(3000);

		WebElement botsubtitle = driver.findElement(By.xpath("//div[@class='sub-title']"));
		System.out.println(botsubtitle.getText());

		Thread.sleep(3000);

		WebElement welcomemessage = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]"));
		System.out.println(welcomemessage.getText());

		Thread.sleep(3000);

		WebElement yourmessage = driver.findElement(By.xpath("//input[@aria-label='Type your message']"));
		yourmessage.sendKeys("Hai DobbyBot");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//i[@id='sendIcon']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[6]/button[1]/i[1]")).click();

		Thread.sleep(3000);

		driver.close();

	}

}
