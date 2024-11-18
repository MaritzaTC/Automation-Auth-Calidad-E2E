package com.udea.automationauthcalidade2e.userinterfaces;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {
    public static final String INPUT_EMAIL = "//*[@id='email']";
    public static final String INPUT_PASSWORD = "//*[@id='password']";
    public static final String BUTTON_LOGIN = "//button[normalize-space(text())='Ingresar']";

}
