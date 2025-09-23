import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Operations {
	 
     
     
     
	  WebDriver dr;
	
  @BeforeTest
 public void config() {
	  
	  dr=new ChromeDriver();
	  
//	  
//	  ChromeOptions options = new ChromeOptions();
//	  
//	  
//      options.addArguments("--headless"); // Mode headless
//      options.addArguments("--disable-gpu"); // (Optionnel pour Windows)
//      options.addArguments("--window-size=1920,1080");
//      
//      dr=new ChromeDriver(options);
//      WebDriverManager.chromedriver().setup();
//	  dr.manage().window().maximize();  
//	  
	  
  }
  

@Test(priority = 0)
  public void OpenAvito() {
	  
	  dr.get("https://www.avito.ma");		
	  
	  JavascriptExecutor js = (JavascriptExecutor) dr;
      String script = "document.querySelectorAll(\"[id*=popup], [class*=popup], [id*=ad], [class*=ad]\").forEach(e => e.remove());";
      js.executeScript(script);
      
	  org.testng.Reporter.log("Ouverture du site avito");
	  
  }
  @Test(priority = 1)
  public void LoginAvito() {
	  
	   dr.findElement(By.xpath("//*[@id=\"__next\"]/div/nav/div/div[3]/ul/li[1]/span/span")).click();
	   dr.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[2]/button")).click();
	   
	    
	    dr.findElement(By.id("shop-signin-email")).sendKeys("maghoussi.marwane@gmail.com");
	    dr.findElement(By.id("shop-signin-password")).sendKeys("Maghoussi2015");
	    dr.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div/div[2]/form/button")).click();
	    
	    
	    org.testng.Reporter.log("Connexion OK dans le site AVITO ");
	    
	    //dr.findElement(By.xpath("//*[@id=\"__next\"]/div/nav/div/div[1]/a/span/img")).click();
  }
  
  @Test(priority = 2)
  public void FindCar() throws InterruptedException {
	  
	
	  Thread.sleep(1000);
	  WebElement Find= dr.findElement(By.xpath("//*[@id=\"keyword-suggestion\"]/div/input")); 
	  Find.sendKeys("Any Car");
	  Thread.sleep(1000);
	  dr.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div/button[2]")).click();
	  org.testng.Reporter.log("La recherche est bien lancée parfaitement");
  }

  
  @Test(priority = 3)
  public void CloseAvito() {
	  
	  dr.quit();
	  org.testng.Reporter.log("Merci pour votre visite a la prochaine bay");
  }
}
