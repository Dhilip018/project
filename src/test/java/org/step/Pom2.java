package org.step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 extends BaseClass {
	
	public Pom2 () {
		PageFactory.initElements(driver, this);
	}
		

       @FindBy(xpath="//input[@type='text']")  
        private WebElement enterpromo;
       @FindBy(xpath="//button[@class='promoBtn']")  
       private WebElement apply;
       @FindBy(xpath="//button[text()='Place Order']")  
       private WebElement placeorder;
       
       
	public WebElement getEnterpromo() {
		return enterpromo;
	}
	public WebElement getApply() {
		return apply;
	}
	public WebElement getPlaceorder() {
		return placeorder;
	}
       
       
       
       
       
       
        
        
}