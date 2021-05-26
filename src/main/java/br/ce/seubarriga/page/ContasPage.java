package br.ce.seubarriga.page;

import org.openqa.selenium.By;

import br.ce.seubarriga.core.BasePage;

public class ContasPage extends BasePage {
	public String buscarLabelNome() {
		return obterTexto(By.xpath("//label[@for='nome']"));
	}

	public void buscarInputCampoNome() {
		buscarCampo(By.xpath("//label[@for='nome']/../input"));
	}

	public void buscarBotaoSalvar() {
		buscarCampo(By.xpath("//button[.='Salvar']"));
	}

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

	public String buscarCabecalhoConta() {
		return obterTexto(By.xpath("//table[@id='tabelaContas']//tr/th[.='Conta']"));
	}

	public String buscarCabecalhoAcoes() {
		return obterTexto(By.xpath("//table[@id='tabelaContas']//tr/th[.='Ações']"));
	}

	public String buscarListagemConta(String Conta) {
		return obterTextos(By.xpath("//table[@id='tabelaContas']//tr/td[.='"+Conta+"']"));
	}

	public void buscarBotaoEditar() {
		buscarElemento(By.xpath("//table[@id= 'tabelaContas']//tr/td[2]//span[@class='glyphicon glyphicon-edit']"), 5);
	}

	public void buscarBotaoRemover() {
		buscarElemento(By.xpath("//table[@id= 'tabelaContas']//tr/td[2]//span[@class='glyphicon glyphicon-remove-circle']"),5);
	}
}
