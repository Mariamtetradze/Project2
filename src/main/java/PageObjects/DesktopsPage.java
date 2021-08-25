package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DesktopsPage {
    public SelenideElement
    MP3PlayersOption = $(".list-group").$(By.partialLinkText("MP3 Players"));

    public ElementsCollection
    ProductsList = $$(By.xpath("//div[@class=\"product-thumb\"]//h4//a"));

}
