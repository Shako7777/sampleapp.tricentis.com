package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class RegisterPage extends BasePage {
	private Wait<WebDriver> wait;

	public RegisterPage(WebDriver driver) {

		super(driver);
		// TODO Auto-generated constructor stub
		this.wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(30000)).ignoring(NoSuchElementException.class);
	}

	public void clicarEngineKm() throws InterruptedException {
		Thread.sleep(1500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='engineperformance']")));
		driver.findElement(By.xpath("//*[@id='engineperformance']")).click();
	}

	public void inserirKmInvalido(String kmIncorreto) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='engineperformance']")));
		driver.findElement(By.xpath("//*[@id='engineperformance']")).sendKeys(kmIncorreto);

	}

	public void mensagemdeerro() throws InterruptedException {
		Thread.sleep(1500);
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//*[@id='insurance-form']/div/section[1]/div[2]/span")));

	}

	public void clicarMake() throws InterruptedException {
		Thread.sleep(1500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='make']")));
		driver.findElement(By.xpath("//*[@id='make']")).click();

	}

	public void selecionarVolvo() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='Volvo']")));
		driver.findElement(By.xpath("//option[@value='Volvo']")).click();

	}

	public void clicarModel() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='model']")));
		driver.findElement(By.xpath("//*[@id='model']")).click();
	}

	public void selecionarScooter() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='Scooter']")));
		driver.findElement(By.xpath("//option[@value='Scooter']")).click();
	}

	public void preencherCapacity(String ccm) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cylindercapacity']")));
		driver.findElement(By.xpath("//*[@id='cylindercapacity']")).click();
		driver.findElement(By.xpath("//*[@id='cylindercapacity']")).sendKeys(ccm);

	}

	public void preencherManufacture(String date) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='MM/DD/YYYY'])[1]")));
		driver.findElement(By.xpath("(//input[@placeholder='MM/DD/YYYY'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='MM/DD/YYYY'])[1]")).sendKeys(date);

	}

	public void preencherDrive() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[2]")));
		driver.findElement(By.xpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[2]")).click();
	}

	public void preencherFuel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='fuel']")));
		driver.findElement(By.xpath("//*[@id='fuel']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='Gas']")));
		driver.findElement(By.xpath("//option[@value='Gas']")).click();

	}

	public void clicarNext() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nextenterinsurantdata']")));
		driver.findElement(By.xpath("//*[@id='nextenterinsurantdata']")).click();

	}

	public void facoScroll() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("scroll(0,500);");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void takeScreenshot(String fileName) {
	    // Timestamp para o nome do arquivo 
	    String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	    // Diretório onde os screenshots serão salvos
	    String directory = "screenshots/";
	    // Nome completo do arquivo
	    String filePath = directory + fileName + "_" + timestamp + ".png";
	    // Tira o screenshot
	    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    try {
	        // Cria o diretório se ele não existir
	        File dir = new File(directory);
	        if (!dir.exists()) {
	            dir.mkdirs();
	        }
	        // Salva o screenshot 
	        FileHandler.copy(screenshot, new File(filePath));
	        System.out.println("Screenshot salvo em: " + filePath);
	    } catch (IOException e) {
	        System.out.println("Erro ao salvar screenshot: " + e.getMessage());
	    }
	}

}