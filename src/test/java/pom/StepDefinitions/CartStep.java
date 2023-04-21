package pom.StepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CartStep extends TestBase {

    @Dado("que el usuario ya ha iniciado sesión con usuario {string} y password {string}")
    public void queElUsuarioYaHaIniciadoSesiónConUsuarioYPassword(String username, String password) throws Exception {
        loginPage.confirmPage();
        loginPage.clickOnMenuLogin();
        loginPage.inputLogin(username, password);
        loginPage.clickOnLoginButton();
        loginPage.confirmLogin(username);

    }

    @Cuando("el usuario elige el producto {string}")
    public void elUsuarioEligeElProducto(String product) throws InterruptedException {
        homePage.getProduct(product);
        cartPage.addToCart();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Entonces("debe aparecer el mensaje emergente {string}")
    public void debeAparecerElMensajeEmergente(String message) {
       homePage.popUpMessage(message);

    }

    @Y("el producto {string} se agrega a la página del carrito")
    public void elProductoSeAgregaALaPáginaDelCarrito(String product) {
        cartPage.cardPageMenu();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(product,cartPage.productCart());
    }

    @Dado("que el usuario ya se encuentra en la página principal")
    public void queElUsuarioYaSeEncuentraEnLaPáginaPrincipal() {
        loginPage.confirmPage();
    }

    @Cuando("el usuario elige el producto {string} seleccionando primero la categoría {string}")
    public void elUsuarioEligeElProductoSeleccionandoPrimeroLaCategoría(String categories, String product) throws InterruptedException {
        homePage.chooseCategories(categories);
        homePage.getProduct(product);
        cartPage.addToCart();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Cuando("el usuario agrega el producto {string} al carrito")
    public void elUsuarioAgregaElProductoAlCarrito(String arg0) {
    }

    @Y("el usuario hace clic en el botón de eliminación")
    public void elUsuarioHaceClicEnElBotónDeEliminación() {
        cartPage.cardPageMenu();
        cartPage.deleteButton();
    }

    @Entonces("el producto {string} se elimina del carrito")
    public void elProductoSeEliminaDelCarrito(String product) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertFalse(product, cartPage.productCart());
    }

}

