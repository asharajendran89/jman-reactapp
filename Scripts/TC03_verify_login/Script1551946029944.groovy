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

WebUI.comment('TO VERIFY SUCESSFUL LOGIN')

'ENTER EMAIL ADDRESS'
WebUI.setText(findTestObject('Page_login React App/input_Submit_form-control'), findTestData('signup').getValue(3, 1))

'ENTER PASSWORD'
WebUI.setEncryptedText(findTestObject('Page_login React App/input_Submit_form-control_1'), 'Qs8BrKvHtI8=')

'CLICK ON LOGIN'
WebUI.click(findTestObject('Page_login React App/button_Submit'))

'VERIFY SUCESSFULL LOGIN'
WebUI.verifyElementPresent(findTestObject('Page_login React App/label_Profile name'), 30, FailureHandling.STOP_ON_FAILURE)

