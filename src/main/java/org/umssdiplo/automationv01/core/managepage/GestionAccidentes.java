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
    @FindBy(id = "Severidad")
    private WebElement severidad;
    @FindBy(id = "GuardarAccidente")
    private WebElement guardarAccidente;
    @FindBy(id = "EditarAccidente")
    private WebElement editarAccidente;
    @FindBy(id = "BorrarAccidente")
    private WebElement borrarAccidente;

    public GestionAccidentes() {
        //CommonEvents.waitWebElement(element);
    }

    public void setAccidentFields() {
        CommonEvents.setInputField(accidenteNombre, "Accidente1");
        CommonEvents.setInputField(accidenteDescripcion, "Descripcion1");
        CommonEvents.selectValue(accidenteTipo, "MedioAmbiente");
        CommonEvents.selectValue(severidad, "Alta");
    }

    public void setEditarAccidentFields() {
        CommonEvents.setInputField(accidenteNombre, "AccidenteModificado1");
        CommonEvents.setInputField(accidenteDescripcion, "DescripcionModificada1");
        CommonEvents.selectValue(accidenteTipo, "AccidenteDePersonal");
        CommonEvents.selectValue(severidad, "Baja");
    }

    public void clickGuardarAccidente() {
        CommonEvents.clickButton(this.guardarAccidente);
    }

    public void clickEditarAccidente() {
        CommonEvents.clickButton(this.editarAccidente);
    }

    public void clickBorrarAccidente() {
        CommonEvents.clickButton(this.borrarAccidente);
    }
}
