# sampleapp.tricentis.com
# Automação de Testes para o Site Sample App Tricentis

Este projeto contém testes automatizados para o site [Sample App Tricentis](https://sampleapp.tricentis.com/101/app.php). Utilizamos o Selenium WebDriver para interagir com o navegador, e o Cucumber para definir e executar os testes baseados em comportamento (BDD).

## Tecnologias Utilizadas

- **Java**: Linguagem de programação usada para escrever os testes.
- **Selenium WebDriver**: Ferramenta para automação de navegadores.
- **Cucumber**: Ferramenta BDD para definir os testes de maneira legível e executá-los.

## Pré-requisitos

- **Java JDK**: Versão 11 ou superior.
- **Maven**: Gerenciador de dependências.
- **ChromeDriver**: Versão compatível com a versão do Google Chrome instalada.

## Configuração do Ambiente

1. **Instalar o Java JDK**
   - Baixe e instale o Java Development Kit (JDK) 11 ou superior [aqui](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - Verifique a instalação com:
     ```sh
     java -version
     ```

2. **Instalar o Maven**
   - Baixe e instale o Maven [aqui](https://maven.apache.org/download.cgi).
   - Verifique a instalação com:
     ```sh
     mvn -version
     ```

3. **Baixar o ChromeDriver**
   - Baixe o ChromeDriver correspondente à sua versão do Google Chrome [aqui](https://sites.google.com/a/chromium.org/chromedriver/downloads).
   - Extraia o arquivo baixado e coloque o executável em um diretório acessível, como `C:\webdriver\chromedriver.exe`.

## Estrutura do Projeto

```plaintext
src
└── test
    ├── java
    │   └── pages
    │       └── BasePage.java
    │       └── HomePage.java
    │       └── RegisterPage.java
    │   └── runners
    │       └── Runners.java
    │   └── steps
    │       └── CostumerManagerSteps.java
    └── resources
        └── features
            └── EnterVehicleData.feature


