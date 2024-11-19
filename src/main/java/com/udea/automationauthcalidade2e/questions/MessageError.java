package com.udea.automationauthcalidade2e.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.udea.automationauthcalidade2e.userinterfaces.LoginPage.ERROR_MESSAGE_LOGIN;


public class MessageError implements Question<Boolean> {
    @Override

    public Boolean answeredBy(Actor actor) {
        // Verifica si el mensaje de confirmación es visible
        return ERROR_MESSAGE_LOGIN.resolveFor(actor).isVisible();
    }

    public static MessageError isDisplayed() {
        return new MessageError();
    }
}
