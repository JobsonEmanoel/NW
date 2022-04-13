package senaicursos;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testecurso {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdrive.chrome.driver", "C:\\Arquivos de Progamas\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		}
	
	@Test
	public void testeNavergador() {
		driver.get("https://sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("oqEstabuscando")).sendKeys("gestão");
		driver.findElement(By.className("btnBuscaJavaScript")).click();
	}
}
