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

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/new_user'))

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_user'), 'test12345')

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_userName'), 'Katalon Test')

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_email'), 'testkatalon@testkatalon.com')

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_password'), GlobalVariable.defaultPassword)

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_password2'), GlobalVariable.defaultPassword)

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_userShortName'), '3131')

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_shortPassword'), '0822')

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_shortPassword2'), '0822')

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_mustChangePassword'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/btn_TiendasGruposAsociados'))

WebUI.selectOptionByValue(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/select_modal_store'), '4', false)

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_group7'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_group8'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/btn_saveGroups'))

WebUI.waitForElementClickable(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/updateUser/btn_cancel'), 3)

WebUI.doubleClick(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_passwordExpire'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/updateUser/btn_cancel'))

WebUI.verifyElementPresent(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/title_admusuarios'), 1)

WebUI.comment('Cancelacion exitosa. De nuevo en index')

WebUI.closeBrowser()

