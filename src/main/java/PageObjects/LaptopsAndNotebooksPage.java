package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LaptopsAndNotebooksPage {
    public SelenideElement
    SortByPriceSelection = $(By.id("input-sort")),
    HigherToLowerOption = $(byText("Price (High > Low)"));

    public ElementsCollection
     ProductPrices = $$(By.xpath("//span[@class=\"price-tax\"]"));

}
