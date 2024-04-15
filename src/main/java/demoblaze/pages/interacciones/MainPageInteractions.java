package demoblaze.pages.interacciones;

import demoblaze.pages.mapeos.LoginPage;
import net.serenitybdd.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;

public class MainPageInteractions extends PageObject {

    @Page
    private LoginPage loginPage;

    public String getTitleElement(){

        return loginPage.LoginWindow.getText();
    }




}
