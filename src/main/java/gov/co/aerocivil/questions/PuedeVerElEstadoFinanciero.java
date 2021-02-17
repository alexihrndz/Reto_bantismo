package gov.co.aerocivil.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static gov.co.aerocivil.utils.ConstantsStrings.URL_CHECK;

public class PuedeVerElEstadoFinanciero implements Question<Boolean> {
    public static PuedeVerElEstadoFinanciero enElExplorador() {
        return new PuedeVerElEstadoFinanciero();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver webDriver = BrowseTheWeb.as(actor).getDriver();
        return webDriver.getCurrentUrl().contains(URL_CHECK);
    }
}
