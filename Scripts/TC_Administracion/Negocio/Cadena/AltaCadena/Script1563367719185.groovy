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

WebUI.click(findTestObject('ElementsBridge/Entradas_Index/Cadena'))

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/btn_newCadena'))

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/input_code'), chainCode)

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/input_name'), chainName)

WebUI.setText(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/input_description'), chainDescription)

WebUI.click(findTestObject('ElementsBridge/Administracion/Negocio/CadenaElements/newCadena/btn_save'))

WebUI.waitForPageLoad(4)

WebUI.verifyTextPresent('Registro de cadena guardado exitosamente', false)

WebUI.closeBrowser()

CustomKeywords.'com.database.sql.connectDB'(GlobalVariable.DBurl, GlobalVariable.DBname, GlobalVariable.DBport, GlobalVariable.DBuser, 
    GlobalVariable.DBpassword)

def recordset = CustomKeywords.'com.database.sql.executeQuery'(('select * from PA_STR_STORECHAIN where CODE =\' ' + chainCode) + 
    '\'')

if (recordset.next() != -1) {
    System.out.println(('Cadena ' + chainName) + ' creada correctamente')
} else {
    System.out.println('No se creó el registro')
}

CustomKeywords.'com.database.sql.closeDatabaseConnection'()

