package demoblaze.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("page:home.page")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id='signin2']")
    public WebElementFacade userRecord;
    @FindBy(xpath = "//*[@class='modal fade show']")
    public WebElementFacade LoginWindow;
    @FindBy(xpath = "//*[@id='sign-username']")
    public WebElementFacade inputUserName;
    @FindBy(xpath = "//*[@id='sign-password']")
    public WebElementFacade inputPassword;
    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    public WebElementFacade buttonAddUser;

    @FindBy(xpath = "//*[@id='login2']")
    public WebElementFacade loginSection;

    @FindBy(xpath = "//*[@id='loginusername']")
    public WebElementFacade loginUsername;

    @FindBy(xpath = "//*[@id='loginpassword']")
    public WebElementFacade loginPassword;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    public WebElementFacade logInEnter;

    @FindBy(xpath = "//*[@id='nameofuser' and contains(text(), 'Welcome')]")
    public WebElementFacade welcomeText;

}

