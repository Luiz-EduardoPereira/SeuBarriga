package br.ce.seubarriga.page;

import static br.ce.seubarriga.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.ce.seubarriga.core.BasePage;

public class LoginPage extends BasePage {
	public void acessarTelaInicial() {
		getDriver().get("https://seubarriga.wcaquino.me/");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	public void botaoEntrar() {
		clicar(By.xpath("//button[.='Entrar']"));
	}
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		botaoEntrar();
	}
	
}
