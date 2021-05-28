package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

public class findwiki {
    @Test
    void findwiki() {

        // Откройте страницу Selenide в Github
            open("https://github.com/selenide/selenide");

               //Перейдите в раздел Wiki проекта
        $(byText("Wiki")).click();
       //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(byText("wiki-more-pages-link")).click();
       // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
sleep(5000);
       // $(".BorderGrid").$(byText("Contributors"))
               // .closest("div").$("li").hover();
        // проверка: в появившемся окошечке (overlay)
       // $$(".Popover-message").findBy(visible)
             //   .shouldHave(text("Andrei Solntsev"));
    }
}
