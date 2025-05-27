package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		dryRun = false,
		tags = "@regressivo",
		monochrome = false,
		plugin = {"pretty", "html:target/cucumber-report.html"}
		)



public class Executa extends Driver {

	public static void abrirNavegador() {
		
		String site = "https://www.saucedemo.com/";
		String navegador = "Chrome" ;
	
		
		if (navegador.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(site);
		driver.manage().window().maximize();
	}
	
	public void fecharNavegador() {
		driver.quit();
		
	}
	
	
	
	
	
}
