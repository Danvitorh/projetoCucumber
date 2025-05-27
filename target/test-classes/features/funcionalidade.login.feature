#Author: your.email@your.domain.com


Feature: Funcionalidade Login
  	Como usuario do site sauce demo
  	Quero informar os dados de acesso
  	Para acessar a conta

Background: Acessar tela de login
		Given que eu esteja na tela de login

@positivo
  Scenario: Login valido
    When preencher os dados de login
    Then login sera realizado com sucesso
  
 @negativo @lento
	Scenario: Login invalido
    When preencher o usuario
    And nao preencher a senha
    And clicar no botao login
    Then o usuario recebera uma mensagem de erro
 