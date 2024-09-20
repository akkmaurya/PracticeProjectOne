import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/a_Sign In'), 0)

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Need a user name and password_username'))

WebUI.rightClick(findTestObject('Object Repository/Page_JPetStore Demo/input_Need a user name and password_signon'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Need a user name and password_signon'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Register Now'))

WebUI.rightClick(findTestObject('Object Repository/Page_JPetStore Demo/input_User ID_username'))

WebUI.rightClick(findTestObject('Object Repository/Page_JPetStore Demo/input_New password_password'))

WebUI.rightClick(findTestObject('Object Repository/Page_JPetStore Demo/input_Repeat password_repeatedPassword'))

WebUI.rightClick(findTestObject('Object Repository/Page_JPetStore Demo/input_First name_account.firstName'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Last name_account.lastName'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Email_account.email'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Phone_account.phone'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Address 1_account.address1'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/table_First nameLast nameEmailPhoneAddress _c47444'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Address 2_account.address2'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_City_account.city'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_State_account.state'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Zip_account.zip'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Country_account.country'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_User ID_username'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_New password_password'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Repeat password_repeatedPassword'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_First name_account.firstName'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/input_Enable MyBanner_newAccount'))

