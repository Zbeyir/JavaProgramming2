package practice.day_38Practice.browserTask;

public class ChromeBrowser extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }


}
/*
2. Create the following sub classes of Browser and override the methods if needed:

			1. ChromeBrowser
					methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "closing chrome browser"

 */