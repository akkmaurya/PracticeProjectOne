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

/*
 * Open the browser, navigate to a specific URL, and verify the presence of a Sign In link on the page.
 *
 * 1. Open the browser.
 * 2. Navigate to the URL https://petstore.octoperf.com/actions/Catalog.action.
 * 3. Verify that the Sign In link is present on the page.
 *
 */
// Open the browser
WebUI.openBrowser('')

// Navigate to the URL https://petstore.octoperf.com/actions/Catalog.action
WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

// Verify that the Sign In link is present on the page
WebUI.click(findTestObject('Page_JPetStore Demo/a_Sign In'))

WebUI.click(findTestObject('Page_JPetStore Demo/a_Register Now'))

WebUI.setText(findTestObject('Page_JPetStore Demo/input_User ID_username'), 'petstoreuser')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_New password_password'), 'petstoreuser')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_Repeat password_repeatedPassword'), 'petstoreuser')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_First name_account.firstName'), 'petstoreuser')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_Last name_account.lastName'), 'petstoreuser')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_Email_account.email'), 'petstoreuser@gmail.com')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_Phone_account.phone'), '1233214567')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_Address 1_account.address1'), 'Address1')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_Address 2_account.address2'), 'Address2')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_City_account.city'), 'Mumbai')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_State_account.state'), 'Maha')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_Zip_account.zip'), '429312')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_Country_account.country'), 'India')

WebUI.click(findTestObject('Page_JPetStore Demo/input_Enable MyBanner_newAccount'))

