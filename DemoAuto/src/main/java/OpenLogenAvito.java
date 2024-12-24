import java.awt.Window;

import org.apache.hc.client5.http.nio.ManagedAsyncClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLogenAvito {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.avito.ma");
		dr.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[3]/span/span")).click();
		

	}

}
