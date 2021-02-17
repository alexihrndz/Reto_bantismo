package gov.co.aerocivil.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeAerocivil {

    public static final Target LINK_TRANSPARENCIA = Target.the("Link de transparencia")
            .locatedBy("//span[@class='menu-item-text' and text()='Transparencia']");
    public static final Target LINK_PRESUPUESTO = Target.the("Link presupuesto")
            .locatedBy("//span[@class='menu-item-text' and text()='Presupuesto']");

    private HomeAerocivil() {
    }
}
