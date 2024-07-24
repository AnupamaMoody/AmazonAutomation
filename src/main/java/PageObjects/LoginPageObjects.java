package PageObjects;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPageObjects extends Base{

    public static By signIn= By.xpath("//span[text()='Hello, sign in']");
    public static By signInButton=By.xpath("//span[text()='Sign in']");
    public static By emailInput=By.xpath("//input[@type=\"email\"]");
    public static By continueButton=By.id("continue");
    public static By passwordInput=By.xpath("//input[@type=\"password\"]");
    public static By signInLogin=By.xpath("//input[@type=\"submit\"]");
    public static By loginText=By.xpath("//a[@id=\"nav-logo-sprites\"]");


    public static void MouseOverSignIn(){

        WebElement signInLink=driver.findElement(signIn);

        Actions ac =new Actions(driver);
        ac.moveToElement(signInLink).perform();


    }
    public static void ClickSignInButton(){

        try {
            driver.findElement(signInButton).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    public static void EnterEmail(String email){

        try {
            driver.findElement(emailInput).sendKeys(email);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static void ClickContinueButton(){

        try {
            driver.findElement(continueButton).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static void EnterPassword(String pwd){

        try {
            driver.findElement(passwordInput).sendKeys(pwd);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static void ClickSignInButtonLogin(){

        try {
            driver.findElement(signInLogin).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static String CaptureLoginText(){

        String actualText=driver.findElement(loginText).getText();
        return actualText;
    }

}
