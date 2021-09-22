package br.ce.seubarriga.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.seubarriga.core.BaseTest;
import br.ce.seubarriga.page.MenuPage;
import br.ce.seubarriga.page.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {
	MenuPage menuPage = new MenuPage();
	MovimentacaoPage movimentacaoPage = new MovimentacaoPage();
	
	@Test
	public void acessarTelaCriarMovimentacao() {
		menuPage.acessarTelaCriarMovimentacao();
		Assert.assertEquals("Seu Barriga - Movimentações", movimentacaoPage.tituloPagina());
		
	}
	@Test
	public void validarObrigatoriedadeDosCampos() {
		menuPage.acessarTelaCriarMovimentacao();
		movimentacaoPage.salvar();
		Assert.assertEquals("Data da Movimentação é obrigatório", movimentacaoPage.msgErroGenerica("Data da Movimentação"));
		Assert.assertEquals("Data do pagamento é obrigatório", movimentacaoPage.msgErroGenerica("Data do pagamento"));
		Assert.assertEquals("Descrição é obrigatório", movimentacaoPage.msgErroGenerica("Descrição"));
		Assert.assertEquals("Interessado é obrigatório", movimentacaoPage.msgErroGenerica("Interessado"));
		Assert.assertEquals("Valor é obrigatório", movimentacaoPage.msgErroGenerica("Valor"));
		Assert.assertEquals("Valor deve ser um número", movimentacaoPage.msgErroGenerica("Valor deve"));
	}
}

