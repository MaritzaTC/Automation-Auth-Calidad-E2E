package com.udea.automationauthcalidade2e.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.udea.automationauthcalidade2e.userinterfaces.SignUpPage.*;

public class EnterAllUserData implements Interaction {

    private final String name;
    private final String email;
    private final String password;
    private final String confirmPassword;

    public EnterAllUserData(String name, String email, String password, String confirmPassword) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(INPUT_NAME),
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(INPUT_CONFIRM_PASSWORD),
                Click.on(BUTTON_SIGNUP)
        );
    }
public static EnterAllUserData withData(String name, String email, String password, String confirmPassword) {
        return new EnterAllUserData(name, email, password, confirmPassword);
    }
}
