package pom.StepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class RegisterStep extends TestBase{
    @Cuando("el usuario se registre con el nombre de usuario {string} y la contraseña {string}")
    public void elUsuarioSeRegistreConElNombreDeUsuarioYLaContraseña(String username, String password) throws Exception {
        registerPage.clickOnMenuRegister();
        registerPage.inputRegister(username, password);
        registerPage.clickOnRegisterButton();
    }


}
