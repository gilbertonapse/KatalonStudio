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

WebUI.callTestCase(findTestCase('TC_LogIn/LogInCallCentral'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/AdministracionIndex'))

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/Negocio'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/Cadena'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/btn_accionesCadena'))

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/btn_editCadena'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementNotClickable(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/input_code'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/input_name'), 'Cadena Editada')

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/input_description'), 'Descripcion editada')

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/flag_disabled'))

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/newCadena/updateCadena/btn_updateCadena'))

WebUI.waitForPageLoad(3)

WebUI.verifyTextPresent('Registro de cadena guardado exitosamente', false)

WebUI.closeBrowser()

