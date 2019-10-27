package SelenidePageObjects;
import Pages.Objects;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

public class App 
{
    public static void main( String[] args )throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Хромдрайвер\\chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.timeout = 6000;
        open(Objects.URL);
        Objects.Glavnaya.buttonKatalog().click();
        Objects.Glavnaya.mooveToBook().hover();
        Objects.Glavnaya.kompTech().click();
        if (Objects.KompTehnologii.checkBestsellers().isSelected()){
            Objects.KompTehnologii.checkBestsellers().click();}
            Objects.KompTehnologii.checkBestsellers().click();
        if (Objects.KompTehnologii.checkProg().isSelected()){
            Objects.KompTehnologii.checkProg().click();}
            Objects.KompTehnologii.checkProg().click();
        Objects.KompTehnologii.checkBook().click();
        Objects.PageBook.buttonBox().click();
        Thread.sleep(2000);
        if (Objects.PageBook.buttonPresent().isDisplayed())
        {System.out.println("Книга в козине, кнопка не отображается");}
        else
        {System.out.println("Книга НЕ козине, кнопка отображается");}
        Thread.sleep(2000);
        Objects.PageBook.box().click();
        Thread.sleep(2000);
        Objects.PageBox.picture().click();
        Thread.sleep(2000);
        if (Objects.PageBox.bookPresent().isDisplayed())
        {System.out.println("Ваша книга в корзине");}
        else
        {System.out.println("Это не ваша книга в корзине");}
    }
    }
