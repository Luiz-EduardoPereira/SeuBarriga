package br.ce.seubarriga.test;

import org.junit.Test;

import br.ce.seubarriga.core.BaseTest;
import br.ce.seubarriga.page.MenuPage;
import br.ce.seubarriga.page.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {
	MenuPage menuPage = new MenuPage();
	MovimentacaoPage movimentacaoPage = new MovimentacaoPage();
	
	@Test
	public void testAcessarTelaCriarMovimentacao() {
		menuPage.acessarTelaCriarMovimentacao();
	}
	@Test
	public void testvalidarObrigatoriedade() {
		menuPage.acessarTelaCriarMovimentacao();
		movimentacaoPage.salvar();
	}
}
