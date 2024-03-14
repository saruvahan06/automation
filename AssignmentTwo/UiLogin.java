package weekk4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiLogin {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/welcome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//small[@class='form-text text-white'])[2]")).click();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saruvhanarun@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("122324354646");
		driver.findElement(By.id("firstName")).sendKeys("saruvahan");
		Thread.sleep(2000);

		driver.findElement(By.name("lastName")).sendKeys(".v");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Middle Name Or Initial']/following::input")).sendKeys("v");
		driver.findElement(By.xpath("//select[@id='sex']/option[text()='Male']")).click();
		driver.findElement(By.xpath("//select[@name='title']/option[text()='Mr ']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@id='employmentStatus']/option[text()=' Unemployed']")).click();
		driver.findElement(By.xpath("//select[@id='maritalStatus']/option[text()=' Single']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Date of birth ']/following::input")).sendKeys("02/06/2003");
		driver.findElement(By.xpath("//select[@id='maritalStatus']/option[text()=' Single']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("numberOfDependents")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("saru");
	}
}
