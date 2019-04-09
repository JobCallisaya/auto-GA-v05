package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class GestionAccidentes extends BasePage {
    @FindBy(id = "Nombre")
    private WebElement accidenteNombre;
    @FindBy(id = "Descripcion")
    private WebElement accidenteDescripcion;
    @FindBy(id = "AccidenteTipo")
    private WebElement accidenteTipo;
    @FindBy(id = "GuardarAccidente")
    private WebElement guardarAccidente;

    public void setAccidentFields() {
        CommonEvents.setInputField(accidenteNombre, "Accidente1");
        CommonEvents.setInputField(accidenteDescripcion, "Descripcion1");
        CommonEvents.clickButton(this.guardarAccidente);
    }
}
