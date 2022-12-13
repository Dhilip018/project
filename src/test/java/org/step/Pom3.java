package org.step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 extends BaseClass {
	public Pom3 () {
		PageFactory.initElements(driver, this);
	
		
	}
	  @FindBy(xpath="//select[@style='width: 200px;']")  
      private WebElement selectcountry;
	  
     @FindBy(xpath="//input[@type='checkbox']")  
     private WebElement tc;
     @FindBy(xpath="//button[text()='Proceed']")  
     private WebElement proceed;
     
     
	public WebElement getSelectcountry() {
		return selectcountry;
	}
	public WebElement getTc() {
		return tc;
	}
	public WebElement getProceed() {
		return proceed;
	}



	
	
	
	


}