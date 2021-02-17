package gov.co.aerocivil.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import gov.co.aerocivil.questions.PuedeVerElEstadoFinanciero;
import gov.co.aerocivil.tasks.DescargarEstadoFinanciero;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static gov.co.aerocivil.utils.ConstantsStrings.ACTOR_NAME;
import static gov.co.aerocivil.utils.ConstantsStrings.URL_HOME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DescargaEstadoFinanciaeroStepdefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que yo como usuario quiero descargar el estado financiero$")
    public void queYoComoUsuarioQuieroDescargarElEstadoFinanciero(DataTable datos) {
        List<Map<String, String>> estadoFinanciero = datos.asMaps(String.class, String.class);
        theActorCalled(ACTOR_NAME).wasAbleTo(Open.url(URL_HOME));

        theActorInTheSpotlight().remember("EstadoFinanciero", estadoFinanciero.get(0).get("estadoFinanciero"));
    }


    @Cuando("^realice la descarga del estado financiero$")
    public void realiceLaDescargaDelEstadoFinanciero() {
        theActorInTheSpotlight().attemptsTo(DescargarEstadoFinanciero.solicitado());

    }

    @Entonces("^puedo ver el estado financiero solicitado$")
    public void puedoVerElEstadoFinancieroSolicitado() {
        theActorInTheSpotlight().should(seeThat(PuedeVerElEstadoFinanciero.enElExplorador()));
    }

}
