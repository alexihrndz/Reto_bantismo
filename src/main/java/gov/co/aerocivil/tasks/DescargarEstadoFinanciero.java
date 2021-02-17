package gov.co.aerocivil.tasks;

import gov.co.aerocivil.interactions.SwitchToNewWindow;
import gov.co.aerocivil.userinterfaces.EstadosFinancierosPage;
import gov.co.aerocivil.userinterfaces.HomeAerocivil;
import gov.co.aerocivil.userinterfaces.PresupuestoPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DescargarEstadoFinanciero implements Task {
    public static DescargarEstadoFinanciero solicitado() {
        return instrumented(DescargarEstadoFinanciero.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.printf("");
        actor.attemptsTo(
                MoveMouse.to(HomeAerocivil.LINK_TRANSPARENCIA),
                Click.on(HomeAerocivil.LINK_PRESUPUESTO),
                Click.on(PresupuestoPage.BOTON_ESTADOS_FINANCIEROS),
                SwitchToNewWindow.now(),
                Click.on(EstadosFinancierosPage.BOTON_BALANCES),
                Click.on(EstadosFinancierosPage.BANALANCE_NOV_2020)
        );


    }
}
