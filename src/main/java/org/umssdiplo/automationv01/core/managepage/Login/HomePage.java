package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.ProductSelectionPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class HomePage extends BasePage {
    @FindBy(name = "//a[@href='/calzado_de_futbol-hombre']")
    private WebElement futbolLink;

    public void hoverHeaderLink(String menuItemName) {
        By by = By.xpath("//a[@href='/" + menuItemName + "']");
        CommonEvents.isVisible(by);
        WebElement menuItem = CommonEvents.getElement(by);
        CommonEvents.hover(menuItem);
    }

    public ProductSelectionPage clickOnFutbolLink() {
        By by = By.xpath("//a[@href='/calzado_de_futbol-hombre']");
        CommonEvents.isVisible(by);
        CommonEvents.clickElement(by);
        return new ProductSelectionPage();
    }
}
