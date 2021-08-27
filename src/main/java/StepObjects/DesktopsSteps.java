package StepObjects;

import PageObjects.DesktopsPage;
import io.qameta.allure.Step;
import org.testng.Assert;


public class DesktopsSteps extends DesktopsPage {

    @Step("Choose MP3 players from categories")
    public DesktopsSteps goToMP3Players() {
        MP3PlayersOption.click();
        return this;
    }
    @Step("Verify img title attribute")
    public DesktopsSteps verifyTitleAttribute() {
        IpodShuffleImg.scrollTo();
        System.out.println(IpodShuffleImg.getAttribute("title"));
        Assert.assertTrue(IpodShuffleImg.getAttribute("title").equals("iPod Shuffle"));
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
