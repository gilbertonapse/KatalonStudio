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

not_run: WebUI.callTestCase(findTestCase('TC_LogIn/LogInCallCentral'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('ElementsBridge/Monitoreo/btn_Monitoreo'), 5)

WebUI.click(findTestObject('ElementsBridge/Monitoreo/btn_Monitoreo'))

WebUI.waitForPageLoad(3)

CustomKeywords.'jsClick.clickUsingJS'(findTestObject('ElementsBridge/Monitoreo/btn_ProcesosProgramadosCentral'), 1)

WebUI.waitForPageLoad(3)

WebUI.refresh()

WebUI.click(findTestObject('ElementsBridge/Monitoreo/play_masterRegularReplicationJob'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Ejecutando...', false)

WebUI.callTestCase(findTestCase('TC_LogIn/LogInCallTienda1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ElementsBridge/Monitoreo/btn_Monitoreo'))

WebUI.click(findTestObject('ElementsBridge/Monitoreo/btn_Monitoreo'))

WebUI.waitForPageLoad(3)

CustomKeywords.'jsClick.clickUsingJS'(findTestObject('ElementsBridge/Monitoreo/btn_ProcesosProgramadosTienda'), 1)

WebUI.waitForPageLoad(3)

WebUI.refresh()

CustomKeywords.'jsClick.clickUsingJS'(findTestObject('ElementsBridge/Monitoreo/play_masterRegularJob'), 1)

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Ejecutando...', false)

