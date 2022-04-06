package Pages;

import BaseTest.BSBaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.io.IOException;
import java.time.Duration;


public class LoginPage extends BSBaseClass {

    //Actions
    public String ValidateLoginPageTitle () {return driver.getTitle();}

    public void doLogin () throws IOException
        {
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

          //DataDriven concept
//        //Step1 give path of the file
//          path = System.getProperty("user.dir")+"\\TestData\\Test_data.xlsx";
//          System.out.println(path);
//
//        //.Step2 give path in fileinputstream class from where we want to add file
//          FileInputStream fis = null;
//        try
//        {
//            fis = new FileInputStream(path);
//        }
//        catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        //step3 move to workbook
//        XSSFWorkbook wb = new XSSFWorkbook(fis);
//        //step4 move to specific sheet
//        XSSFSheet sheet = wb.getSheetAt(0);
//        //Step5 read rows from excel sheet
//        System.out.println(sheet.getLastRowNum());
//        //Step6 read data from cell
//        //String usrname=sheet.getRow(1).getCell(0).getStringCellValue();
//        //System.out.println("username is"+usrname);
//        for (int i = 1; i <= sheet.getLastRowNum(); i++)
//        {
//            uname = sheet.getRow(i).getCell(0).getStringCellValue();
//            usname.sendKeys(uname);
//            upass=sheet.getRow(i).getCell(1).getStringCellValue();
//            uspass.sendKeys(upass);
//            loginbtn.click();
//            System.out.println("username and password"+" "+uname+" "+upass);
//        }
        }

        public void checkInventoryItem() throws IOException {
            doLogin();
            Assert.assertTrue(driver.findElements(By.cssSelector(".inventory_item")).size() == 6);
        }

        public void checkAddToCartButton() throws IOException {
            doLogin();
            Assert.assertTrue(driver.findElements(By.xpath("//button[text()='ADD TO CART']")).size() == 6);
        }
}
