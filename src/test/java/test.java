
import Pages.MercadoLibrePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Name;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class test {
    private static WebDriver  driver;

    @Before
    public void startDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        MercadoLibrePage mercadoLibrePage = new MercadoLibrePage(driver);
    }
  @Test
    public void validar_precio_item(){

        driver.get("https://www.mercadolibre.com.ar/");
        System.out.println(driver.getTitle());
      MercadoLibrePage mercadoLibrePage =  new MercadoLibrePage(driver);
          mercadoLibrePage.clickCategorias();
          mercadoLibrePage.clickTecnologia();
          mercadoLibrePage.clickTelevisores();
          mercadoLibrePage.clickButtonOrderBy();
          mercadoLibrePage.clickMenorPrecio();
          mercadoLibrePage.clickFirstItem();
           assertEquals("21.999",mercadoLibrePage.getItemPrice());
}

        @After
        public void stoptDriver(){
            driver.quit();
        }
}
