package ProjectTask;

public interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface RemoteWebDriver extends WebDriver {
    void navigate();
}

interface TakesScreenShot extends RemoteWebDriver {
    void getScreenShot();
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open ChromeDriver");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Driver");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to ChromeDriver");
    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open FireFox");
    }

    @Override
    public void close() {
        System.out.println("Close FireFox");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Firefox");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to safari");
    }
}

class WebDriverTest {
    public static void main(String[] args) {

        RemoteWebDriver[] rd = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver webDriver : rd) {
            webDriver.close();
            webDriver.open();
            webDriver.navigate();
            System.out.println(webDriver.getTitle());

        }
    }
}