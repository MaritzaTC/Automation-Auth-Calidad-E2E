package com.udea.automationauthcalidade2e.tasks;

import com.udea.automationauthcalidade2e.interactions.EnterUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class FillCredentialsData implements Task {
    private final String email;
    private final String password;

    public FillCredentialsData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterUserData.withData(email, password)
        );
    }
    public static FillCredentialsData withData(String email, String password) {
        return new FillCredentialsData(email, password);
    }

}
