package com.udea.automationauthcalidade2e.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.udea.automationauthcalidade2e.userinterfaces.SignUpPage.SUCCESS_MESSAGE_SIGNUP;
import static com.udea.automationauthcalidade2e.userinterfaces.WelcomePage.TITLE_PAG;

public class MessageVerification implements Question<Boolean>  {

    @Override

    public Boolean answeredBy(Actor actor) {
        // Verifica si el mensaje de confirmación es visible
        return SUCCESS_MESSAGE_SIGNUP.resolveFor(actor).isVisible();
    }

    public static MessageVerification isDisplayed() {
        return new MessageVerification();
    }

}
