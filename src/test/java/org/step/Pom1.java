package org.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 extends BaseClass{
	


	public Pom1 () {
		PageFactory.initElements(driver, this);
		
	}
	
       @FindBy(xpath="//input[@type='search']")
       private WebElement search;
       @FindBy(xpath="(//button[text()='ADD TO CART'])")
       private WebElement select;
       @FindBy(xpath="//img[@alt='Cart']")
       private WebElement addtocart;
       @FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
       private WebElement proceedtocheckout;
       
       
       
       
	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}


	public WebElement getSearch() {
		return search;
	}

	
	public WebElement getSelect() {
		return select;
	}
	
	
	public WebElement getAddtocart() {
		return addtocart;
	}
}
       
       
       
       
	
	
		
		

	
	

	
	
	
	