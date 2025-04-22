package SeleniumHomeAssignments.Week03Day02;

public class Chrome extends Browser {
    public void openInCognito() {
        System.out.println("openInCognito");
    }

    public void clearCache() {
        System.out.println("clearCache");
    }

    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.openInCognito();
        chrome.clearCache();
        //call the methods of Browser class
        chrome.openURL();
        chrome.closeBrowser();
        chrome.navigateBack();
    }
}
