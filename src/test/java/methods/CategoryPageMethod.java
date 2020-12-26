package methods;

import constants.*;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import java.util.List;

public class CategoryPageMethod extends BaseMethods
{
    public void backToButton(){
        clickElement(findByElement(ContantsCategoryPage.backButton));
    }
    public void addingProduct(int productCount, int whichProduct){
        List<MobileElement> addList = findByElements(ContantsCategoryPage.productAddList);
        for (int i=0; i<productCount; i++) {
            clickElement(addList.get(whichProduct-1));
        }
    }
    public void controlOfAmountOfProduct(int expectedProductCount, int whichProduct) {
        List<MobileElement> productCountList = findByElements(ContantsCategoryPage.productCountList);
        String actualProductCount = productCountList.get(whichProduct-1).getText();
        Assert.assertEquals(expectedProductCount,actualProductCount);
    }

}
