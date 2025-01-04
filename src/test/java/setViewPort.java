import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.awt.*;

public class setViewPort {

    public static void main(String[] args) {
        Playwright playwright=Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
        Page page = browser.newPage();
        Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int)dimension.getWidth();
        int height=(int) dimension.getHeight();
        page.setViewportSize(width,height);
        page.navigate("http:/www.babayigit.net");
        System.out.println(page.title());
        browser.close();
        playwright.close();


    }
}
