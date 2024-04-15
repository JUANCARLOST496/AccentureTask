package demoblaze.steps;

import demoblaze.pages.interacciones.MainPageInteractions;
import demoblaze.pages.mapeos.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Alert;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class loginSteps {
    @Page
    private LoginPage loginPages;

    @Page
    private MainPageInteractions mainPageInteractions;

    @Step("Entra pagina principal")
    public void openLoginPage(){
        loginPages.open();
    }

    @Step("Apretar boton login")
    public void clickLoginButton(){
        loginPages.userRecord.waitUntilClickable().click();
    }

    @Step("Aparece la ventana para registrarse")
    public void  windowLoginAppear() {
        final String errorMessage = "La ventana de inicio de sesión no está visible";
        assertThat(loginPages.LoginWindow.isVisible()).as(errorMessage).isTrue();
    }

    @Step("Registrar nombre usuario")
    public void inputUserName(String userR){
        loginPages.inputUserName.type(userR);
    }

    @Step("Registrar contrasena")
    public void inputPassword(String userR){
        loginPages.inputPassword.type(userR);
    }

    @Step("click boton de registro")
    public void ButtonAddUser(){ loginPages.buttonAddUser.waitUntilClickable().click();}


    @Step("Manejar el alert después del registro")
    public void manejarAlertDespuesDeRegistro() {
        Alert alert = getDriver().switchTo().alert();

        String mensajeAlert = alert.getText();
        System.out.println(mensajeAlert);
        assertThat(mensajeAlert).isEqualTo("Sign up successful.");

    }


    @Step("hacer el login")
    public void registroOption(){
        loginPages.open();
        loginPages.loginSection.waitUntilClickable().click();
    }

    @Step("insertar usuario y password")
    public void credenciales(String user, String password){
         loginPages.loginUsername.type(user);
         loginPages.loginPassword.type(password);
    }

    @Step("click boton login")
    public void botonLogin(){
        loginPages.logInEnter.waitUntilClickable().click();
    }


    @Step("Entrar en welcome")
    public void welcomeText(){
        String textoWelcome= loginPages.welcomeText.getText();
        assertThat(textoWelcome).contains("Welcome");
    };

}
