package com.udea.automationauthcalidade2e.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login/login.feature",
        glue = "com.udea.automationauthcalidade2e.stepdefinitions.login",
        plugin = {"pretty", "html:target/cucumber-reports"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginRunner {
}
