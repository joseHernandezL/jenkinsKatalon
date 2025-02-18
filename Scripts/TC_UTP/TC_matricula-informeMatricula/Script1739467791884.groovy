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

WebUI.callTestCase(findTestCase('TC_UTP/TC_loginUTP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_buttonLibroDigital'), 5)

WebUI.click(findTestObject('Page_matricula_informeMatricula/libroDigital_buttonLibroDigital'))

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_buttonMatricula'), 5)

WebUI.click(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_buttonMatricula'))

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_buttonInfoMatricula'), 
    5)

WebUI.click(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_buttonInfoMatricula'))

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectAnio'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectAnio'), 
    '2025', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectCurso'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectCurso'), 
    'primero basico t A', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectConsiderarRetirados'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectConsiderarRetirados'), 
    'Si', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectAnio'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectCiclo'), 
    'Básica', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectOrdenarPor'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectOrdenarPor'), 
    'Apellidos', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectenseanza'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectenseanza'), 
    'Código: 110- Enseñanza Básica', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectnivel'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectnivel'), 
    'Primero Básico', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectDeManera'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectDeManera'), 
    'Descendente', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectCalidad'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_selectCalidad'), 
    'Prioritario', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_informeMatricula/libroDigital_matricula_informeMatricula_labelAlumno'), 
    5)

WebUI.delay(20)

WebUI.closeBrowser()

