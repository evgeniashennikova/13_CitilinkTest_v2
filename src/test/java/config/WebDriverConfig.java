package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/${typeEnv}.properties"})

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("versionBrowser")
    @DefaultValue("96.0")
    String versionBrowser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remoteWebDriver")
    String remoteWebDriver();

}
