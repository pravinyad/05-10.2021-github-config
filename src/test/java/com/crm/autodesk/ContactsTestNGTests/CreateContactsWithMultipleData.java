package com.crm.autodesk.ContactsTestNGTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.autodesk.GenericUtility.BaseClass;
import com.crm.autodesk.objectRepository.ContactsPage;
import com.crm.autodesk.objectRepository.CreateNewContactsPage;
import com.crm.autodesk.objectRepository.HomePage;

import junit.framework.Assert;
@Listeners(com.crm.autodesk.GenericUtility.ListnerS.class)
public class CreateContactsWithMultipleData extends BaseClass{
	
	@DataProvider
	public Object[][] getData() throws Throwable{
		
		return excelLib.getExcelData("Sheet2");
	}
	
	@Test(dataProvider="getData", retryAnalyzer=com.crm.autodesk.GenericUtility.RetryAnalyser.class)
	public void createContacWithMultipleData(String lastName,String email) {
		
		// Navigate to contacts Link
		HomePage hp=new HomePage(driver);
		hp.clickOnContacts();
		
		// click on create new Contacts
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateContacts();
		
		// Enter last name in textbox
		CreateNewContactsPage cnp=new CreateNewContactsPage(driver);
		cnp.getLastNameEdit().sendKeys(lastName);
		
		// Enter email in textbox
		cnp.getEmailEdit().sendKeys(email);
		
		// Save the page
		cnp.clickOnSaveBtn();
		
		Assert.assertEquals(false, true);
		
	}

}
