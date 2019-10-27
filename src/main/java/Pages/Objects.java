package Pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class Objects {
    public static final String URL = "https://www.ozon.ru/";

    public static class Glavnaya{
        public static SelenideElement buttonKatalog () {return $(By.xpath("//button[@value = 'Каталог']"));}
        public static SelenideElement mooveToBook () {return $(By.xpath("//span[@class='_389557']/ancestor::a[@href='/category/knigi-16500/']"));}
        public static SelenideElement kompTech () {return $(By.xpath("//span[contains(text(), 'Компьютерные')]"));}
    }

    public static class KompTehnologii {
        public static SelenideElement checkBestsellers () {return $(By.xpath("//span[text()='Бестселлеры']"));}
        public static SelenideElement checkProg () {return $(By.xpath("//span[contains(text(),'Языки')]"));}
        public static SelenideElement checkBook () {return $(By.xpath("//a[@href='/context/detail/id/7821666/']"));}
    }

    public static class PageBook {
        public static SelenideElement buttonBox () {return $(By.xpath("//button[contains(text(), 'Добавить в корзину')]")); }
        public static SelenideElement buttonPresent () {return $(By.xpath("//a[@class='_652bc6 ab8d80']"));}
        public static SelenideElement box () {return $(By.xpath("//span[contains(text(),'Корзина')]"));}
    }

    public static class PageBox {
        public static SelenideElement picture () {return $(By.xpath("//div[@class='img item-image _96fa6d']"));}
        public static SelenideElement bookPresent () {return $(By.xpath("//a[@href='/context/detail/id/7821666/']"));}
    }
}

