package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverProvider {

    private final static WebDriverConfig webConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void webConfiguration() {
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.versionBrowser();
        Configuration.browserSize = webConfig.browserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--enable-automation");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--ignore-certificate-errors");

        if (System.getProperty("typeEnv").equals("remote")) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = webConfig.remoteWebDriver();
        }

        Configuration.browserCapabilities = capabilities;

    }
}
