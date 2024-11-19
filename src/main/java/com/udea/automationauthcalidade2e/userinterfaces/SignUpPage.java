package com.udea.automationauthcalidade2e.userinterfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignUpPage extends PageObject {


    public static final String INPUT_NAME = "//*[@id=\"names\"]";

    public static final String INPUT_EMAIL = "//*[@id=\"email\"]";

    public static final String INPUT_PASSWORD = "//*[@id=\"password\"]";

    public static final String INPUT_CONFIRM_PASSWORD = "//*[@id=\"confirmPassword\"]";


    public static final String BUTTON_SIGNUP = "//*[@id=\"__next\"]/div/div/form/button[1]";


    public static final Target SUCCESS_MESSAGE_SIGNUP = Target.the("Success message")
            .located(By.xpath("//*[@id=\"__next\"]/div/div/form/div[5]/p"));

}

