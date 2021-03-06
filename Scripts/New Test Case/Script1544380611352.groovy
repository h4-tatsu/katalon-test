import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.56.14:3000/users')

WebUI.click(findTestObject('Object Repository/Page_TestApp/html_TestApp              kata'))

WebUI.click(findTestObject('Object Repository/Page_TestApp/a_New User'))

WebUI.setText(findTestObject('Object Repository/Page_TestApp/input_Name_username'), 'new user')

WebUI.setText(findTestObject('Object Repository/Page_TestApp/input_Age_userage'), '22')

WebUI.click(findTestObject('Object Repository/Page_TestApp/input_Age_commit'))

WebUI.click(findTestObject('Object Repository/Page_TestApp/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_TestApp/input_Name_username'), 'new user test')

WebUI.setText(findTestObject('Object Repository/Page_TestApp/input_Age_userage'), '24')

WebUI.click(findTestObject('Object Repository/Page_TestApp/input_Age_commit'))

WebUI.click(findTestObject('Object Repository/Page_TestApp/a_Back'))

WebUI.click(findTestObject('Object Repository/Page_TestApp/a_Destroy'))

WebUI.acceptAlert()

WebUI.refresh()

WebUI.closeBrowser()

