import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url_CENTRAL)

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject('ElementsBridge/Login/userInput'), 'diego')

WebUI.sendKeys(findTestObject('ElementsBridge/Login/passwordInput'), 'suser123')

WebUI.click(findTestObject('ElementsBridge/Login/submitBtn'))

WebUI.sendKeys(findTestObject('ElementsBridge/Login/PasswordChange/oldPasswordInput'), 'suser123')

WebUI.sendKeys(findTestObject('ElementsBridge/Login/PasswordChange/newPasswordInput'), 'suser1234')

WebUI.sendKeys(findTestObject('ElementsBridge/Login/PasswordChange/newPassword2Input'), 'suser1234')

WebUI.click(findTestObject('ElementsBridge/Login/PasswordChange/confirmSubmitBtn'))

WebUI.verifyElementPresent(findTestObject('ElementsBridge/Login/logoutReference'), 0)

WebUI.closeBrowser()