package com.crm.autodesk.ContactsTestNGTests;

import org.testng.annotations.Test;

import com.crm.autodesk.GenericUtility.BaseClass;
import com.crm.autodesk.objectRepository.ContactsPage;
import com.crm.autodesk.objectRepository.CreateNewContactsPage;
import com.crm.autodesk.objectRepository.HomePage;

public class TC_28_3ContactsWithDoNotCallBoxEnabled extends BaseClass{
	
	@Test(groups={"RegSuite"})
	public void ContactsWithDoNotCallCheckboxEnabled() throws Throwable, Throwable {
		
		// Test case data
				String firsName = excelLib.getExcelData("Sheet1", 2, 2) + jLib.getRandomNum();
				String lastName = excelLib.getExcelData("Sheet1", 2, 3) + jLib.getRandomNum();
		        String emailId  = excelLib.getExcelData("Sheet1", 2, 4) + jLib.getRandomNum();

				// click on "Contacts link" from HomePage POM
						HomePage hp=new HomePage(driver);
						hp.clickOnContacts();
		
				
				// click on "create Contacts" from Contacts POM
				ContactsPage cp=new ContactsPage(driver);
				cp.clickOnCreateContacts();
				
				// enter mandatory field from CreateNewContacts POM
				CreateNewContactsPage cnc=new CreateNewContactsPage(driver);
				cnc.enterMandatoryField(firsName, lastName,emailId);
				
				// tick the "Do not call" checkbox
				cnc.clickOndoNotCallCheckBox();
				
				 //Thread.sleep(3000);
				 
				// click on save option
				cnc.clickOnSaveBtn();
				
				// To handle the Alert Pop-up
				wLib.acceptAlert(driver);
				
		
	}

}
