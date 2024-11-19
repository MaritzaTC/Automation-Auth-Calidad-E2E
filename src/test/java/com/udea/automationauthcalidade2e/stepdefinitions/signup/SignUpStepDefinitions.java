package com.udea.automationauthcalidade2e.stepdefinitions.signup;

import com.udea.automationauthcalidade2e.tasks.FillSignUpData;
import com.udea.automationauthcalidade2e.tasks.OpenUrl;
import com.udea.automationauthcalidade2e.utils.Constants;
import com.udea.automationauthcalidade2e.utils.EndPoints;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static com.udea.automationauthcalidade2e.utils.Constants.sleep;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class SignUpStepDefinitions {
    private final Actor user = Actor.named("user");
    //driver
    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    //inicializar
    @Before
    public void init() {
        user.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }
    @Before
    public void setup() {
        setTheStage(new OnlineCast());
        OnStage.theActorCalled("author");
    }
    @Given("I am on the sign up page")
    public void theUserIsOnTheSignupPage() {
        String signupPageUrl = Constants.URL_HOME + EndPoints.URL_SIGNUP;
        user.attemptsTo(OpenUrl.url(signupPageUrl));
    }

    @When("I fill in the sign up form with valid data")
    public void iFillInTheSignUpFormWithValidData(DataTable dataTable) {
        List<Map<String,String>>  userData = dataTable.asMaps(String.class, String.class);

        userData.forEach(
                userA -> {
                    user.attemptsTo(
                            FillSignUpData.withData(
                                    userA.get("name"),
                                    userA.get("email"),
                                    userA.get("password"),
                                    userA.get("confirmPassword")
                            )
                    );
                }
        );
        sleep(6000);
    }


}
