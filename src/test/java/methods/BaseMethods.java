package methods;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



public class BaseMethods
{
    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    public void startAppium()throws MalformedURLException{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel_4_API_28");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("appPackage", "com.getir.casestudy.dev");
        cap.setCapability("appActivity", "com.getir.casestudy.modules.splash.ui.SplashActivity");
        URL hubURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(hubURL, cap);
        wait = new WebDriverWait(driver, 30);
    }

    //This function write to console ant log
    protected void logMessage(String text) {
        System.out.println(text);
    }

    protected MobileElement findByElement(By by){
        return driver.findElement(by);
    }
    protected List<MobileElement> findByElements(By by){
       return driver.findElements(by);
    }

    //("İlgili elemente string ifade girilmesini sağlar.")
    protected void writeText(By by, String text) {
        try {
            MobileElement element=findByElement(by);
            if (element.getText().equals("")) {
                element.clear();
            }
            element.sendKeys(text);

        } catch (Exception e) {
            logMessage("İlgili elemente yazı yazılırken hata oluştu. Element:"+ findByElement(by).getText() +"Hata: " + e.getMessage());
        }
    }

    //("İlgili elemente tıklanmasını,eğer tıklanamazsa uyarı çıkması sağlanır.")
    protected void clickElement(By by) {
        MobileElement element;
        try {
            element = driver.findElement(by);
            element.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //İlgili element görünür oldu mu kontrol eder.
    protected void visibilityOfElement(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOf(findByElement(by)));
        } catch (Exception e) {
        }
    }
    protected void waitElementClickable(By by) {
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        } catch (Exception e) {
        }
    }

    //İlgili element mevcut mu kontrol eder.
    protected boolean existElement(By by) {
        MobileElement element=findByElement(by);
        boolean isElementExist=false;
         if(element.isDisplayed()){
                isElementExist=true;
            }
         return isElementExist;
    }

    protected void waitSecond(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
