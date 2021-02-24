import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SimpleTests {

    @Test
    void SearchGoogle() {
        open("https://google.com/");
        $("[name=q]").val("Selenide").pressEnter();

        $$("a cite").first().shouldHave(text("selenide.org"));
    }

}
