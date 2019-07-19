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

'Conectar a BD'
CustomKeywords.'com.database.sql.connectDB'('10.4.11.8', 'QA_BMC_43_0705', '1433', 'sa', 'nosotros')

'Hacer query'

def recordset = CustomKeywords.'com.database.sql.executeQuery'("select * from rs_user")

while (recordset.next())
{
	'obtiene el valor name'
	Object name = recordset.getObject("name")

	if (name == userCode){
		System.out.println(" >>>> name = " + name)
} else {
	System.out.println (' No se creó el usuario')
}
}