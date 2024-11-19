package com.udea.automationauthcalidade2e.stepdefinitions.login;

import com.udea.automationauthcalidade2e.questions.MessageError;
import com.udea.automationauthcalidade2e.questions.MessageVerification;
import com.udea.automationauthcalidade2e.tasks.FillCredentialsData;
import com.udea.automationauthcalidade2e.tasks.OpenUrl;
import com.udea.automationauthcalidade2e.utils.Constants;
import com.udea.automationauthcalidade2e.utils.EndPoints;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import com.udea.automationauthcalidade2e.questions.Autentication;
import java.util.List;
import java.util.Map;

import static com.udea.automationauthcalidade2e.utils.Constants.sleep;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefinitions {
    //Actor
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


    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        String loginPageUrl = Constants.URL_HOME + EndPoints.URL_LOGIN;
        user.attemptsTo(OpenUrl.url(loginPageUrl));
        //user.attemptsTo(OpenUrl.url(Constants.URL_HOME));
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials(DataTable dataTable) {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);

        credentials.forEach(
                userA -> {
                    user.attemptsTo(
                            FillCredentialsData.withData(
                                    userA.get("email"),
                                    userA.get("password")
                            ));
                });

        sleep(6000);
    }

    @Then("The user must enter the welcome page")
    public void theUserMustEnterTheWelcomePage() {
        String currentUrl = theDriver.getCurrentUrl();
        String expectedUrl = Constants.URL_HOME + EndPoints.URL_WELCOME;
        assertEquals(expectedUrl, currentUrl);
    }

    @When("the user enters invalid credentials")
    public void theUserEntersInvalidCredentials(DataTable dataTable) {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);

        credentials.forEach(
                userA -> {
                    user.attemptsTo(
                            FillCredentialsData.withData(
                                    userA.get("email"),
                                    userA.get("password")
                            ));
                });

        sleep(6000);
    }

    @Then("The user must see an error message")
    public void theUserMustSeeAnErrorMessage() {
        sleep(2000);
        user.should(seeThat(
                MessageError.isDisplayed(),
                equalTo(true)
        ));
    }
}
