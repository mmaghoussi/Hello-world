import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenPageAv {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
	    WebDriver dr= new ChromeDriver();
	    dr.manage().window().maximize();
	    dr.get("https://www.avito.ma");
	    
	    
	    
	    dr.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[3]/span/span")).click();
	    dr.findElement(By.id("private-signin-email-or-phone")).sendKeys("maghoussi.marwane@gmail.com");
	    dr.findElement(By.id("private-signin-password")).sendKeys("Maghoussi2015");
	    
	    dr.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[2]/div[3]/button")).click();
	    
	   

	}

}
