package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DesktopsPage {
    public SelenideElement
    MP3PlayersOption = $(".list-group").$(By.partialLinkText("MP3 Players")),
    IpodShuffleImg = $(By.xpath("//img[@title=\"iPod Shuffle\"]"));

    public ElementsCollection
    ProductsList = $$(By.xpath("//div[@class=\"product-thumb\"]//h4//a"));

}
