package demoblaze.pages.mapeos;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(xpath = "//main//h1")
    public WebElementFacade DashboardTitle;

}
