package methods;

import constants.*;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import java.util.List;



public class BasketMethod extends BaseMethods
{
    public void removeProducts() {
        List<MobileElement> removeProductButtonList=findByElements(ContantsBasketPage.removeButton);
        for(int i=0;i<removeProductButtonList.size();i++){
            clickElement(removeProductButtonList.get(i));
        }
    }

    public void checkBasketForNoItems() {
            Assert.assertTrue(existElement(ContantsBasketPage.noProductTitle));
    }
}
