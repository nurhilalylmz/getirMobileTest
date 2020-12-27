package methods;

import constants.*;
import java.net.MalformedURLException;

public class LoginMethod extends BaseMethods
{


    //Kullanıcının başarılı bir şekilde login olması sağlanır.
    public void startApp() throws MalformedURLException {
        startAppium();
    }
    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(8000);
        visibilityOfElement(ContantsLoginPage.username);
        writeText(ContantsLoginPage.username,username);
        visibilityOfElement(ContantsLoginPage.password);
        writeText(ContantsLoginPage.password,password);
        clickElement(ContantsLoginPage.loginButton);
    }
    public void checkSuccessLogin(){
        visibilityOfElement(ContantsLoginPage.profilIcon);
    }
}
