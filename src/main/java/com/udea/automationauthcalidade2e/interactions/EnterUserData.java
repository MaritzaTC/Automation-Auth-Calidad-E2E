package com.udea.automationauthcalidade2e.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.udea.automationauthcalidade2e.userinterfaces.LoginPage.*;

public class EnterUserData implements Interaction {

    private final String email;
    private final String password;

    public EnterUserData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }

    public static EnterUserData withData(String email, String password) {
        return new EnterUserData(email, password);
    }
}
