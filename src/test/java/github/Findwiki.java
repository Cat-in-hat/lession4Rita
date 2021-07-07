package github;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Test;

public class Findwiki {
    @Test
    void shouldFindWikiOnGitHub() {

        open("https://github.com/selenide/selenide");

        $(".UnderlineNav-body").$(byText("Wiki")).click();
        $(".js-wiki-more-pages-link").click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})"));
    }
}
