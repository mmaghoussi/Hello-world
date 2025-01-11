import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Operations {
	
	WebDriver dr= new ChromeDriver();
	
  @BeforeTest
  public void config() {
	  
	  WebDriverManager.chromedriver().setup();
	  dr.manage().window().maximize();  
	  
	  
  }
  @Test
  public void OpenAvito() {
	  
	  dr.get("https://www.avito.ma");
	  org.testng.Reporter.log("Ouverture du site avito");
	  
  }
  @Test(priority = 1)
  public void LoginAvito() {
	  
	  dr.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[3]/span/span")).click();
	    dr.findElement(By.id("private-signin-email-or-phone")).sendKeys("maghoussi.marwane@gmail.com");
	    dr.findElement(By.id("private-signin-password")).sendKeys("Maghoussi2015");
	    
	    dr.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[2]/div[3]/button")).click();
	    
	    org.testng.Reporter.log("Connexion OK dans le site");
  }
  @Test(priority = 2)
  public void CloseAvito() {
	  
	  dr.quit();
	  org.testng.Reporter.log("Merci pour votre visite");
  }
}
