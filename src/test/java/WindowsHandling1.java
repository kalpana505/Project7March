import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalpana\\eclipse-workspace\\kalpana_ws\\SeleniumDay1\\src\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//WebElement btn = driver.findElement(By.xpath("//button[text()='X']"));
		//btn.click();
		//Thread.sleep(3000);
		
		
		WebElement btnSearch = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		btnSearch.sendKeys("mobiles",Keys.ENTER);
		
		Thread.sleep(7000);
		
		WebElement mobile = driver.findElement(By.xpath("//div[text()='Realme 5i (Aqua Blue, 128 GB)']"));
		mobile.click();
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
	}

}
