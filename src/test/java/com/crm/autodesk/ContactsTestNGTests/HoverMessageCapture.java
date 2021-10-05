package com.crm.autodesk.ContactsTestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.autodesk.GenericUtility.BaseClass;
import com.crm.autodesk.objectRepository.HomePage;

public class HoverMessageCapture extends BaseClass {
	
	@Test
	public void hoverTest() {
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		
		WebElement checkbox=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		System.out.println(checkbox.getAttribute("title"));
		
	}

}
