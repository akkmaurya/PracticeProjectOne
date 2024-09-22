import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class PetStoreKeyword {



	@Keyword
	def login() {

		WebUI.click(findTestObject('Page_JPetStore Demo/a_Sign In'), FailureHandling.STOP_ON_FAILURE)

		WebUI.setText(findTestObject('Page_JPetStore Demo/input_Need a user name and password_username'), 'testuser')

		WebUI.setText(findTestObject('Page_JPetStore Demo/input_New password_password'), 'testuser')

		WebUI.click(findTestObject('Page_JPetStore Demo/input_Need a user name and password_signon'))
	}

	@Keyword
	def logout() {

		WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/signoutlink'), FailureHandling.STOP_ON_FAILURE)
	}
}
