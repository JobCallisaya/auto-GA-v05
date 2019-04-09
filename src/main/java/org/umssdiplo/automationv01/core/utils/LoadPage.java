package org.umssdiplo.automationv01.core.utils;

import org.openqa.selenium.WebDriver;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Login.Home;

public final class LoadPage {
    public static Home homePage() {
        WebDriver webDriver = ManageDriver.getInstance().getWebDriver();
        webDriver.navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Home();
    }
}
