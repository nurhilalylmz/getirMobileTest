package methods;

import constants.*;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import java.util.List;



public class BasketMethod extends BaseMethods
{

    public void removeProducts() throws InterruptedException {
        List<MobileElement> removeProductButtonList=findByElements(ContantsBasketPage.removeButton);
        for(int i=0;i<removeProductButtonList.size();i++){
            removeProductButtonList.get(i).click();
        }
    }

    public void checkBasketForNoItems() {
            Assert.assertTrue(existElement(ContantsBasketPage.noProductTitle));
    }

    public void increaseProducts(){
        List<MobileElement> addProductButtonList=findByElements(ContantsBasketPage.addButton);
        for(int i=0;i<addProductButtonList.size();i++){
            addProductButtonList.get(i).click();
        }
    }
}
