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

CustomKeywords.'com.database.sql.connectDB'(GlobalVariable.DBurl, GlobalVariable.DBname, GlobalVariable.DBport, GlobalVariable.DBuser, 
    GlobalVariable.DBpassword)

def recordset = CustomKeywords.'com.database.sql.executeQuery'("select * from PA_STR_STORECHAIN where CODE = '" + chainCode + 
    "'")

if (recordset.next() != -1) {
    System.out.println('Cadena ' + chainName + ' creada correctamente')
} else {
    System.out.println('No se creó el registro')
}

CustomKeywords.'com.database.sql.closeDatabaseConnection'()

