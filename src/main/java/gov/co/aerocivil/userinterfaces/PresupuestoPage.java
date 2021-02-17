package gov.co.aerocivil.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PresupuestoPage {

    public static final Target BOTON_ESTADOS_FINANCIEROS = Target.the("Boton presupuesto")
            .locatedBy("//a[@class='btn-link' and text()='Estados financieros']");

    private PresupuestoPage() {
    }
}
