package com.udea.automationauthcalidade2e.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.udea.automationauthcalidade2e.userinterfaces.WelcomePage.TITLE_PAG;

public class Autentication  implements Question<Boolean> {

    private String namePage;

    public Autentication(String namePage) {
        this.namePage = namePage;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return namePage.equals(TITLE_PAG.resolveFor(actor).getText());
    }

    public static Autentication isExit(String namePage) {
        return new Autentication(namePage);
    }
}
