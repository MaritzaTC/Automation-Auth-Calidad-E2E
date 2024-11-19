package com.udea.automationauthcalidade2e.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
    public static final String INPUT_EMAIL = "//*[@id='email']";
    public static final String INPUT_PASSWORD = "//*[@id='password']";
    public static final String BUTTON_LOGIN = "//button[normalize-space(text())='Ingresar']";

    public static final Target ERROR_MESSAGE_LOGIN = Target.the("Error message")
            .located(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/form/p"));

}
