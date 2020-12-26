package methods;

import constants.*;
import io.appium.java_client.MobileElement;

import java.util.List;

public class MainPageMethod extends BaseMethods
{

    public void selectCategory(String category){
        List<MobileElement> listElements = findByElements(ContantsMainPage.categorylist);

        for(MobileElement el : listElements){
            if(el.getText().equalsIgnoreCase(category)){
                clickElement(el);
            }
        }

    }

    public void goToBasket(){
        waitSecond(10);
        clickElement(findByElement(ContantsMainPage.basketButton));
    }


}
