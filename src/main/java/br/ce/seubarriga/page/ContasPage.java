package br.ce.seubarriga.page;

import org.openqa.selenium.By;

import br.ce.seubarriga.core.BasePage;

public class ContasPage extends BasePage {
	public void setNome(String nome) {
		escrever("nome", nome);
	}
	public void salvar() { 
		clicar(By.xpath("//button[.='Salvar']"));
	}
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	public String obterMensagemErro() {
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}
	public void botaoEditar() {
		clicar(By.xpath("//span[@class='glyphicon glyphicon-edit']"));
	}
	public void botaoRemover() {
		clicar(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
	}
}
