package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeTest
    public void setUp(){
        Configuration.startMaximized = true;
        Configuration.timeout=20000;
        open("http://tutorialsninja.com/demo/");

    }
}
