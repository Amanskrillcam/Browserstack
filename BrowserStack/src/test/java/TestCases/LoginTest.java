package TestCases;

import BaseTest.BSBaseClass;
import Pages.LoginPage;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest extends BSBaseClass {

     LoginPage lp= new LoginPage();

        @Test(priority= 0)
        public void ValidateLoginPageTitleTest(){lp.ValidateLoginPageTitle();}

        @Test(priority = 1)
        public void doLogin() throws IOException {lp.doLogin();}

        @Test(priority = 2)
        public void checkInventoryItemTest() throws IOException {lp.checkInventoryItem();}

        @Test(priority = 3)
        public void checkAddToCartButtonTest() throws IOException {lp.checkAddToCartButton();}
}

