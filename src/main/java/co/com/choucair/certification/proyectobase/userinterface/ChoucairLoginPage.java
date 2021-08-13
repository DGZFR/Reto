package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;





public class ChoucairLoginPage extends PageObject {


    public static final Target BUTTON_JOINTODAY = Target.the("button that shows us the registration form")
            .located(By.xpath(" //a[@href='/signup/personal']"));


    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));


    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));

    public static final Target INPUT_MONTHBIRTHDAY = Target.the("where do we write the month birthday")
            .located(By.id("birthMonth"));

    public static final Target INPUT_DAYBIRTHDAY = Target.the("where do we write the day birthday")
            .located(By.id("birthDay"));

    public static final Target INPUT_YEARBIRTHDAY = Target.the("where do we write the year birthday")
            .located(By.id("birthYear"));


    public static final Target INPUT_LANGUAGE = Target.the("where do we write the language")
            .located(By.xpath("//input[@type='search']"));




    public static final Target ENTER_BUTTON_NEXT1 = Target.the("button next location")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));

    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));

    public static final Target INPUT_POSTALCODE = Target.the("where do we write the postal code")
            .located(By.id("zip"));

    public static final Target INPUT_COUNTRY = Target.the("where do we write the country")
            .located(By.xpath("//input[@type='search']"));



    public static final Target ENTER_BUTTON_NEXT2 = Target.the("button next Devices")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));

    public static final Target INPUT_COMPUTER = Target.the("where do we write the operative system")
            .located(By.id("Select OS"));


    public static final Target INPUT_VERSION = Target.the("where do we write the version operative system")
            .located(By.id("lastName"));

    public static final Target INPUT_LANGUAGE2 = Target.the("where do we write the language of operative system")
            .located(By.id("lastName"));


    public static final Target INPUT_BRANDCELLPHONE = Target.the("where do we write the brand of device")
            .located(By.id("lastName"));

    public static final Target INPUT_MODEL = Target.the("where do we write the model of device")
            .located(By.id("lastName"));

    public static final Target INPUT_OPERATIVE = Target.the("where do we write the version of device cellphone")
            .located(By.id("lastName"));

    public static final Target ENTER_BUTTON_NEXT3 = Target.the("button next last step")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));


}
