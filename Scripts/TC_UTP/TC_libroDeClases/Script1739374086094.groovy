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

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_menuLateral_buttonLibroDigital'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_menuLateral_buttonLibroDigital'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_menuLateral_buttonLibroClases'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_menuLateral_buttonLibroClases'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_selectNivel'), 5)

WebUI.selectOptionByLabel(findTestObject('page_libroDeClases/libroDigital_libroClases_selectNivel'), 'Tercero Básico', false)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_selectAnio'), 5)

WebUI.selectOptionByLabel(findTestObject('page_libroDeClases/libroDigital_libroClases_selectAnio'), '2024', false)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_buttonLibroClases'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_butonPortada'), 5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonPersonalizar'), 
    5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonIndice'), 5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonInfoCole'), 5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonLisEstud'), 5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonAnteFamiliar'), 
    5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonAnteAsignatura'), 
    5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonListAsistencia'), 
    5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonCalendarioActivi'), 
    5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonCalificacion'), 
    5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonPersonalidad'), 
    5)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonRegisObservaciones'), 
    5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonPersonalizar'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases__persoButttonColor'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases__persoButttonColor'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_persoButtonGuardarCol'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_persoButtonGuardarCol'))

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonIndice'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_indiceLabelContenido'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonInfoCole'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_inputNombrePres'), 5)

WebUI.setText(findTestObject('page_libroDeClases/libroDigital_libroClases_inputNombrePres'), 'prueba')

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_inputApellidoPres'), 5)

WebUI.setText(findTestObject('page_libroDeClases/libroDigital_libroClases_inputApellidoPres'), 'prueba')

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_inputNombreTeso'), 5)

WebUI.setText(findTestObject('page_libroDeClases/libroDigital_libroClases_inputNombreTeso'), 'prueba')

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_inputApellidoTeso'), 5)

WebUI.setText(findTestObject('page_libroDeClases/libroDigital_libroClases_inputApellidoTeso'), 'prueba')

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_inputNombreSecr'), 5)

WebUI.setText(findTestObject('page_libroDeClases/libroDigital_libroClases_inputNombreSecr'), 'prueba')

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_inputApellidoSecr'), 5)

WebUI.setText(findTestObject('page_libroDeClases/libroDigital_libroClases_inputApellidoSecr'), 'prueba')

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_labelIndiceAsignatura'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonLisEstud'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_labelIdentificacionAlumnos'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonAnteFamiliar'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_labelAntesedentesFamiliares'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonAnteAsignatura'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_labelAntesedentesAsignatura'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonListAsistencia'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_labelRegistroAsistencia'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonCalendarioActivi'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_selectAsignatura'), 5)

WebUI.selectOptionByLabel(findTestObject('page_libroDeClases/libroDigital_libroClases_selectAsignatura'), 'Lenguaje y Comunicación', 
    false)

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_inputFechaSeleccion'), 5)

WebUI.setText(findTestObject('page_libroDeClases/libroDigital_libroClases_inputFechaSeleccion'), '15-02-2025')

WebUI.delay(15)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonPersonalidad'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_labelCalificacionNotas'), 5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonPersonalidad'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_labelPlantillaRegistroPersonas'), 
    5)

WebUI.click(findTestObject('page_libroDeClases/libroDigital_libroClases_menuLateral_buttonRegisObservaciones'))

WebUI.verifyElementPresent(findTestObject('page_libroDeClases/libroDigital_libroClases_cuadroAlumno'), 5)

WebUI.delay(15)

WebUI.closeBrowser()

