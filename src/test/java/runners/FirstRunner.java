package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "src/test/resources/features/firsFeatures",
        features = "src/test/resources/features/firsFeatures.feature",
        glue="stepdefinitions",//(stepdefinitions dosyaları)Package ın adını yazıyoruz
        dryRun = false//default değeri bu(test executionlara eklemiyoruz)
)
public class FirstRunner {
// 2 islemle bu class i bir junit runner class haline getirebiliriz

        // 1. RunWith anotasyonunu kullanarak bu runner in junit ve cucumber ile calisacagini bildiririz
        // 2. CucumberOptions isimli anotasyonu kullanarak bir takim konfigurasyonlar yapabiliriz

        // features -> tek bir features dosyasi veya tum feature dosyalarini barindiran feature klasorunun yolu
        // glue -> stepdefinitionlarin bulundugu package yolu
        // dryRun -> true oldugu takdirde eksik step kontrolu yapar fakat kodu calistirmaz!!!!

    // Testng ile calistirmak isterseniz classin AbstractTestngCucumberTests isimli class extend edilmelidir
    //, ile farklı featurlar eklenebilir,features ın içine
    //her yeni yazılan ne varsa her seferinde çekice tıklayıp built etmemiz gerekiyor yoksa run edince hata verir!!!


}



