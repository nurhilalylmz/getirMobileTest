package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Ca;
import methods.BasketMethod;
import methods.CategoryPageMethod;
import methods.LoginMethod;
import methods.MainPageMethod;

import java.net.MalformedURLException;

public class StepDefinition {

        BasketMethod basketMethod=new BasketMethod();
        CategoryPageMethod categoryPageMethod=new CategoryPageMethod();
        LoginMethod loginMethod=new LoginMethod();
        MainPageMethod mainPageMethod=new MainPageMethod();

        @Given("^Open to the GetirApp$")
        public void openToTheGetirApp() throws MalformedURLException {
                loginMethod.startApp();
        }
        @Then("^Login by entering username \"([^\"]*)\" password \"([^\"]*)\"$")
        public void loginByUsernameAndPassword(String username, String password) throws InterruptedException {
                loginMethod.login(username,password);
        }
        @Then("^Checking for no items in the basket$")
        public void checkBasketForNoItems(){
                basketMethod.checkBasketForNoItems();
        }
        @Then("^Go to the \"([^\"]*)\" category$")
         public void goToTheSelectedCategory(String category){
                mainPageMethod.selectCategory(category);
        }
        @Then("^\"([^\"]*)\" product is added from the \"([^\"]*)\"\\. product$")
        public void addingAmountOfProduct(int productCount, int whichProduct) throws InterruptedException {
                categoryPageMethod.addingProduct(productCount,whichProduct);
        }
        @Then("^The status of adding \"([^\"]*)\" of the \"([^\"]*)\"\\. product to the basket is controlled$")
        public void controlOfAddingAmountOfProductToTheBasket(int productCount, int whichProduct){
                categoryPageMethod.controlOfAmountOfProduct(productCount,whichProduct);
        }
        @Then("^Return to the homepage$")
        public void returnToHomePage() throws InterruptedException {
                categoryPageMethod.backToButton();
        }
        @Then("^Go to the basket\\.$")
        public void goToTheBasket(){
                mainPageMethod.goToBasket();
        }
        @Then("^All items in the basket are deleted\\.$")
        public void allItemsInTheBasketAreDeleted() throws InterruptedException {
                basketMethod.removeProducts();
        }

        @Then("^Checked in if logged in\\.$")
        public void checkedInIfLoggedIn()
        {
                loginMethod.checkSuccessLogin();
        }

        @Then("^Write Console Category items$")
        public void writeConsoleCategoryItems() {
                mainPageMethod.categoryCount();
        }

        @Then("^Increasing the number of items in the basket\\.$")
        public void ıncreasingTheNumberOfItemsInTheBasket()
        {
                basketMethod.increaseProducts();
        }
}

