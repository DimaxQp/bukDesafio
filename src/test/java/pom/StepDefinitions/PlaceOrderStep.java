package pom.StepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static org.junit.Assert.assertEquals;

public class PlaceOrderStep extends TestBase{


       @Entonces("se muestra el mensaje emergente {string}")
    public void seMuestraElMensajeEmergente(String message) {
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           assertEquals(message,cartPage.getSuccessMessage());
    }

    @Entonces("se debe mostrar el mensaje emergente {string}")
    public void seDebeMostrarElMensajeEmergente(String popUp) {
        homePage.popUpMessage(popUp);

    }


    @Cuando("el usuario crea una orden con Nombre {string}, País {string}, Ciudad {string}, Tarjeta de crédito {int}, Mes {int}, Año {int}")
    public void elUsuarioCreaUnaOrdenConNombrePaísCiudadTarjetaDeCréditoMesAño(String name, String country, String city, Integer card, Integer month, Integer year) throws InterruptedException {
        String cards = Integer.toString(card);
        String months = Integer.toString(month);
        String years = Integer.toString(year);
        cartPage.cardPageMenu();
        cartPage.placeOrder();
        cartPage.inputOrder(name, country, city, cards, months, years);
        cartPage.purchaseButton();
    }


    @Cuando("el usuario crea una orden con Nombre {string}, País {string}, Ciudad {string}, Mes {int}, Año {int}")
    public void elUsuarioCreaUnaOrdenConNombrePaísCiudadMesAño(String name, String country, String city, Integer month, Integer year) throws InterruptedException {
        String cards = "";
        String months = Integer.toString(month);
        String years = Integer.toString(year);
        cartPage.cardPageMenu();
        cartPage.placeOrder();
        cartPage.inputOrder(name, country, city, cards, months, years);
        cartPage.purchaseButton();
    }
}
