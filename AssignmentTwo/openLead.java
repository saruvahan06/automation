package AssignmentTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class openLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saruvahan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(".V");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

	}
}
