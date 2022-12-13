package org.step;



import java.io.IOException;

import com.helper.File_Reader_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	public static POM po;
	
@Given("user get url")
public void user_get_url() throws IOException {
	
	String browser = File_Reader_Manager.getinstanceCr().getbrowser();
	
	browserLaunch(browser);
	 String url = File_Reader_Manager.getinstanceCr().geturl();
	
	getUrl(url);
	maximize();
	implicityWait(10);
}

@When("user select the beetroot")
public void user_select_the_beetroot() {
   
    po =new POM();
     
	sendKeys(po.getinstancePom1().getSearch(), "BeetRoot");
	  }


@When("user click to add to cart")
public void user_click_to_add_to_cart() {
	btnClick(po.getinstancePom1().getSelect());
}

@When("user click to checkout")
public void user_click_to_checkout() {
	btnClick(po.getinstancePom1().getAddtocart());
}
@When("user proceed to check")
public void user_proceed_to_check() throws InterruptedException {
	Thread.sleep(5000);
	
	btnClick(po.getinstancePom1().getProceedtocheckout());
   
}

@When("user enter the promo")
public void user_enter_the_promo() throws InterruptedException {
	Thread.sleep(5000);
	sendKeys(po.getinstancePom2().getEnterpromo(), "72762");
}

@When("user select the apply")
public void user_select_the_apply() throws InterruptedException {
	Thread.sleep(5000);
	btnClick(po.getinstancePom2().getApply());
}

@When("user select the place order")
public void user_select_the_place_order() {
   btnClick(po.getinstancePom2().getPlaceorder());

}

@When("user select the country")
public void user_select_the_country() throws InterruptedException {
	Thread.sleep(8000);
	
   SelectByvalue(po.getinstancePom3().getSelectcountry(), "India");
   
	  
}
@When("user select the tc")
public void user_select_the_tc() {
	btnClick(po.getinstancePom3().getTc());	
}
@When("user click to proceed")
public void user_click_to_proceed() {
	btnClick(po.getinstancePom3().getProceed());
	quite();
}
}
