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

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/menuLateral_libroDigital'), 5)

WebUI.click(findTestObject('Page_libroDigital_notas/menuLateral_libroDigital'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/subMenu_libroDigital_notas'), 5)

WebUI.click(findTestObject('Page_libroDigital_notas/subMenu_libroDigital_notas'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_selectAnio                                                                                                                    2025'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_notas/libroDigital_notas_selectAnio                                                                                                                    2025'), 
    '2025', false)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_selectCurso'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_notas/libroDigital_notas_selectCurso'), 'primero basico t A', 
    false)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_selectAsignatura'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_notas/libroDigital_notas_selectAsignatura'), 'Lenguaje y Comunicación', 
    false)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_selectPeriodo'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_notas/libroDigital_notas_selectPeriodo'), '1er Semestre', false)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota1al1'), 5)

WebUI.doubleClick(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota1al1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota1al1'), '4')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota1al2'), 5)

WebUI.doubleClick(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota1al2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota1al2'), '5')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota2al1'), 5)

WebUI.doubleClick(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota2al1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota2al1'), '7')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota2al2'), 5)

WebUI.doubleClick(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota2al2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota2al2'), '65')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_ponderacionAl1'), 5)

WebUI.doubleClick(findTestObject('Page_libroDigital_notas/libroDigital_notas_ponderacionAl1'), FailureHandling.STOP_ON_FAILURE)

notaP1 = WebUI.getAttribute(findTestObject('Page_libroDigital_notas/libroDigital_notas_ponderacionAl1'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_notas/libroDigital_notas_ponderacionAl2'), 5)

notaP2 = WebUI.getAttribute(findTestObject('Page_libroDigital_notas/libroDigital_notas_ponderacionAl2'), 'value')

WebUI.clearText(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota1al1'))

WebUI.clearText(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota1al2'))

WebUI.clearText(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota2al1'))

WebUI.clearText(findTestObject('Page_libroDigital_notas/libroDigital_notas_nota2al2'))

WebUI.click(findTestObject('Page_libroDigital_notas/libroDigital_notas_ponderacionAl1'))

WebUI.delay(5)

if ((notaP1 == 'B') && (notaP2 == 'B')) {
    WebUI.closeBrowser()
} else {
    println((('las notas no coinciden nota1: ' + notaP1) + ' nota2: ') + notaP2)

    WebUI.closeBrowser()

    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.delay(5)

