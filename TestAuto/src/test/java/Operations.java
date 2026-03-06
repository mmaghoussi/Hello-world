import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


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
		org.testng.Reporter.log("Conexion OK", true);
		
	}
    @Test(priority = 1)
	public void FinCars() {
    	
		av.FinCar("GOlf 7");
		av.Search();
		av.ClicAnnonce();
		org.testng.Reporter.log("Affichage des annonces", true);
	}
}
