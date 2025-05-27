#Author: teste@gmail.com

@regressivo
Feature: Realizar Login
  Como usuario do site sauce demo
  Quero informar os dados de acesso
  Para acessar a area logada
  
Background: Acessar tela login
	Given que eu esteja na tela de login

  Scenario Outline: Login utilizando Schema / Scenario Outline
    When informar o usuário <usuário>
    And informar a senha <senha> 
    Then validar a mensagem <mensagem> 

    Examples: 
      |     usuário     | 			senha 			  | 							mensagem  								|
      | "standard_user" |    "secret_sauce"   | 							"Products" 								|
      | "standard_user" |        "" 			   	|		"Epic sadface: Password is required"  |
			|      ""					|    "secret_sauce" 	| 	"Epic sadface: Username is required"  |