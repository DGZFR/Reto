package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;


public class Login implements Task {

    public static Login onThePage() {

    return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //aqui ponemos cada paso para realizar el logeo
        // le pasamos como parametro la pagina que contiene al objeto deseado

        actor.attemptsTo(Click.on(ChoucairLoginPage.BUTTON_JOINTODAY),
        //añadimos todas las instrucciones que se requieren para lograr iniciar sesion
                Enter.theValue("Duban").into(ChoucairLoginPage.INPUT_FIRSTNAME),
                Enter.theValue("Esteban").into(ChoucairLoginPage.INPUT_LASTNAME),
                Enter.theValue("prueba@phqp.com").into(ChoucairLoginPage.INPUT_EMAIL),

                SelectFromOptions.byVisibleText("September").from(ChoucairLoginPage.INPUT_MONTHBIRTHDAY),
                SelectFromOptions.byVisibleText("22").from(ChoucairLoginPage.INPUT_DAYBIRTHDAY),
                SelectFromOptions.byVisibleText("1996").from(ChoucairLoginPage.INPUT_YEARBIRTHDAY),

                Type.theValue("spanish").into(ChoucairLoginPage.INPUT_LANGUAGE).thenHit(Keys.ENTER),

                Click.on(ChoucairLoginPage.ENTER_BUTTON_NEXT1),

               Enter.theValue("Medellin").into(ChoucairLoginPage.INPUT_CITY),
                Enter.theValue("050005").into(ChoucairLoginPage.INPUT_POSTALCODE),



                Type.theValue("Colombia").into(ChoucairLoginPage.INPUT_COUNTRY),

                Click.on(ChoucairLoginPage.ENTER_BUTTON_NEXT2),

                SelectFromOptions.byVisibleText("macOS").from(ChoucairLoginPage.INPUT_COMPUTER),
                SelectFromOptions.byVisibleText("OSX10.4").from(ChoucairLoginPage.INPUT_VERSION),
                SelectFromOptions.byVisibleText("English").from(ChoucairLoginPage.INPUT_LANGUAGE2),
                SelectFromOptions.byVisibleText("Apple").from(ChoucairLoginPage.INPUT_BRANDCELLPHONE),
                SelectFromOptions.byVisibleText("iPhone4").from(ChoucairLoginPage.INPUT_MODEL),
                SelectFromOptions.byVisibleText("iOS 11.1.1").from(ChoucairLoginPage.INPUT_OPERATIVE),
                Click.on(ChoucairLoginPage.ENTER_BUTTON_NEXT3)
                );




    }
}
