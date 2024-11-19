package com.udea.automationauthcalidade2e.tasks;

import com.udea.automationauthcalidade2e.interactions.EnterAllUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class FillSignUpData implements Task {


    private final String name;
    private final String email;
    private final String password;
    private final String confirmPassword;

    public FillSignUpData(String name, String email, String password, String confirmPassword) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterAllUserData.withData(name, email, password, confirmPassword)
        );
    }
public static FillSignUpData withData(String name, String email, String password, String confirmPassword) {
        return new FillSignUpData(name, email, password, confirmPassword);
    }
}
