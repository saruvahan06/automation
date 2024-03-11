package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
//	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//	driver.findElement(By.className("decorativeSubmit")).click();
//	// driver.findElement(By.linkText("CRM/SFA")).click();
//	// driver.findElement(By.partialLinkText("CRM")).click();
//	driver.findElement(By.tagName("a")).click();
//	//driver.findElement(By.xpath(null))
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

	}
}
