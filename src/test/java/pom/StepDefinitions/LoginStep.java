package pom.StepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class LoginStep extends TestBase {

    @Dado("que el usuario ya está en la página de inicio")
    public void queElUsuarioYaEstáEnLaPáginaDeInicio() {
        loginPage.confirmPage();
    }

    @Cuando("realiza click en el menu login")
    public void realizaClickEnElMenuLogin() {
        loginPage.clickOnMenuLogin();

    }

    @Y("el usuario inicia sesión con el nombre de usuario {string} y la contraseña {string}")
    public void elUsuarioIniciaSesiónConElNombreDeUsuarioYLaContraseña(String username, String password) throws Exception {
        loginPage.inputLogin(username, password);
        loginPage.clickOnLoginButton();
    }

    @Entonces("el usuario es redirigido a la página de inicio con la cuenta {string}")
    public void elUsuarioEsRedirigidoALaPáginaDeInicioConLaCuenta(String username) throws Exception {
        loginPage.confirmLogin(username);
    }

    @Entonces("debe aparecer el mensaje {string}.")
    public void debeAparecerElMensaje(String popUp) {
        homePage.popUpMessage(popUp);
    }


}
