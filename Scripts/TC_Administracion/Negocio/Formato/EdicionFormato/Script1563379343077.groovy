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

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/Formato'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/FormatElements/btn_accionesFormat'))

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/FormatElements/btn_editFormat'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementNotClickable(findTestObject('ElementsBridge/Administracion/Negocio/FormatElements/newFormat/input_code'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/FormatElements/newFormat/input_name'), 'Formato editado')

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/FormatElements/newFormat/input_description'), 'Descripcion editada')

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/FormatElements/newFormat/flag_disabled'))

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/FormatElements/updateFormat/btn_updateFormat'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Formato guardado con éxito', false)

WebUI.closeBrowser()

