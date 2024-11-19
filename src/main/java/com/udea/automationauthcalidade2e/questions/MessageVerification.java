package com.udea.automationauthcalidade2e.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.udea.automationauthcalidade2e.userinterfaces.WelcomePage.TITLE_PAG;

public class MessageVerification implements Question<Boolean>  {

    private String message;

    public MessageVerification(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return message.equals(TITLE_PAG.resolveFor(actor).getText());
    }

    public static MessageVerification isExit(String namePage) {
        return new MessageVerification(namePage);
    }
}
