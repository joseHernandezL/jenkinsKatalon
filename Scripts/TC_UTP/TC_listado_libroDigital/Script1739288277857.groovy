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

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_selectAnio                                                                                                                                                                           2025'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_listado/libroDigital_listado_selectAnio                                                                                                                                                                           2025'), 
    '2025', false)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_selectCurso'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_listado/libroDigital_listado_selectCurso'), 'Sexto Básico A', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_inputBuscar'), 5)

WebUI.setText(findTestObject('Page_libroDigital_listado/libroDigital_listado_inputBuscar'), 'Alfred')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'), 5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

def verificador = false

while (!(verificador)) {
    WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

    WebUI.delay(5)

    verificador = WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBitacora'), 
        5, FailureHandling.OPTIONAL)

    println(verificador)
}

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonObservaciones'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonNotas'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonCodigoBarra'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBitacora'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonAsistencia'), 5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonVer'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelRut'), 5)

rut = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelRut'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelNombre'), 5)

nombre = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelNombre'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelApellido'), 5)

apellido = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelApellido'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelFechaNac'), 5)

fechaNac = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelFechaNac'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelEmailAlumno'), 5)

correo = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelEmailAlumno'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelDireccion'), 5)

direccion = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelDireccion'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelPIE'), 5)

PIE = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelPIE'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelPrioritario'), 5)

prioritario = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelPrioritario'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_preferente'), 5)

preferente = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_preferente'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelNEE'), 5)

NEE = WebUI.getAttribute(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelNEE'), 'value')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelMedicamento'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelEnfermedad'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelOtroMedicamento'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelEmergenciaRemitir'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelAlergias'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelOtrasAlergias'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_OlabelbMedicas'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelFonoEmergencia'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelGrupoSangeneo'), 5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonRegresarVer'))

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_listado/libroDigital_listado_selectCurso'), 'Sexto Básico A', 
    false)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

def verificador2 = false

while (!(verificador2)) {
    WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

    WebUI.delay(5)

    verificador2 = WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBitacora'), 
        5, FailureHandling.OPTIONAL)

    println(verificador2)
}

WebUI.delay(10)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBitacora'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBitacoraNuevaBitacora'), 
    5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBitacoraNuevaBitacora'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_selectTipoBitacora'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_listado/libroDigital_listado_selectTipoBitacora'), '                -- Webclass Presentación Suite -- Anamnesis            ', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_inputDescripcion'), 5)

WebUI.setText(findTestObject('Page_libroDigital_listado/libroDigital_listado_inputDescripcion'), 'Anamnesis')

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonGuardarBitacora'), 5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonGuardarBitacora'))

WebUI.waitForAlert(10)

WebUI.dismissAlert()

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_cuttonVer'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonEliminar'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonEditar'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonDestacar'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonBloquear'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonAprobacion'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonAdjuntar'), 5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_cuttonVer'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_Label'), 5)

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonCerrar'), 5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonCerrar'))

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonEditar'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonRegresar'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonEliminar'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacoraRegresarListado'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacoraRegresarListado'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacoraRegresarListado'))

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_listado/libroDigital_listado_selectCurso'), 'Sexto Básico A', 
    false)

WebUI.setText(findTestObject('Page_libroDigital_listado/libroDigital_listado_inputBuscar'), 'Alfred')

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

def verificador3 = false

while (!(verificador3)) {
    WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

    WebUI.delay(5)

    verificador3 = WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBitacora'), 
        5, FailureHandling.OPTIONAL)

    println(verificador3)
}

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonCodigoBarra'))

WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_labelCodigo'), 5)

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonCerrarCodigo'))

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonNotas'))

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacora_buttonRegresar'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Page_libroDigital_listado/libroDigital_listado_selectCurso'), 'Sexto Básico A', 
    false)

WebUI.setText(findTestObject('Page_libroDigital_listado/libroDigital_listado_inputBuscar'), 'Alfred')

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

def verificador4 = false

while (!(verificador4)) {
    WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBuscar'))

    WebUI.delay(5)

    verificador4 = WebUI.verifyElementPresent(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonBitacora'), 
        5, FailureHandling.OPTIONAL)

    println(verificador4)
}

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_buttonObservaciones'))

WebUI.click(findTestObject('Page_libroDigital_listado/libroDigital_listado_bitacoraRegresarListado'))

WebUI.closeBrowser()

WebUI.delay(5)

