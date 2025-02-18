import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_buttonLibroDigital'), 5)

WebUI.click(findTestObject('Page_libroDigital_matricula/libroDigital_buttonLibroDigital'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_buttonMatricula'), 5)

WebUI.click(findTestObject('Page_libroDigital_matricula/libroDigital_buttonMatricula'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_buttonCambioCurso'), 5)

WebUI.click(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_buttonCambioCurso'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_selectCurso'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_selectCurso'), 
    'Primero Básico B', false)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_buttonCambiar'), 
    5)

WebUI.click(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_buttonCambiar'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioClases_inputFechaRetiroEst'), 
    5)

WebUI.setText(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioClases_inputFechaRetiroEst'), '14-02-2025')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_selectCursoDestino'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_selectCursoDestino'), 
    'primero basico t A', false)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_inputFechaMatriculaDestino'), 
    5)

WebUI.setText(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_inputFechaMatriculaDestino'), 
    '14-02-2025')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_checkConfirmo'), 
    5)

WebUI.check(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_checkConfirmo'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_buttonCambiarConfirmar'), 
    5)

WebUI.click(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_buttonCambiarConfirmar'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_buttonFinalizar'), 
    5)

WebUI.click(findTestObject('Page_libroDigital_matricula/libroDigital_matricula_cambioCurso_buttonFinalizar'))

WebUI.delay(10)

WebUI.closeBrowser()

