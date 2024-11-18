package com.udea.automationauthcalidade2e.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;
public class WelcomePage  extends PageObject {
    public static final Target TITLE_PAG = the("Titulo Pagina").located(By.xpath("//div[@id='inventory_filter_container']//div"));
}
