package Week03HomeAssignmentsDay02;

public class LoginTestData extends TestData {
    public void enterUsername() {
        System.out.println("Enter Username");
    }

    public void enterPassword() {
        System.out.println("EnterPassword");
    }

    public static void main(String[] args) {
        LoginTestData loginTestData = new LoginTestData();
        loginTestData.enterCredentials();
        loginTestData.navigateToHomePage();
        loginTestData.enterUsername();
        loginTestData.enterPassword();
    }
}
