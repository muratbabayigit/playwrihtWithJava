import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class firstTest {
    public static void main(String[] args) throws InterruptedException {
           // try(Playwright playwright=Playwright.create()) {  //ile close komutlarına gerek kalmaz
                    Playwright playwright=Playwright.create();
                    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
                    Page page = browser.newPage();
                    page.navigate("https://www.babayigit.net");
                    System.out.println(page.title());

                    page.setViewportSize(1920, 917);
                    Thread.sleep(2000);

                   // page.close(); //sayfayı kapatır
                    browser.close(); //pencereyi kapatır

                    playwright.close(); //projeyi durdurur

           // }
    }
}
