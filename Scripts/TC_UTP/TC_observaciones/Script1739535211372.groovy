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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.callTestCase(findTestCase('TC_UTP/TC_loginUTP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_buttonLibroDigital'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_buttonLibroDigital'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonObservaciones'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonObservaciones'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonNuevaObservacion'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonNuevaObservacion'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_selectCurso                                                                                                                    Pre Kinder A'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_selectCurso                                                                                                                    Pre Kinder A'), 
    'primero basico t A', false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonAgregarTodos'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonAgregarTodos'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonQuitarTodos'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonQuitarTodos'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_labelalumno'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_labelalumno'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonagregar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonagregar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_labelAlumnoQuitar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observacion_labelAlumnoQuitar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonQuitar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonQuitar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_labelalumno'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_labelalumno'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonagregar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonagregar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_inputFechaObservacion'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_inputFechaObservacion'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_labelNumeroFecha'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_selectAsignatura'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_selectAsignatura'), 'Música', false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_selectTipoObservacion'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_selectTipoObservacion'), 'Neutra', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_selectProfesor'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_selectProfesor'), '(utp) Auto Qa', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/lobroDigital_observaciones_textDescripcion'), 5)

WebUI.setText(findTestObject('Page_observaciones/lobroDigital_observaciones_textDescripcion'), 'prueba prueba prueba prueba prueba prueba prueba prueba prueba prueba prueba prueba prueba prueba prueba ')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_buttonGuardar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observacion_buttonGuardar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_buttonEliminar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observacion_buttonEliminar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_buttonConfirmarEliminacion'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observacion_buttonConfirmarEliminacion'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonOkEliminacion'), 4)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonOkEliminacion'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_buttonNuevaIncidencia'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observacion_buttonNuevaIncidencia'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_inputNombreAlumno'), 5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_inputNombreAlumno'), 'prueba')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectCurso'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectCurso'), 'primero basico t A', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_inputFecha'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_inputFecha'))

// Encuentra el elemento
WebElement elemento = WebUI.findWebElement(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_inputFecha'))

// Remueve el readonly
WebUI.executeJavaScript('arguments[0].removeAttribute(\'readonly\')', Arrays.asList(elemento))

// Establece el valor
WebUI.setText(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_inputFecha'), '2024-02-17')

// Opcional: vuelve a establecer readonly si es necesario
WebUI.executeJavaScript('arguments[0].setAttribute(\'readonly\', \'readonly\')', Arrays.asList(elemento))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_inoutHora'), 5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_inoutHora'), '1010')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectCuando'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectCuando'), 'De camino a la escuela', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectDonde'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectDonde'), 'Autobús escolar', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_denunciante'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_denunciante'), 'Otro adulto', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectRolInvolucrado'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectRolInvolucrado'), 'Apoderado', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectRolIncidente'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectRolIncidente'), 'Victima', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectPersonaInvolucrada'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectPersonaInvolucrada'), 
    'Abel Mansilla - Apoderado', false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectRolEnLaComuna'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectRolEnLaComuna'), 'Docente', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonAgregarInci'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonAgregarInci'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_selectTipo'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_selectTipo'), 'Neutra', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInic_selectRelacionado'), 5, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_nueInic_selectRelacionado'), 'Neutro', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_inputDescripcion'), 5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_inputDescripcion'), 'prueba')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_inputDescripcionlarga'), 
    5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_inputDescripcionlarga'), 'prueba prueba')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectTipoIncidente'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectTipoIncidente'), 'Hurto', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectSeveridad'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectSeveridad'), 'Leve', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectTipoArma'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectTipoArma'), 'Otro', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectArmaUsada'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectArmaUsada'), 'Cuchillo', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_selectGravedadHeridas'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_selectGravedadHeridas'), 
    'Herida menor', false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectGravedadLesiones'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacion_nueInci_selectGravedadLesiones'), 
    'Lesión Menor', false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputArticuloProtocolo'), 
    5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputArticuloProtocolo'), '10')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputArticuloProtocolo2'), 
    5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputArticuloProtocolo2'), 'prueba')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputSeveridad'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputSeveridad'), 'Normal', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputProcedimiento'), 
    5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputProcedimiento'), 'PRUEBA')

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputProcedimiento (1)'), '10')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observacioenes_nueInci_inputProcedimiento (1)'), 
    5)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_buttonAadirArt'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_buttonAadirArt'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_labelProtocolo'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_labelProtocolo'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInici_buttonQuitarProtocolo'), 
    5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueInici_buttonQuitarProtocolo'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_textAcuerdoOmedidas'), 
    5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_textAcuerdoOmedidas'), 'prueba')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_buttonGuardar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueInci_buttonGuardar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_buttonIncidencias'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonIncidencias'))

WebUI.scrollToElement(findTestObject('Page_observaciones/libroDigital_observaciones_incidenciasButtonEliminar'), 0)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_incidenciasButtonEliminar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_incidenciasButtonEliminar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_incidenciasButtonEliminarConfirmar'), 
    5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_incidenciasButtonEliminarConfirmar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_incidenciasButtonOk'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_incidenciasButtonOk'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonNuevaEntrevista'), 
    5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonNuevaEntrevista'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_inputNombreReu'), 5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_inputNombreReu'), 'prueba')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_inputHoraReunion'), 5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_inputHoraReunion'), '1010')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectTipoEntrevista'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectTipoEntrevista'), 
    'Reunión con apoderados', false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectCursoReu'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectCursoReu'), 'primero basico t A', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectCursoEstud'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectCursoEstud'), 'primero basico t A', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectApodeCitado'), 5)

WebUI.selectOptionByValue(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectApodeCitado'), '3032768', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectRolComunidad'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectRolComunidad'), 'Tutor', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectEstudiante'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectEstudiante'), 'lala po', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectRolEntre'), 5)

WebUI.selectOptionByLabel(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_selectRolEntre'), 'Victima', 
    false)

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonAgregarApo'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonAgregarApo'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_labelApoSeleccionado'), 
    5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_labelApoSeleccionado'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonEliminarApo'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonEliminarApo'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonAgregarApo'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonAgregarApo'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_textDescripcion'), 5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_textDescripcion'), 'prueba')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_textAcuerdoMedida'), 5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_textAcuerdoMedida'), 'prueba')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_textRegistroDetallado'), 
    5)

WebUI.setText(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_textRegistroDetallado'), 'prueba')

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonGuardar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonGuardar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonOK'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonOK'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonEntrevistas'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_buttonObservaciones'))

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonEntrevistas'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonEliminarEntrevistas'), 
    5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonEliminarEntrevistas'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonConfirmarEliminar'), 
    5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonConfirmarEliminar'))

WebUI.verifyElementPresent(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonOKEliminar'), 5)

WebUI.click(findTestObject('Page_observaciones/libroDigital_observaciones_nueEntre_buttonOKEliminar'))

WebUI.delay(23)

WebUI.closeBrowser()

