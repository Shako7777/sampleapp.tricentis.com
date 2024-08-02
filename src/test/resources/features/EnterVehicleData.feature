# language: pt
Funcionalidade: Aba Enter Vehicle Data

Contexto: 
    Dado eu estou na página inicial 

		@validarEngine
		Esquema do Cenario: Validar Campo Engine Performance [kW] com dados invalidos
    Quando eu insiro o dado de Km invalidos
    Então eu devo ver a mensagem de erro

		@selecionarMarca
    Esquema do Cenario: Selecionar Marca Veiculo
    Quando clico para selecionar marca Veiculo
    Então seleciono a marca Volvo
    
    @preencherformulario
    Esquema do Cenario: Preencher Formulário
    Quando preencho o formulário
    Então clico em Next