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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

CustomKeywords.'BrowserFunctionKeyword.lauchBrowser'()

CustomKeywords.'PetStoreKeyword.login'()

WebUI.click(findTestObject('Page_JPetStore Demo/FishLink'))

WebUI.click(findTestObject('Page_JPetStore Demo/AngelFish'))

WebUI.click(findTestObject('Page_JPetStore Demo/LargeAngelFish'))

WebUI.click(findTestObject('Page_JPetStore Demo/DogsLink'))

WebUI.click(findTestObject('Page_JPetStore Demo/BulldogLink'))

WebUI.click(findTestObject('Page_JPetStore Demo/MaleBullDog'))

WebUI.click(findTestObject('Page_JPetStore Demo/CatsLink'))

WebUI.click(findTestObject('Page_JPetStore Demo/ManxCat'))

WebUI.click(findTestObject('Page_JPetStore Demo/TaillessManxAddtoCart'))

WebUI.click(findTestObject('Page_JPetStore Demo/ReptilesLink'))

WebUI.click(findTestObject('Page_JPetStore Demo/RattleSnakeLink'))

WebUI.click(findTestObject('Page_JPetStore Demo/VenomlessAddtoCart'))

WebUI.click(findTestObject('Page_JPetStore Demo/BirdsLink'))

WebUI.click(findTestObject('Page_JPetStore Demo/AmazonParrotLink'))

WebUI.click(findTestObject('Page_JPetStore Demo/ParrotAddtoCart'))

//CustomKeywords.'OperationOnWebElement.totalcountofElement'(findTestObject('Object Repository/Page_JPetStore Demo/TotalCostColumn'))

TestObject testObj = findTestObject('Object Repository/Page_JPetStore Demo/TotalCostColumn')

List<WebElement> elements = WebUI.findWebElements(testObj, 10)

//def elements =  WebUiBuiltInKeywords.findWebElements(findTestObject(), 20)

def sumOftTotalCartValue  = 0

for (int i = 0; i < elements.size(); ++i) {
    def amount = elements.get(i).getText().minus("\$").toFloat()
	sumOftTotalCartValue = amount + sumOftTotalCartValue
}

KeywordUtil.logInfo(sumOftTotalCartValue.toString())


