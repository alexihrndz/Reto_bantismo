package gov.co.aerocivil.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EstadosFinancierosPage {

    public static final Target BOTON_BALANCES = Target.the("Boton de balances")
            .locatedBy("//div[@class='ms-rtestate-field' and text()='Balances']");
    public static final Target BANALANCE_NOV_2020 = Target.the("Balance Nov 2020")
            .locatedBy("//h2[@class='title-article' and contains(text(),'Estado de Situacion Financiera a 30 de noviembre de 2020')] ");
    private EstadosFinancierosPage() {
    }
}
