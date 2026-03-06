import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AvitoPOM {
	

	WebDriver dr;
	
	
	//Locator pour le test login
	
	By email = By.id("shop-signin-email");
	By password = By.id("shop-signin-password");
	By connect = By.cssSelector("button[type='submit']");
	By Seconnect = By.xpath("/html/body/div/div[2]/div[1]/nav/div/div[3]/ul/li[1]/span/span");
	By Boutique = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[2]/button");
	
	
	//Locator pour le test recherche voiture
	By TextSeach = By.xpath("//input[contains(@placeholder,'recherchez')]");
	By SeachButton= By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/button[3]");
	
	
	WebDriverWait wait;
	
	public  AvitoPOM(WebDriver driver) {
		
		this.dr=driver;
		wait = new WebDriverWait(dr, Duration.ofSeconds(10));

		
	}
	
	// méthode pour cliquer sur le lien Se connecter
	public void OpenLoginPage() {
		
		wait.until(ExpectedConditions.elementToBeClickable(Seconnect)).click();
		
		
	}
	
	//Methode pour niviguer a la page boutique
	public void OpenBoutique() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(Boutique)).click();;
		
	}
	
	// méthode pour saisie l'asresse mail
	public void SetEmailAndPassword(String Email, String Password){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(Email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(Password);
	}
	
	public void CliqueConnectButton() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(connect)).click();
		Reporter.log("COnexion OK");
	}
	
	public void FinCar(String CarName) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(TextSeach)).sendKeys(CarName);
	}
	public void Search() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(SeachButton)).click();
		Reporter.log("Recher bien lancée");
	}
	
		
	
	

}

