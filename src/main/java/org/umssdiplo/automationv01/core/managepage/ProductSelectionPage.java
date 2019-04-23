package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class ProductSelectionPage extends BasePage {
    @FindBy(xpath = "//span[@class='gl-price__value gl-price__value--sale']")
    private WebElement shoesPriceBeforeBuying;

    @FindBy(name = "(//a[@href='/calzado-de-futbol-x-18.3-tf/BB9398.html'])[1]")
    private WebElement shoeLink;

    @FindBy(partialLinkText = "")
    private WebElement testing;

    public String getShoesPrice(String shoesName) {
        By by = By.xpath("//a[./div/div='" + shoesName + "']//span[@class='gl-price__value' or @class='gl-price__value gl-price__value--sale']");
        WebElement element = CommonEvents.isVisible(by);
        return CommonEvents.getTextContent(element);
    }

    public void clickOnShoeLink(String shoesName) {
        By by = By.xpath("//a[./div/div='" + shoesName + "']");
        CommonEvents.isVisible(by);
        CommonEvents.clickElement(by);
    }

    public void clickOnDropDown(String dropdownName) {
        By by = By.xpath("//button[@class='gl-dropdown__select label dropdown-select' and @title='Elige tu talla']");
        CommonEvents.clickElement(by);
    }

    public void selectDropdownItem(String dropdownItemName) {
        By by = By.xpath("//button[@class='gl-menu__element' and @title='" + dropdownItemName + "']");
        CommonEvents.clickElement(by);
    }

    public void clickOnButton(String buttonName) {
        By by = By.xpath("//button[@class='gl-cta gl-cta--primary gl-cta--full-width btn-bag' and contains(text(),'" + buttonName + "')]");
        CommonEvents.clickElement(by);
    }

    public void clickOnVerCarrito() {
        By by = By.xpath("//a[@href='//www.adidas.mx/on/demandware.store/Sites-adidas-MX-Site/es_MX/Cart-Show' and @class='gl-cta gl-cta--primary gl-cta--full-width gl-vspacing-s']");
        CommonEvents.clickElement(by);
    }

    public String getQuantity() {
        By by = By.xpath("//span[@data-auto-id='add-to-bag-product-info-qty']");
        WebElement element = CommonEvents.getElement(by);
        return element.getText().replace("Cantidad: ", "");
    }

    public String getItemTitle() {
        By by = By.xpath("//a[@href='https://www.adidas.mx/calzado-de-futbol-x-18.3-tf/BB9398_680.html?forceSelSize=BB9398_680' and @class='name']");
        WebElement element = CommonEvents.getElement(by);
        return element.getText();
    }
}
