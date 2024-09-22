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
 * 1. Open Browser
 * 2. Navigate URL https://petstore.octoperf.com/actions/Catalog.action
 * 3. Verify Sign In link present on page
 * 4. Sign in with username testuser and password testuser
 * 5. Click on Login button
 * 6. Click on Fish link
 */
// 1. Open Browser
WebUI.openBrowser('')

// 2. Navigate URL https://petstore.octoperf.com/actions/Catalog.action
WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

// 3. Verify Sign In link present on page
WebUI.click(findTestObject('Page_JPetStore Demo/a_Sign In'), FailureHandling.STOP_ON_FAILURE)

// 4. Sign in with username testuser and password testuser
WebUI.setText(findTestObject('Page_JPetStore Demo/input_Need a user name and password_username'), 'testuser')

WebUI.setText(findTestObject('Page_JPetStore Demo/input_New password_password'), 'testuser')

// 5. Click on Login button
WebUI.click(findTestObject('Page_JPetStore Demo/input_Need a user name and password_signon'))

WebUI.click(findTestObject('Page_JPetStore Demo/FishLink'))

WebUI.click(findTestObject('Page_JPetStore Demo/AngelFish'))

WebUI.click(findTestObject('Page_JPetStore Demo/LargeAngelFish'))

WebUI.click(findTestObject('Page_JPetStore Demo/ProceedToCheckout'))

WebUI.verifyElementPresent(findTestObject('Page_JPetStore Demo/ContinueButton'), 0)

WebUI.click(findTestObject('Page_JPetStore Demo/ContinueButton'))

WebUI.click(findTestObject('Page_JPetStore Demo/ConfirmButton'))

WebUI.verifyElementPresent(findTestObject('Page_JPetStore Demo/OrderSubmittedLabel'), 0)

WebUI.click(findTestObject('Page_JPetStore Demo/signoutlink'))

WebUI.closeBrowser()

