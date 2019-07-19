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

WebUI.callTestCase(findTestCase('TC_LogIn/LogInCall'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/AdministracionIndex'))

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/Negocio'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/SubZona'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/SubzonaElements/btn_newSubzona'))

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/SubzonaElements/input_code'), subzoneCode)

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/SubzonaElements/input_name'), subzoneName)

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/SubzonaElements/input_description'), subzoneDescription)

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/SubzonaElements/btn_create'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Registro de subzona guardado exitosamente', false)

WebUI.closeBrowser()

