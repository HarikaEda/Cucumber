package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FirstFeatureStepDefinitions {
    int int1,int2,toplam;

    @Given("Elimizde 3 sayisi mevcur")
    public void elimizde3SayisiMevcur() {
        int1 = 3;
        System.out.println("ilk sayı 3 olarak set edildi");
    }
    @Given("Elimizde 5 sayisi mevcur")
    public void elimizde5SayisiMevcur() {
        int2 = 5;
        System.out.println("ikinci sayı 5 olarak set edildi");
    }

    @When("Bu sayılar toplandığında")
    public void buSayılarToplandığında() {
        toplam=int1+int2;
    }

    @Then("Toplamın 8 olduğu görülmektedir")
    public void toplamınOlduğuGörülmektedir() {
        Assert.assertEquals(8,toplam);
    }

}
