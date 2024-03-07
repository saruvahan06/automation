package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/login/\r\n");
		driver.findElement(By.id("email")).sendKeys("9884100358");
		driver.findElement(By.name("pass")).sendKeys("Saruvhan1234arun5");
		driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();

	}
}
