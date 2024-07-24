package TestCases;

import PageObjects.LoginPageObjects;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

@Test
public class LoginTestCase extends LoginPageObjects {

    @Test(groups = "smoke",priority = 1)
    @Parameters({"EmailId", "Password"})
    public static void VerfiyUserLogin(String arg1, String arg2) throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        MouseOverSignIn();
        ClickSignInButton();
        EnterEmail(arg1);
        ClickContinueButton();
        sleep(5000);
        EnterPassword(arg2);
        ClickSignInButtonLogin();

        String actualText = CaptureLoginText();
        String expectedText =".in";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Login Test case passed");
    }
}
