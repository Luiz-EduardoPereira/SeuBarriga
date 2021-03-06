package br.ce.seubarriga.core;

import static br.ce.seubarriga.core.DriverFactory.getDriver;
import static br.ce.seubarriga.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.ce.seubarriga.page.LoginPage;

public class BaseTest {
	private LoginPage page = new LoginPage();
	@Rule
	public TestName nomeTeste = new TestName();
	
	@Before
	public void inicializa() {
		page.acessarTelaInicial();
		page.logar("lep@hotmail.com", "123");
	}
	@After
	public void fecharBrowser() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) getDriver();
		File print = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(print, new File("target"+File.separator+"screenshot"+File.separator+nomeTeste.getMethodName()+".jpg"));
		
		if (Propriedades.FECHAR_BROWSER) {
				killDriver();
		}
	}
}
