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

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;

    @FindBy(partialLinkText = "")
    private WebElement testing;

    public String getShoesPrice() {
        return CommonEvents.getTextContent(this.shoesPriceBeforeBuying);
    }

    public void clickOnShoeLink() {
        By by = By.xpath("(//a[@href='/calzado-de-futbol-x-18.3-tf/BB9398.html'])[1]");
        CommonEvents.isVisible(by);
        CommonEvents.clickElement(by);
    }
}
