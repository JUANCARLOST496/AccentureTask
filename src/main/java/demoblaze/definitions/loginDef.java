package demoblaze.definitions;

import demoblaze.steps.loginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class loginDef {

    @Steps
    private loginSteps loginSteps;


    @Dado("que el usuario entra a la pagina principal")
    public void queElUsuarioEntraALaPaginaPrincipal() {
        loginSteps.openLoginPage();
    }


    @Cuando("el usuario hace clik en la opcion sign up para registrarse")
    public void elUsuarioHaceClikEnLaOpcionSignUpparaRegistrarse() {
       loginSteps.clickLoginButton();

    }

    @Cuando("aparece la ventana para registrarse")
    public void apareceLaVentanaParaRegistrarse() {
        loginSteps.windowLoginAppear();
    }

    @Cuando("coloca usuario {}")
    public void colocaUsuarioEn(String User) {
        loginSteps.inputUserName(User);
    }


    @Cuando("coloca contrasena {}")
    public void colocaContrasenaEn(String password) {
        loginSteps.inputPassword(password);
    }

    @Cuando("doy click en el boton de registro")
    public void doyClickEnElBotonDeRegistro() {
           loginSteps.ButtonAddUser();
    }


    @Entonces("prueba que el alert aparezca con el registro exitoso")
    public void pruebaQueElAlertApaezcaConElRegistroExitoso() {
        loginSteps.manejarAlertDespuesDeRegistro();
    }

    @Dado("que el usuario entra a la ventana login")
    public void queElUsuarioEntraALaVentanaLogin() {
        loginSteps.registroOption();

    }

    @Dado("El usuario entra {} y {}")
    public void elUsuarioEntraUsuarioYContrasena(String user, String password) {
        loginSteps.credenciales(user,password);

    }

    @Dado("El usuario da click en boton login")
    public void elUsuarioDaClickEnBotonLogin() {
      loginSteps.botonLogin();
    }

    @Dado("entra como usuario y aparece la premisa welcome")
    public void entraComoUsuarioYApareceLaPremisaWelcome() {

    }

    @Dado("que el usuario navega a la página de inicio de sesión")
    public void queElUsuarioNavegaALaPaginaDeInicioDeSesion() {
    }
}
