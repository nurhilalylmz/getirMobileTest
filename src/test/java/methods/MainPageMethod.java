package methods;

import constants.*;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class MainPageMethod extends BaseMethods
{

    public void selectCategory(String category) {
        List<MobileElement> listElements = findByElements(ContantsMainPage.categorylist);

        for(MobileElement el : listElements){
            if(el.getText().equalsIgnoreCase(category)){
                el.click();
            }
        }

    }

    public void goToBasket() {
        waitSecond(10);
        waitElementClickable(ContantsMainPage.basketButton);
        clickElement(ContantsMainPage.basketButton);
    }

    public void categoryCount() {
        List<MobileElement> listElements = findByElements(ContantsMainPage.categorylist);
        logMessage("Category items count: "+listElements.size());

    }


}
