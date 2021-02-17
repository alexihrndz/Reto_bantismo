package gov.co.aerocivil.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/descarga_estado_financiero.feature",
        glue = "gov.co.aerocivil.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class DescargaEstadoFinanciero {
}
