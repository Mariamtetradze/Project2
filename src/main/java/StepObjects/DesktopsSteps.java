package StepObjects;

import PageObjects.DesktopsPage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import java.util.Iterator;

public class DesktopsSteps extends DesktopsPage {

    @Step("Choose MP3 players from categories")
    public DesktopsSteps goToMP3Players() {
        MP3PlayersOption.click();
        return this;
    }

    @Step("Go through products list and go to product with name ipod touch")
    public DesktopsSteps goToIpodShuffle() {
      for(int i =0; i<ProductsList.size(); i++) {
          if(ProductsList.get(i).getText().contains("iPod Touch")) {
              ProductsList.get(i).click();
          }
      }
        return this;
    }


}
