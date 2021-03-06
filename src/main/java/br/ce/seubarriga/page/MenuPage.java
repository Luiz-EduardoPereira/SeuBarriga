package br.ce.seubarriga.page;

import org.openqa.selenium.By;

import br.ce.seubarriga.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarTelaInserirConta() {
		clicar(By.partialLinkText("Contas"));
		clicar(By.partialLinkText("Adicionar"));
	}
	public void acessarTelaListarContas() {
		clicar(By.partialLinkText("Contas"));
		clicar(By.partialLinkText("Listar"));
	}
	public void acessarTelaCriarMovimentacao() {
		clicar(By.partialLinkText("Criar Movimentação"));
	}
}
