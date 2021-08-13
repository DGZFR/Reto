package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {


@Before
public  void setStage (){
    OnStage.setTheStage(new OnlineCast());

}


@Given("^since brandon wants to join the utest platform$")
public void sinceBrandonWantsToJoinTheUtestPlatform() {

    OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thepage(),(Login.onThePage()));
}


    @When("^He fill in the fields of the required forms$")
    public void heFillInTheFieldsOfTheRequiredForms() {

    }

    @Then("^he creates a new account successfully$")
    public void heCreatesANewAccountSuccessfully() {

    }


}
