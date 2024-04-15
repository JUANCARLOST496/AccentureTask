package demoblaze.login;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class) //-> Para trabajar con Cucumber y Serenity

@CucumberOptions(
        features = "src/test/resources/features/login/Inicio_sesion.feature",
        glue = "demoblaze.definitions", //POM
//
        snippets = CucumberOptions.SnippetType.CAMELCASE, //navegarPaginaWeb
        plugin = "pretty",
        tags = "@Login"
)
public class LoginRunner {
}
