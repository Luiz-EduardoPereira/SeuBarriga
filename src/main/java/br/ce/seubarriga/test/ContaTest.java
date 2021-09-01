package br.ce.seubarriga.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.seubarriga.core.BaseTest;
import br.ce.seubarriga.page.ContasPage;
import br.ce.seubarriga.page.MenuPage;

public class ContaTest extends BaseTest {
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	String primeiroBanco = "Banco do Brasil";
	String segundoBanco = "Nubank";
	@Test
	public void testInserirConta() {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome(primeiroBanco);
		contasPage.salvar();
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}

	@Test
	public void testAlterarConta() {
		menuPage.acessarTelaListarContas();
		contasPage.botaoEditar();
		contasPage.setNome(segundoBanco);
		contasPage.salvar();
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
	}

	@Test
	public void testCriarContaMesmoNome() {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome(segundoBanco);
		contasPage.salvar();
		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());
	}

	@Test
	public void testRemoverConta() {
		menuPage.acessarTelaListarContas();
		contasPage.botaoRemover();
			Assert.assertEquals("Conta removida com sucesso!", contasPage.obterMensagemSucesso());
	}

	@Test
	public void testInserirContaVazia() {
		menuPage.acessarTelaInserirConta();
		contasPage.salvar();
		Assert.assertEquals("Informe o nome da conta", contasPage.obterMensagemErro());
	}

	@Test
	public void testValidarCamposTelaInserirConta() {
		menuPage.acessarTelaInserirConta();
		contasPage.buscarLabelNome();
		contasPage.buscarInputCampoNome();
		contasPage.buscarBotaoSalvar();
	}

	@Test
	public void testValidarCamposTelaListarConta() {
		menuPage.acessarTelaListarContas();
		Assert.assertEquals("Conta", contasPage.buscarCabecalhoConta());
		Assert.assertEquals("Ações", contasPage.buscarCabecalhoAcoes());
		Assert.assertEquals(segundoBanco, contasPage.buscarListagemConta(segundoBanco));
		Assert.assertEquals(primeiroBanco, contasPage.buscarListagemConta(primeiroBanco));
		contasPage.buscarBotaoRemover();
		contasPage.buscarBotaoEditar();
	}
}
