package testsFront;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	private WebDriver driver;

	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chrome-driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void TesteLogin() {
		driver.get("http://localhost:4200/");
		
		// Cadastro
		driver.findElement(By.xpath("/html/body/app-root/app-header/section/div/nav/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/p[1]/a")).click();
		driver.findElement(By.id("nome")).sendKeys("TesteAutomatico");
		driver.findElement(By.id("email")).sendKeys("testeautomatico@email.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		
		// Login
		driver.findElement(By.xpath("/html/body/app-root/app-header/section/div/nav/a[3]")).click();
		driver.findElement(By.id("email")).sendKeys("testeautomatico@email.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/button")).click();
		
	}
}
