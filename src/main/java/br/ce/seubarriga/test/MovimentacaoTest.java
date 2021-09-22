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
		Assert.assertEquals("Seu Barriga - Movimenta��es", movimentacaoPage.tituloPagina());
		
	}
	@Test
	public void validarObrigatoriedadeDosCampos() {
		menuPage.acessarTelaCriarMovimentacao();
		movimentacaoPage.salvar();
		Assert.assertEquals("Data da Movimenta��o � obrigat�rio", movimentacaoPage.msgErroGenerica("Data da Movimenta��o"));
		Assert.assertEquals("Data do pagamento � obrigat�rio", movimentacaoPage.msgErroGenerica("Data do pagamento"));
		Assert.assertEquals("Descri��o � obrigat�rio", movimentacaoPage.msgErroGenerica("Descri��o"));
		Assert.assertEquals("Interessado � obrigat�rio", movimentacaoPage.msgErroGenerica("Interessado"));
		Assert.assertEquals("Valor � obrigat�rio", movimentacaoPage.msgErroGenerica("Valor"));
		Assert.assertEquals("Valor deve ser um n�mero", movimentacaoPage.msgErroGenerica("Valor deve"));
	}
}

