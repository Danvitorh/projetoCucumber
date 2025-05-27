package elements;

import org.openqa.selenium.By;

public class Elementos {

	private By username = By.xpath("//input[@id='user-name']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='login-button']");
	private By titulo = By.xpath("//span[@class='title']");
	private By msgErro = By.xpath("//h3[@data-test='error']");
	
	
	
	public By getUsername() {
		return username;
	}




	public By getPassword() {
		return password;
	}




	public By getLogin() {
		return login;
	}




	public By getTitulo() {
		return titulo;
	}




	public By getMsgErro() {
		return msgErro;
	}
	
}
