package EcommerceAutomation;

import java.io.File;
import java.security.PublicKey;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class pom {
WebDriver driver;
public pom (WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//locator

@FindBy(xpath = "//input[@id='user-name']")WebElement user_name ;
@FindBy(xpath = "//input[@id='password']")WebElement password;
@FindBy(xpath = "//input[@id='login-button']")WebElement submit;

@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")WebElement product1;
@FindBy(xpath = "//button[@id='add-to-cart']")WebElement addtocart1;
@FindBy(xpath = "//button[@id='back-to-products']")WebElement back1;
@FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")WebElement product2;
@FindBy(xpath = "//button[@id='add-to-cart']")WebElement addtocart2;
@FindBy(xpath = "//button[@id='back-to-products']")WebElement back2;
@FindBy(xpath = "//span[@class='shopping_cart_badge']")WebElement shopingcart;
@FindBy(xpath = "//button[@id='checkout']")WebElement checkout;
@FindBy(xpath = "//input[@id='first-name']") WebElement first_name;
@FindBy(xpath = "//input[@id='last-name']") WebElement second_name;
@FindBy(xpath = "//input[@id='postal-code']") WebElement pst_code;
@FindBy(xpath = "//input[@id='continue']") WebElement continue_shopping;
@FindBy(xpath = "//button[@id='finish']") WebElement finsh;
@FindBy(xpath = "//div[@id='checkout_complete_container']") WebElement ss_complet ;
@FindBy(xpath = "//button[@id='back-to-products']") WebElement back3;
//utiles


public void login(String ur,String pass) {
	user_name.sendKeys(ur);
	password.sendKeys(pass);
	submit.click();
	
}
public void shop() {
product1.click();
addtocart1.click();
back1.click();
//2
product2.click();
addtocart2.click();
back2.click();
//
shopingcart.click();
checkout.click();
//
first_name.sendKeys("sai");
second_name.sendKeys("murali");
pst_code.sendKeys("501510");
continue_shopping.click();
finsh.click();

}

public void screenshot() {
	 File sr=ss_complet.getScreenshotAs(OutputType.FILE);
	 File traget= new File("C:\\Users\\Sai Murali\\eclipse-workspace\\selenium\\src\\test\\java\\EcommerceAutomation\\finsh.png");
	 sr.renameTo(traget);
}


}
