import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SimpleTests {

    @Test
    void SearchYa() {
        open("https://ya.ru/");
        $(".input__input").val("Selenide").pressEnter();
        $(".organic__subtitle").shouldHave(text("selenide.org"));
    }

}
