package br.ce.seubarriga.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.seubarriga.core.BaseTest;
import br.ce.seubarriga.page.ContasPage;
import br.ce.seubarriga.page.MenuPage;

public class ContaTest extends BaseTest {
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testInserirConta() {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Itaú");
		contasPage.salvar();
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}
}
