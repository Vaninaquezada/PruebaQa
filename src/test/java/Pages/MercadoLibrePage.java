package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class MercadoLibrePage {
    private static WebDriver  driver;

    //<a href="https://www.mercadolibre.com.ar/categorias#nav-header" class="nav-menu-categories-link" data-js="nav-menu-categories-trigger" rel="nofollow" tabindex="7" xpath="1">Categorías</a>
    public  By MENU_CATEGORIAS = By.xpath("//a[contains(text(),'Categorías')]");

    //<a href="#" data-order="0" class="" xpath="1">Tecnología</a>
    public  By MENU_TECNOLOGIA = By.xpath("//a[contains(text(),'Tecnología')]");

    //<a href="https://televisores.mercadolibre.com.ar/televisores/#menu=categories" xpath="1">Televisores</a>
    public  By MENU_TELEVISORES = By.xpath("//a[contains(text(),'Televisores')]");

    //<button type="button" class="andes-dropdown__trigger" tabindex="-1" xpath="1">Menor precio<div class="andes-dropdown__arrow"></div></button>
    public  By BUTTON_SELECT_ORDER_BY = By.xpath("//button[@class= 'andes-dropdown__trigger']");

    //<a class="andes-list__item-primary andes-list__item andes-dropdown-item-hover andes-list__item--selected ui-search-link"><div class="andes-list__item-image-container"><div class="andes-list__item-text">Menor precio</div></div></a>
    public  By MENOR_PRECIO_OPTION = By.xpath("//a[div[div[contains(text(),'Menor precio')]]]");

    //<a href="https://www.mercadolibre.com.ar/tv-dalton-da-le32x3663-led-hd-32/p/MLA15796131?pdp_filters=category:MLA1002#searchVariation=MLA15796131&amp;position=1&amp;type=product&amp;tracking_id=06e9ae14-4820-4f4e-994e-2606f452244e" class="ui-search-item__group__element ui-search-link" title="TV Dalton DA-LE32X3663 LED HD 32&quot;" xpath="1"><h2 class="ui-search-item__title">TV Dalton DA-LE32X3663 LED HD 32"</h2></a>
    public  By FIRST_ITEM = By.xpath("//ol[1]/li[@class = 'ui-search-layout__item'][1]//div//a[h2]");

    public  By ITEM_PRICE = By.xpath("//div[@class='ui-pdp-price__second-line']//span[@class='price-tag-fraction']");

    public MercadoLibrePage(WebDriver  driver){
        this.driver =driver;
    }
    public void clickCategorias(){

        driver.findElement(MENU_CATEGORIAS).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(MENU_CATEGORIAS).click();

    }
    public void clickTecnologia(){
        driver.findElement(MENU_TECNOLOGIA).click();
    }
    public void clickTelevisores(){

        driver.findElement(MENU_TELEVISORES).click();
    }
    public void clickButtonOrderBy(){
        driver.findElement(BUTTON_SELECT_ORDER_BY).click();
    }
    public void clickMenorPrecio(){
        driver.findElement(MENOR_PRECIO_OPTION).click();
    }
    public void clickFirstItem(){
        driver.findElement(FIRST_ITEM).click();
    }
    public String getItemPrice(){
       return  driver.findElement(ITEM_PRICE).getText();

    }


}
