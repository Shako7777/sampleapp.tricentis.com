package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import pages.RegisterPage;

public class CostumerManagerStep {
	WebDriver driver;

	@Dado("eu estou na página inicial")
	public void eu_estou_na_página_inicial() {
		// Caminho para o chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\caio_\\chromedriver.exe");
		// Inicializa o ChromeDriver
		driver = new ChromeDriver();
		// Abre a página inicial
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
	}

	@Quando("eu insiro o dado de Km invalidos")
	public void eu_insiro_o_dado_de_km_invalidos() throws InterruptedException {
		new RegisterPage(driver).clicarEngineKm();
		new RegisterPage(driver).inserirKmInvalido("1000Km");
	}

	@Então("^eu devo ver a mensagem de erro$")
	public void eu_devo_ver_a_mensagem_de_erro() throws InterruptedException {
		new RegisterPage(driver).mensagemdeerro();
		new RegisterPage(driver).takeScreenshot("Mensagem de Erro");
	}

	@Quando("clico para selecionar marca Veiculo")
	public void clico_para_selecionar_marca_veiculo() throws InterruptedException {
		new RegisterPage(driver).clicarMake();
	}

	@Então("seleciono a marca Volvo")
	public void seleciono_a_marca_volvo() {
		new RegisterPage(driver).selecionarVolvo();
		new RegisterPage(driver).takeScreenshot("Selecionar Volvo");
	}

	@Quando("preencho o formulário")
	public void preencho_o_formulário() throws InterruptedException {
		new RegisterPage(driver).clicarMake();
		new RegisterPage(driver).selecionarVolvo();
		new RegisterPage(driver).clicarModel();
		new RegisterPage(driver).selecionarScooter();
		new RegisterPage(driver).preencherCapacity("123");
		new RegisterPage(driver).preencherManufacture("01/01/2023");
		new RegisterPage(driver).preencherDrive();
		new RegisterPage(driver).preencherFuel();

	}

	@Então("clico em Next")
	public void clico_em_next() {
		new RegisterPage(driver).facoScroll();
		new RegisterPage(driver).takeScreenshot("Next");
		new RegisterPage(driver).clicarNext();
		new RegisterPage(driver).takeScreenshot("Aba Enter Insurant Data");
	}

	// Fecha o navegador
	 @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
