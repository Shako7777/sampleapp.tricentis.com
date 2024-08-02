package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/features",  // diretorio para cucumber.feature
	glue = { "steps" }, // buscar o pacote dos steps
    tags = "@preencherformulario" // tags de cada cenário criado no arquivo .feature
)
public class Runners {
}