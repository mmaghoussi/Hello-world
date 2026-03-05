import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Operations {
	 
     
     
     
	WebDriver dr;
	AvitoPOM av;
	
	@BeforeTest
	public void setup() {
		
		
		   dr=new ChromeDriver();
		   dr.get("https://www.avito.ma");		
		   dr.manage().window().maximize();
		   
//		   JavascriptExecutor js = (JavascriptExecutor) dr0
//		   String script = "document.querySelectorAll(\"[id*=popup], [class*=popup], [id*=ad], [class*=ad]\").forEach(e => e.remove());";
//		   js.executeScript(script);
		   
		   av = new AvitoPOM(dr);
		   org.testng.Reporter.log("Ouverture du site avito", true);
	}
	
	@Test(priority = 0)
	public void LoginAvito() {
		
		av.OpenLoginPage();
		av.OpenBoutique();
		av.SetEmailAndPassword("maghoussi.marwane@gmail.com", "Maghoussi2015");
		av.CliqueConnectButton();
		
	}
    @Test(priority = 1)
	public void FinCars() {
    	
		av.FinCar("GOlf 7");
		av.Search();
	}
}
