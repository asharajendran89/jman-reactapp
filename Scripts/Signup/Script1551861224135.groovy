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

'CLICK ON SIGNUP BUTTON'
WebUI.click(findTestObject('Page_login React App/Page_signup React App/button_Signup'))

'ENTER FIRST NAME'
WebUI.setText(findTestObject('Page_login React App/Page_signup React App/input__form-control'), 'Asha')

'ENTER LAST NAME'
WebUI.setText(findTestObject('Page_login React App/Page_signup React App/input__form-control_1'), 'Rajendran')

'ENTER EMAIL ADDRESS'
WebUI.setText(findTestObject('Page_login React App/Page_signup React App/input__form-control_11'), 'asharajendran8@gmail.com')

'ENTER PASSWORD'
WebUI.setEncryptedText(findTestObject('Page_login React App/Page_signup React App/input__form-control_14'), 'Qs8BrKvHtI8=')

'ENTER PHONE NUMBER'
WebUI.setText(findTestObject('Page_login React App/Page_signup React App/input__form-control_16'), '08123498014')

'CLICK ON SUBMIT '
WebUI.click(findTestObject('Page_login React App/Page_signup React App/button_Submit'))

'VERIFY SUCESSFULL SINGUP'
WebUI.verifyTextPresent('Signup Successfully Done', false)

