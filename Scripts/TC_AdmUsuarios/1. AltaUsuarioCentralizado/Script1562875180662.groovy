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

WebUI.waitForElementClickable(findTestObject('ElementsBridge/Entradas_Index/Seguridad'), 2)

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/Seguridad'))

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/AdmUsuariosIndex'))

WebUI.waitForElementClickable(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/new_user'), 5)

WebUI.comment('Estoy en el index de Administracion de usuarios')

WebUI.doubleClick(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/new_user'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/title_newUser'), 
    5)

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_user'), userCode)

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_userName'), 'Katalon Test')

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_email'), 'testkatalon@testkatalon.com')

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_password'), GlobalVariable.defaultPassword)

WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_password2'), GlobalVariable.defaultPassword)

not_run: WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_userShortName'), 
    '3131')

not_run: WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_shortPassword'), 
    '0822')

not_run: WebUI.sendKeys(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/input_shortPassword2'), 
    '0822')

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_mustChangePassword'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/btn_TiendasGruposAsociados'))

WebUI.waitForElementAttributeValue(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/select_modal_store'), 
    'modalStore', '3', 3)

'Se elige la Tienda 1'
WebUI.selectOptionByValue(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/select_modal_store'), 
    '3', false)

WebUI.waitForElementClickable(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_group7'), 
    5)

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_group7'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_group8'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_group6'))

WebUI.click(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/btn_saveGroups'))

WebUI.doubleClick(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/check_passwordExpire'))

WebUI.waitForElementClickable(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/btn_save'), 5)

CustomKeywords.'jsClick.clickUsingJS'(findTestObject('ElementsBridge/Seguridad/Administracion de Usuarios/newUser/btn_save'), 
    1)

WebUI.verifyElementPresent(findTestObject('ElementsBridge/msg_success'), 1)

WebUI.comment('Alta exitosa. De nuevo en el index')

WebUI.delay(10)

CustomKeywords.'com.database.sql.connectDB'(GlobalVariable.DBurl, GlobalVariable.DBCname, GlobalVariable.DBport, GlobalVariable.DBuser, 
    GlobalVariable.DBpassword)

def recordset = CustomKeywords.'com.database.sql.executeQuery'(('select * from rs_user where name = \'' + userCode) + '\'')

if (recordset.next() && (recordset.getString('name') == userCode)) {
    System.out.println(('Usuario ' + userCode) + ' creado correctamente')
} else {
    System.out.println('No se creo el registro')

    throw new com.kms.katalon.core.exception.StepFailedException('Fallado, no se creo el registro.')
}

CustomKeywords.'com.database.sql.closeDatabaseConnection'()

WebUI.callTestCase(findTestCase('TestCorrerJobs'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ElementsBridge/Entradas_Index/Seguridad'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/Seguridad'))

CustomKeywords.'jsClick.clickUsingJS'(findTestObject('ElementsBridge/Entradas_Index/AdmUsuariosIndex'), 1)

WebUI.verifyTextPresent(userCode, false)

WebUI.closeBrowser()

WebUI.delay(10)

CustomKeywords.'com.database.sql.connectDB'(GlobalVariable.DBurl, GlobalVariable.DBTname, GlobalVariable.DBport, GlobalVariable.DBuser, 
    GlobalVariable.DBpassword)

def rs2 = CustomKeywords.'com.database.sql.executeQuery'(('select * from rs_user where name = \'' + userCode) + '\'')

if (rs2.next() && (rs2.getString('name') == userCode)) {
    System.out.println(('Usuario ' + userCode) + ' creado correctamente')
} else {
    System.out.println('No se creo el registro')

    throw new com.kms.katalon.core.exception.StepFailedException('Fallado, no se creo el registro.')
    
    CustomKeywords.'com.database.sql.closeDatabaseConnection'()
}

