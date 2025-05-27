package steps;

import org.junit.After;

import elements.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class funcionalidadeLogin {
	
	
	Executa executa = new Executa();
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();	
	
	@After
	public void finalizarTeste() {
		executa.fecharNavegador();
	}
	
	@Given("que eu esteja na tela de login")
	public void que_eu_esteja_na_tela_de_login() {
	    executa.abrirNavegador();

	}

	@When("preencher os dados de login")
	public void preencher_os_dados_de_login() {
	   metodos.inserirDados(elementos.getUsername(), "standard_user");
	   metodos.inserirDados(elementos.getPassword(), "secret_sauce");
	   metodos.clicar(elementos.getLogin());
	}

	@Then("login sera realizado com sucesso")
	public void login_sera_realizado_com_sucesso() {
	    metodos.validarTexto(elementos.getTitulo(), "Products");
	}

	@When("preencher o usuario")
	public void preencher_o_usuario() {
		metodos.inserirDados(elementos.getUsername(), "standard_user");
	}

	@When("nao preencher a senha")
	public void nao_preencher_a_senha() {
	    metodos.inserirDados(elementos.getPassword(), "");
	}

	@When("clicar no botao login")
	public void clicar_no_botao_login() {
		metodos.clicar(elementos.getLogin());
	}

	@Then("o usuario recebera uma mensagem de erro")
	public void o_usuario_recebera_uma_mensagem_de_erro() {
	    metodos.validaMsgErro(elementos.getMsgErro(), "Epic sadface: Password is required");
	}
	
	@When("informar o usuário {string}")
	public void informar_o_usuário(String usuário) {
		metodos.inserirDados(elementos.getUsername(), usuário);
	}

	@When("informar a senha {string}")
	public void informar_a_senha(String senha) {
		metodos.inserirDados(elementos.getPassword(), senha);
		metodos.clicar(elementos.getLogin());
	}

	@Then("validar a mensagem {string}")
	public void validar_a_mensagem(String mensagem) {
	    metodos.validaMsg(mensagem);
	}

	
	
	
	
	
}
