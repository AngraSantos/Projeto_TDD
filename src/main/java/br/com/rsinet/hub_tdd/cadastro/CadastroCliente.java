package br.com.rsinet.hub_tdd.cadastro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroCliente {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String URL = "http://www.advantageonlineshopping.com/#/";
		driver.get(URL);

		driver.findElement(By.id("menuUserSVGPath")).click();
		
		WebElement element = driver.findElement(By.linkText("CREATE NEW ACCOUNT"));	
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("CREATE NEW ACCOUNT")));
		Actions Action = new Actions(driver);
		Action.moveToElement(element).click().perform();
		
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
		System.out.println("Clicou no botão de criar nova conta");

// Sem espaço
//Limite de caracteres para usuario 15
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("AngraSantos");
		System.out.println("Na pagina de cadastro, incluiu o nome");

		driver.findElement(By.name("emailRegisterPage")).sendKeys("angra.santos@hotmail.com.br");
		System.out.println("Incluiu o email");

		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Angra123");
		System.out.println("Incluiu senha");

		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Angra123");
		System.out.println("Confirmou a senha");

		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Angra");
		System.out.println("Colocou o primeiro nome");

		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Souza");
		System.out.println("Colocou o segundo nome");

		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("11970510060");
		System.out.println("Colocou o numero");

		Select select = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		select.selectByVisibleText("Brazil");
		System.out.println("Selecionou o País");

		driver.findElement(By.name("cityRegisterPage")).sendKeys("SP");
		System.out.println("Incluiu a cidade");

		driver.findElement(By.name("addressRegisterPage")).sendKeys("Rua Três Marias");
		System.out.println("Incluiu o endereço");

		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("São Paulo");
		System.out.println("Incluiu o estado");

		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("01010-000");
		System.out.println("Incluiu a cep");

		
		driver.findElement(By.name("i_agree")).click();
		System.out.println("Clicou no checkbox");

		driver.findElement(By.id("register_btnundefined")).click();
		System.out.println("Clicou no registrar");

		// driver.close();
	}
}
