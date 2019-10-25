package PageObjectTest;

import org.junit.Test;

public class MainCheckTermsTest extends BaseTest {

    @Test
    public void CheckPrivacyAndTerms () {
        //проверяем, соответствует ли урл страницы, название страницы и лого на странице Конфиденциальности на украинском языке заданному. Заданный урл - указан в методе.
        page.openUA ();
        page.checkPrivacyUrl ("https://www.ukr.net/terms/");
        page.checkPrivacyName ("Угода про конфіденційність");
        page.checkLogo ("https://www.ukr.net/img/terms-logo-ua.gif");
        //переключаемся на рус. и проверяем, соответствует ли урл страницы, название страницы на странице Конфиденциальности на рус языке заданному. Заданный урл - указан в методе.
        page.openRU ();
        page.checkPrivacyUrl ("https://www.ukr.net/ru/terms/");
        page.checkPrivacyName ("Соглашение о конфиденциальности");
        //переключаемся на англ. и проверяем, соответствует ли урл страницы, название страницы на странице Конфиденциальности на англ языке заданному. Заданный урл - указан в методе.
        page.openEN ();
        page.checkPrivacyUrl ("https://www.ukr.net/terms/");
        page.checkPrivacyName ("Угода про конфіденційність");

        //то же самое для страницы Правил использования почты
        page.openUA ();
        page.checkTermsUrl ("https://mail.ukr.net/terms_uk.html");
        page.checkTermsName ("Угода про використання електронної пошти FREEMAIL (mail.ukr.net)");
        page.openRU ();
        page.checkTermsUrl ("https://mail.ukr.net/terms_ru.html");
        page.checkTermsName ("Соглашение об использовании электронной почты FREEMAIL (mail.ukr.net)");
        page.openEN ();
        page.checkTermsUrl ("https://mail.ukr.net/terms_en.html");
        page.checkTermsName ("Угода про використання електронної пошти FREEMAIL (mail.ukr.net)");




    }
}
