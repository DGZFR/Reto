package co.com.choucair.certification.proyectobase.questions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {

//private String  question;

  /**  public Answer(String question) {
        this.question = question;
    }
**/
/**
    public static Answer toThe(String question) {

        return new Answer(question);
    }
**/
    @Override
    public Boolean answeredBy(Actor actor) {


       // String  nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        return  null;

    }
}
