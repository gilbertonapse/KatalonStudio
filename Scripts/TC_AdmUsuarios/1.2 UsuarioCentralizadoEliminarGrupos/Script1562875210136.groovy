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

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/Seguridad'))

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/AdmUsuariosIndex'))

WebUI.comment('Estoy en el index de Administracion de usuarios')

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/btn_acciones1'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/btn_editar1'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/updateUser/btn_deleteGroup'))

WebUI.waitForElementPresent(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/updateUser/btn_deleteGroup'), 0)

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/updateUser/btn_deleteGroup'))

WebUI.waitForElementClickable(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/updateUser/btn_update'), 3)

WebUI.doubleClick(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_passwordExpire'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/updateUser/btn_update'))

WebUI.verifyElementPresent(findTestObject('ElementsBridge/msg_success'), 1)

WebUI.comment('Edicion exitosa. Estoy de nuevo en el index')

WebUI.closeBrowser()

WebUI.closeBrowser()

