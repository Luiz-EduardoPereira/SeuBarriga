package br.ce.seubarriga.page;

import org.openqa.selenium.By;

import br.ce.seubarriga.core.BasePage;

public class MovimentacaoPage extends BasePage {
	public void salvar() {
		clicar(By.xpath("//button[.='Salvar']"));
	}
	public String msgErroGenerica(String msg) {
		return obterTexto(By.xpath("//li[contains(.,'"+msg+"')]"));	
	}
	public String tituloPagina() {
		return guia();
	}
}



