package stepdefinitions;

import io.cucumber.java.en.Given;

public class ParameterStepDefinitions {//bir step birden fazla parametre de alabilir
    @Given("bu papametreli bir steptir ve değeri {string}")
    public void buPapametreliBirSteptirVeDeğeri(String arg0) {

        System.out.println("Step "+arg0+" değeri okundu");
    }
}
