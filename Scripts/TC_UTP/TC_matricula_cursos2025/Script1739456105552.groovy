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

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_buttonLibroDiital'), 5)

WebUI.click(findTestObject('Page_matricula_cursos2025/libroDigital_buttonLibroDiital'))

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_buttonMatricula'), 5)

WebUI.click(findTestObject('Page_matricula_cursos2025/libroDigital_buttonMatricula'))

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_buttonCursos2025'), 
    5)

WebUI.click(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_buttonCursos2025'))

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_inputNombreCurso'), 
    5)

WebUI.setText(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_inputNombreCurso'), 'A')

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025selectNivel'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025selectNivel'), 'Nivel Medio Menor', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_selectLetraCurso'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_selectLetraCurso'), 
    'A', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_selectTipoEnseanza'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_selectTipoEnseanza'), 
    'Código: 10 Educación Parvularia', false)

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_inputCapasidadAlumnos'), 
    5)

WebUI.setText(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_inputCapasidadAlumnos'), '40')

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_buttonGuardar'), 
    5)

WebUI.click(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_buttonGuardar'))

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_buttonConfirmar'), 
    5)

WebUI.click(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_buttonConfirmar'))

WebUI.verifyElementPresent(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_buttonEliminar'), 
    5)

WebUI.click(findTestObject('Page_matricula_cursos2025/libroDigital_matricula_cursos2025_buttonEliminar'))

WebUI.acceptAlert()

WebUI.delay(15)

WebUI.closeBrowser()

