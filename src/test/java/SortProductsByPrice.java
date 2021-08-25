
import StepObjects.CommonSteps;
import StepObjects.LaptopsAndNotebooksSteps;
import Utils.ChromeRunner;
import Utils.TestListener;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
@Epic("Regression Tests")
@Feature("Validating sorting")
public class SortProductsByPrice extends ChromeRunner {
    @Test(groups = { "Regression1" }, description = "Validate sort high to low")
    @Description("Go to laptops and notebooks category and check that sorting price from high to low works properly")
    @Severity(SeverityLevel.CRITICAL)
    public void ValidateSortHighToLow() {
        CommonSteps commonSteps = new CommonSteps();
        LaptopsAndNotebooksSteps laptopsAndNotebooksSteps = new LaptopsAndNotebooksSteps();

        commonSteps.clickLaptopsAndNotebooks()
                    .clickShowAllLaptopsAndNotebooksOption();

        laptopsAndNotebooksSteps.clickSortBy()
                                .sortByHigherToLower()
                                .printCollection();
    }

}
