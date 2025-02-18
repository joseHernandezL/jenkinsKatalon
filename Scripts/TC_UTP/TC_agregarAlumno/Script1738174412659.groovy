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

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/lateral_labelLibroDigital'), 5)

WebUI.click(findTestObject('Page_menuLateral/lateral_labelLibroDigital'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/lateral_lDigital_labelMatricula'), 5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/lateral_lDigital_labelMatricula'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/matricula_buttonAgregarAlumno'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/matricula_buttonAgregarAlumno'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonPasaporte'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonRut'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inoutRut'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inoutRut'), 
    '241734994')

def rut = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inoutRut'), 
    'value')

println(rut)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombre'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombre'), 
    'PRUEBAS')

def nombre = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombre'), 
    'value')

println(nombre)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAPaterno'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAPaterno'), 
    'PRUEBA')

apellido = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAPaterno'), 
    'value')

println(apellido)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAMaterno'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAMaterno'), 
    'PRUEBA')

apellidom = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAMaterno'), 
    'value')

println(apellidom)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaN'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaN'), 
    '25/11/2019')

fechaNa = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaN'), 
    'value')

println(fechaNa)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAMaterno'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonMasculino'), 
    5)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonFemenino'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonFemenino'))

radioSexo = WebUI.verifyElementChecked(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonFemenino'), 
    5)

println(radioSexo)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioButtonMasculino'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidad                                                                                                                                                                                          Extranjera'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidad                                                                                                                                                                                          Extranjera'), 
    'Alemana', false)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidad                                                                                                                                                                                          Extranjera'), 
    'Chilena', false)

nacionalidad = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidad                                                                                                                                                                                          Extranjera'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println('La nacionalidad seleccionada es: ' + nacionalidad)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCivil                                                                                                                                       Casado(a)'), 
    5)

WebUI.selectOptionByValue(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCivil                                                                                                                                       Casado(a)'), 
    '3', false)

estadoCivil = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCivil                                                                                                                                       Casado(a)'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println('' + estadoCivil)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCivil                                                                                                                                       Casado(a)'), 
    '1', false)

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputReligion'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkReligion'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkReligion'))

religionCheck = WebUI.verifyElementChecked(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkReligion'), 
    5)

println(religionCheck)

WebUI.verifyElementVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputReligion'))

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputReligion'), 
    'NA')

religion = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputReligion'), 
    'value')

println(religion)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccion'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccion'), 
    'PRUEBA')

direccion = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccion'), 
    'value')

println(direccion)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegion                                                                                                                                          Tarapac'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegion                                                                                                                                          Tarapac'), 
    'Coquimbo', false)

region = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegion                                                                                                                                          Tarapac'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(region)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComuna'), 
    5)

WebUI.selectOptionByValue(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComuna'), 
    '4202', false)

comuna = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComuna'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(comuna)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCoPostal'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCoPostal'), 
    '1570035')

codigoPost = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCoPostal'), 
    'value')

println(codigoPost)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectFax                                                                                              Numero principal'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectFax                                                                                              Numero principal'), 
    'Otro', false)

fax = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectFax                                                                                              Numero principal'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(fax)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefono'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefono'), 
    '123456789')

telefono = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefono'), 
    'value')

println(telefono)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTeleCasa'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTeleCasa'), 
    '123456789')

telCasa = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTeleCasa'), 
    'value')

println(telCasa)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoCorreo                                                                                Trabajo                                                                                                 Orga'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoCorreo                                                                                Trabajo                                                                                                 Orga'), 
    'Trabajo', false)

tipoCorreo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoCorreo                                                                                Trabajo                                                                                                 Orga'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(tipoCorreo)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreo'), 
    'Prueba@prueba.cl')

correo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreo'), 
    'value')

println(correo)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarCorreo'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarCorreo'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoContacto'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoContacto'), 
    'Correo', false)

tipoCorreo2 = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectTipoContacto'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(correo)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputContactoNuevo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputContactoNuevo'), 
    'prueba@prueba.cl')

correo2 = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputContactoNuevo'), 
    'value')

println(correo2)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEnCasoEmergencia                                                                                                                                    Clnica'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEnCasoEmergencia                                                                                                                                    Clnica'), 
    'Posta', false)

emergenciaLlamar = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEnCasoEmergencia                                                                                                                                    Clnica'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(emergenciaLlamar)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputEnfermedad'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputEnfermedad'), 
    'riñon')

enfermedad = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputEnfermedad'), 
    'value')

println(enfermedad)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAlergia'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAlergia'), 
    'mani')

alergia = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAlergia'), 
    'value')

println(alergia)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSangre'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSangre'), 
    'b+')

sangre = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSangre'), 
    'value')

println(sangre)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSisSalud'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSisSalud'), 
    'fonasa')

previcion = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSisSalud'), 
    'value')

println(previcion)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNMatricula'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNMatricula'), 
    '1234')

numMatricula = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNMatricula'), 
    'value')

println(numMatricula)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaMatricula'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaMatricula'), 
    '30/01/2025')

fechaMatricula = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaMatricula'), 
    'value')

println(fechaMatricula)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaIncorporacion'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaIncorporacion'), 
    '30/01/2025')

fechaIncor = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaIncorporacion'), 
    'value')

println(fechaIncor)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAnioIngreso'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAnioIngreso'), 
    '2025')

anioIngreso = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputAnioIngreso'), 
    'value')

println(anioIngreso)

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPIE                                                                                                                    Sndrome de Down'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarPIE'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_NoEspe'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_permanente'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_transitorio'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPIE'), 
    5)

WebUI.scrollToElement(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputSisSalud'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputColegioProcedencia'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPIE'))

checkPie = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPIE'), 
    'value')

println(checkPie)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPIE                                                                                                                    Sndrome de Down'), 
    'Discapacidad Visual', false)

selectPie = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPIE                                                                                                                    Sndrome de Down'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(selectPie)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarPIE'))

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_select2PIE                                                                                                                Sndrome de Down'), 
    'Disfasia', false)

selectPie2 = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_select2PIE                                                                                                                Sndrome de Down'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(selectPie2)

WebUI.delay(5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonQuitarPie'))

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_transitorio'))

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_permanente'))

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_NoEspe'))

radioPieNoEsp = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioDuracionPIE_NoEspe'), 
    'value')

println(radioPieNoEsp)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkGrupDiferido'), 
    5)

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectGrupDiferido                                                                                                      Sin diagnstico PIE'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkGrupDiferido'))

checkGDiferido = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkGrupDiferido'), 
    'value')

println(checkGDiferido)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectGrupDiferido                                                                                                      Sin diagnstico PIE'), 
    5, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectGrupDiferido                                                                                                      Sin diagnstico PIE'), 
    'Disfasia', false)

selectGrupDiferido = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectGrupDiferido                                                                                                      Sin diagnstico PIE'), 
    'Disfasia', FailureHandling.STOP_ON_FAILURE)

println(selectGrupDiferido)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNivel                                                                                                                                            Nivel Medio Menor'), 
    5, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNivel                                                                                                                                            Nivel Medio Menor'), 
    'Primero Básico', false)

selectNivel = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNivel                                                                                                                                            Nivel Medio Menor'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(selectNivel)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCurso'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCurso'), 
    'Primero Básico B', false)

selectCurso = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectCurso'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(selectCurso)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputColegioProcedencia'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputColegioProcedencia'), 
    'PRUEBA')

colegioProcedencia = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputColegioProcedencia'), 
    'value')

println(colegioProcedencia)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectOrigenIndigena                                                                                               Aymara'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectOrigenIndigena                                                                                               Aymara'), 
    'Mapuche', false)

oriIndigena = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectOrigenIndigena                                                                                               Aymara'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(oriIndigena)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'))

checkPrioritario = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'), 
    'value')

println(checkPrioritario)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputPreferente'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputPreferente'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputPreferente'))

inpPreferente = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputPreferente'), 
    'value')

println(inpPreferente)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkVulnerable'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkVulnerable'))

vulnerable = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkVulnerable'), 
    'value')

println(vulnerable)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkAlta'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkAlta'))

alta = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkAlta'), 
    'value')

println(alta)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkBecaIndigena'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkBecaIndigena'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkBecaIndigena'))

becaIndigena = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkBecaIndigena'), 
    'value')

println(becaIndigena)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPDLR'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPDLR'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPDLR'))

PDRL = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPDLR'), 
    'value')

println(PDRL)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPrioritario'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkotrosBen'), 
    5)

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPAE'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_check3Colacion'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkUtilesEscolares'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkotrosBen'))

otroBen = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkotrosBen'), 
    'value')

println(otroBen)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPAE'))

PAE = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPAE'), 
    'value')

println(PAE)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkUtilesEscolares'))

utilEscolar = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkUtilesEscolares'), 
    'value')

println(utilEscolar)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkPAE'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputBecaOtra'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputBecaOtra'), 
    'Prueba')

otraBeca = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputBecaOtra'), 
    'value')

println(otraBeca)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitente'), 
    5)

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Medio'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Medio'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Medio'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Medio'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite5Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite6Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite7Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite8Basico'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepiteKinder'))

WebUI.verifyElementNotVisible(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitePreKin'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitente'))

repitente = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitente'), 
    'value')

println(repitente)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Basico'))

rep1Basico = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Basico'), 
    'value')

println(rep1Basico)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Medio'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Medio'))

rep1Medio = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite1Medio'), 
    'value')

println(rep1Medio)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Basico'))

rep2Basico = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Basico'), 
    'value')

println(rep2Basico)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Medio'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Medio'))

rep2Medio = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite2Medio'), 
    'value')

println(rep2Medio)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Basico'))

rep3Basico = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Basico'), 
    'value')

println(rep3Basico)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Medio'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Medio'))

rep3Medio = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite3Medio'), 
    'value')

println(rep3Medio)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Basico'))

rep4Basico = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Basico'), 
    'value')

println(rep4Basico)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Medio'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Medio'))

rep4Medio = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite4Medio'), 
    'value')

println(rep4Medio)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite5Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite5Basico'))

rep5Basico = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite5Basico'), 
    'value')

println(rep5Basico)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite6Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite6Basico'))

rep6Basico = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite6Basico'), 
    'value')

println(rep6Basico)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite7Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite7Basico'))

rep7Basico = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite7Basico'), 
    'value')

println(rep7Basico)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite8Basico'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite8Basico'))

rep8Basico = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepite8Basico'), 
    'value')

println(rep8Basico)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepiteKinder'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepiteKinder'))

repKin = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepiteKinder'), 
    'value')

println(repKin)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitePreKin'))

repPreKin = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkRepitePreKin'), 
    'value')

println(repPreKin)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkTextoMineduc'), 
    5)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkTextoMineduc'))

textoMine = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkTextoMineduc'), 
    'value')

println(textoMine)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectViveCon                                                                                   Padres                                                                                     Pap'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectViveCon                                                                                   Padres                                                                                     Pap'), 
    'Padres', false)

viveCon = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectViveCon                                                                                   Padres                                                                                     Pap'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(viveCon)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNPersonasFamilia'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNPersonasFamilia'), 
    '2')

personasFamilia = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNPersonasFamilia'), 
    'value')

println(personasFamilia)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNLugarHermano'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNLugarHermano'), 
    '1')

numLugarHermano = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNLugarHermano'), 
    'value')

println(numLugarHermano)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNhermanosColegio'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNhermanosColegio'), 
    '0')

numHermanosEnColegio = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNhermanosColegio'), 
    'value')

println(numLugarHermano)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputIndiqueOtros'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputIndiqueOtros'), 
    'PRUEBA')

indiqueOtros = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputIndiqueOtros'), 
    'value')

println(indiqueOtros)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNumeroHermanos'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNumeroHermanos'), 
    'PRUEBA')

numHermanos = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNumeroHermanos'), 
    'value')

println(numHermanos)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNHermanosEdadEscolar'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNHermanosEdadEscolar'), 
    'PRUEBA')

hermanosEdadEscolar = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNHermanosEdadEscolar'), 
    'value')

println(hermanosEdadEscolar)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPertenece                                                               Programa Puente                                                                            Chile Solidario'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPertenece                                                               Programa Puente                                                                            Chile Solidario'), 
    'Chile Solidario', false)

selectPertenece = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectPertenece                                                               Programa Puente                                                                            Chile Solidario'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(selectPertenece)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarApoderado'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarApoderado'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombreApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombreApoderado'), 
    'PUEBA')

nomApoderado = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputNombreApoderado'), 
    'value')

println(nomApoderado)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoPApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoPApoderado'), 
    'PRUEBA')

apeApoderado = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoPApoderado'), 
    'value')

println(apeApoderado)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoMApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoMApoderado'), 
    'PRUEBA')

apeMApoderado = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputApellidoMApoderado'), 
    'value')

println(apeMApoderado)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaNacimientoApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaNacimientoApo'), 
    '10-10-1991')

fechNacApoderado = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputFechaNacimientoApo'), 
    'value')

println(fechNacApoderado)

WebUI.verifyElementClickable(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarFoto'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectDocumentoApoderado'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectDocumentoApoderado'), 
    'RUN', false)

documentoApoderado = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectDocumentoApoderado'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println(documentoApoderado)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputRutApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputRutApoderado'), 
    '1130026-K')

rutApod = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputRutApoderado'), 
    'value')

println(rutApod)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioMasculinoApoderado'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioMasculinoApoderado'))

RADIOmASCULINO = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_radioMasculinoApoderado'), 
    'VALUE')

println(RADIOmASCULINO)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEstadoCivilApo                                                                   Casado(a)                                                                                Separado(a)'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEstadoCivilApo                                                                   Casado(a)                                                                                Separado(a)'), 
    'Casado(a)', false)

estadoCivilApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEstadoCivilApo                                                                   Casado(a)                                                                                Separado(a)'), 
    'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectParentescoApoderado'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectParentescoApoderado'), 
    'Madre', false)

parentescoApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectParentescoApoderado'), 
    'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidadApo                                                                                                            Extranjera'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidadApo                                                                                                            Extranjera'), 
    'Chilena', false)

nacionalidadApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectNacionalidadApo                                                                                                            Extranjera'), 
    'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccionApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccionApo'), 
    'Prueba')

direccionApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputDireccionApo'), 
    'value')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegionApo'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegionApo'), 
    'Coquimbo', false)

regionApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectRegionApo'), 
    'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComunaApo'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComunaApo'), 
    'Canela', false)

comunaApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectComunaApo'), 
    'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_codigoPostalApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_codigoPostalApo'), 
    '1570035', FailureHandling.STOP_ON_FAILURE)

codigoPostalApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_codigoPostalApo'), 
    'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreoApoderado'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreoApoderado'), 
    'prueba@prueba.cl')

correoApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCorreoApoderado'), 
    'value')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCelularApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCelularApo'), 
    '123456789')

celularApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputCelularApo'), 
    'value')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefonoApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefonoApo'), 
    '123456789')

telefonoApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputTelefonoApo'), 
    'value')

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEscolaridadApo                                                                                                                                                             Sin escolaridad'), 
    5)

WebUI.selectOptionByLabel(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEscolaridadApo                                                                                                                                                             Sin escolaridad'), 
    'Sin escolaridad', false)

escolaridadApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_selectEscolaridadApo                                                                                                                                                             Sin escolaridad'), 
    'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputOcupacionApo'), 
    5)

WebUI.setText(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputOcupacionApo'), 
    'NA')

ocupacionApo = WebUI.getAttribute(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_inputOcupacionApo'), 
    'value')

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkCargaSaludApo'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkCargaSaludApo'))

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkApoFinanciero'))

WebUI.uncheck(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkApoFinanciero'))

WebUI.delay(10)

WebUI.check(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_checkApoTitular'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarApo'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonAgregarApo'))

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonConfirmarMatricula'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonConfirmarMatricula'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonCancelarImprecion'), 
    5)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonCancelarImprecion'))

WebUI.delay(50)

WebUI.click(findTestObject('Page_menuLateral/page_libroDigital/Page_libroDigital_Matrcula/Page_agregarAlumno/matricula_buttonCancelarImprecion'))

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_inputBuscar'), 5)

WebUI.setText(findTestObject('page_MatriculaVer/matricula_inputBuscar'), 'prueba')

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_inputVer'), 5)

WebUI.click(findTestObject('page_MatriculaVer/matricula_inputVer'))

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputRut'), 5)

rut2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputRut'), 'value')

if (rut != rut2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputNombre'), 5)

nombre2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputNombre'), 'value')

if (nombre != nombre2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputApellidoPat'), 5)

apellidoP2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputApellidoPat'), 'value')

if (apellido != apellidoP2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputApellidoMat'), 5)

apellidoM2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputApellidoMat'), 'value')

if (apellidom != apellidoM2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputFechaNacimiento'), 5)

fechaNac2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputFechaNacimiento'), 'value')

if (fechaNa != fechaNac2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_radioSexo'), 5)

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_selectNacionalidad                                                                                                                                                                                   Extranjera'), 
    5)

nacionalidad2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matricula_selectNacionalidad                                                                                                                                                                                   Extranjera'), 
    'value')

if (nacionalidad != nacionalidad2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_selectEstadoCivil'), 5)

estadoCivil2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matricula_selectEstadoCivil'), 'value')

println('--------------')

println(estadoCivil2)

println(estadoCivil)

if (estadoCivil != estadoCivil2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_checkReligion'), 5)

checkReligion2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matricula_checkReligion'), 'value')

if (religionCheck != checkReligion2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_inputReligion'), 5)

religion2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matricula_inputReligion'), 'value')

if (religion != religion2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_inputdireccion'), 5)

direccion2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matricula_inputdireccion'), 'value')

if (direccion != direccion2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectRegion                                                                                                                                               Tarapac'), 
    5)

region2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectRegion                                                                                                                                               Tarapac'), 
    'value')

if (region != region2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_selectComuna'), 5)

comuna2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matricula_selectComuna'), 'value')

if (comuna2 != comuna) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputCodigoPostal'), 5)

codigoPostal2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputCodigoPostal'), 'value')

if (codigoPost != codigoPostal2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matricula_selectTipoTelefono'), 5)

tipoTelefono2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matricula_selectTipoTelefono'), 'value')

if (fax != tipoTelefono2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputTelefono'), 5)

telefono2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputTelefono'), 'value')

if (telefono != telefono2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputTelefono2'), 5)

telefono22 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputTelefono2'), 'value')

if (telCasa != telefono22) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectTipoCorreo'), 5)

tipoCorre22 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectTipoCorreo'), 'value')

if (tipoCorreo != tipoCorre22) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputCorreo'), 5)

correo22 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputCorreo'), 'value')

if (correo != correo22) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/mstriculaVer_selectEmergencia'), 5)

emergenciaLlamar2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/mstriculaVer_selectEmergencia'), 'value')

if (emergenciaLlamar != emergenciaLlamar2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputEnfermedad'), 5)

enfermedad2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputEnfermedad'), 'value')

if (enfermedad != enfermedad2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputAlergia'), 5)

alergia2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputAlergia'), 'value')

if (alergia2 != alergia) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputSangre'), 5)

sangre2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputSangre'), 'value')

if (sangre != sangre2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputPrevicion'), 5)

previcion2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputPrevicion'), 'value')

if (previcion != previcion2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_numMatricula'), 5)

numMatricula2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_numMatricula'), 'value')

if (numMatricula != numMatricula2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputFechaMatricula'), 5)

fechaMatricula2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputFechaMatricula'), 'value')

if (fechaMatricula != fechaMatricula2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputFechaIncorporacion'), 5)

fechaIncor2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputFechaIncorporacion'), 'value')

if (fechaIncor2 != fechaIncor) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputAnioIngreso'), 5)

anioIncor2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputAnioIngreso'), 'value')

if (anioIngreso != anioIncor2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkPIE'), 5)

checkPie2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkPIE'), 'value')

if (checkPie2 != checkPie) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectPie'), 5)

selectPie2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectPie'), 'value')

if (selectPie2 != selectPie) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_radioNoEspecificado'), 5)

noEspecificado2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_radioNoEspecificado'), 'value')

if (noEspecificado2 != radioPieNoEsp) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectDiagnosticoGrupoDiferencial                                                                                                     Sin diagnstico PIE'), 
    5)

diagnosticoGrupDife2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectDiagnosticoGrupoDiferencial                                                                                                     Sin diagnstico PIE'), 
    'value')

if (diagnosticoGrupDife2 != selectGrupDiferido) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selctNivel'), 5)

selectNivel2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selctNivel'), 'value')

if (selectNivel2 != selectNivel) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectCurso'), 5)

selectCurso2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectCurso'), 'value')

if (selectCurso2 != selectCurso) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputColegioProcede'), 5)

colegioProcede = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputColegioProcede'), 'value')

if (colegioProcede != colegioProcedencia) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectOrigenIndigena'), 5)

origenIndi = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectOrigenIndigena'), 'value')

if (origenIndi != oriIndigena) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check_prioritario'), 5)

checkPrioritario2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check_prioritario'), 'value')

if (checkPrioritario != checkPrioritario2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkPreferente'), 5)

checkPreferente2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkPreferente'), 'value')

if (inpPreferente != checkPreferente2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkVulnerable'), 5)

checkVulnerable2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkVulnerable'), 'value')

if (vulnerable != checkVulnerable2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkAlta'), 5)

checkAlta2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkAlta'), 'value')

if (alta != checkAlta2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkbecaIndigena'), 5)

checkBecaIndigena2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkbecaIndigena'), 'value')

if (becaIndigena != checkBecaIndigena2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkbecaPDR'), 5)

checkPDR2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkbecaPDR'), 'value')

if (PDRL != checkPDR2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkOtrosBeneficios'), 5)

checkOtroBen2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkOtrosBeneficios'), 'value')

if (otroBen != checkOtroBen2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkPAE'), 5)

checkPAE2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkPAE'), 'value')

if (PAE != checkPAE2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkUtilesEscolares'), 5)

checkUtilesEsco2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkUtilesEscolares'), 'value')

if (utilEscolar != checkUtilesEsco2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputOtraBeca'), 5)

inputOtroBen2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputOtraBeca'), 'value')

if (otraBeca != inputOtroBen2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkRepitente'), 5)

repitente2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkRepitente'), 'value')

if (repitente != repitente2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkMineduc'), 5)

mineduc2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkMineduc'), 'value')

if (textoMine != mineduc2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkPreKinder'), 5)

preKinder2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkPreKinder'), 'value')

if (repPreKin != preKinder2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_checkKinder'), 5)

kinder2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_checkKinder'), 'value')

if (repKin != kinder2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check1B'), 5)

r1B2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check1B'), 'value')

if (rep1Basico != r1B2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check2B'), 5)

r2B2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check2B'), 'value')

if (rep2Basico != r2B2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check3B'), 5)

r3B2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check3B'), 'value')

if (rep3Basico != r3B2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check4B'), 5)

r4B2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check4B'), 'value')

if (rep4Basico != r4B2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check5B'), 5)

r5B2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check5B'), 'value')

if (rep5Basico != r5B2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check6B'), 5)

r6B2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check6B'), 'value')

if (rep6Basico != r6B2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check7B'), 5)

r7B2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check7B'), 'value')

if (rep7Basico != r7B2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check8B'), 5)

r8B2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check8B'), 'value')

if (rep8Basico != r8B2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check1M'), 5)

r1M2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check1M'), 'value')

if (rep1Medio != r1M2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check2M'), 5)

r2M2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check2M'), 'value')

if (rep2Medio != r2M2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check3M'), 5)

r3M2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check3M'), 'value')

if (rep3Medio != r3M2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_check4M'), 5)

r4M2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_check4M'), 'value')

if (rep4Medio != r4M2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectViveCon'), 5)

viveCon2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectViveCon'), 'value')

if (viveCon != viveCon2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputNumPersonasGrupoFami'), 5)

perGrupoFamiliar2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputNumPersonasGrupoFami'), 'value')

if (personasFamilia != perGrupoFamiliar2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputNumLugarEntreHermanos'), 5)

lugarEntreHermanos2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputNumLugarEntreHermanos'), 'value')

if (numLugarHermano != lugarEntreHermanos2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputNumHermanosEnCole'), 5)

numHermanosCole2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputNumHermanosEnCole'), 'value')

if (numHermanosEnColegio != numHermanosCole2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputIndiqueOtro'), 5)

indiqueOtro2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputIndiqueOtro'), 'value')

if (indiqueOtros != indiqueOtro2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputNumHermanos'), 5)

numHermanos2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputNumHermanos'), 'value')

if (numHermanos2 != numHermanos) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputNumHermanosEdadEscolar'), 5)

numHermanosEscolar2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputNumHermanosEdadEscolar'), 'value')

if (numHermanosEscolar2 != hermanosEdadEscolar) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectPerteneceA'), 5)

perteneceA2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectPerteneceA'), 'value')

if (selectPertenece != perteneceA2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_buttonEditarApoderado'), 5)

WebUI.click(findTestObject('page_MatriculaVer/matriculaVer_buttonEditarApoderado'))

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputNombreApo'), 5)

nombreApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputNombreApo'), 'value')

if (nomApoderado != nombreApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputApellidoApo'), 5)

apellidoApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputApellidoApo'), 'value')

if (apeApoderado != apellidoApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputApellidoMaApo'), 5)

apellidoMApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputApellidoMaApo'), 'value')

if (apeMApoderado != apellidoMApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputFechaNacApo'), 5)

fechaNacApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputFechaNacApo'), 'value')

if (fechNacApoderado != fechaNacApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectTipoDocApo'), 5)

tipoDocApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectTipoDocApo'), 'value')

if (documentoApoderado != tipoDocApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputRutApo'), 5)

rutApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputRutApo'), 'value')

if (rutApod != rutApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectEstadoCivil'), 5)

estadoCivilApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectEstadoCivil'), 'value')

if (estadoCivilApo != estadoCivilApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectParentescoApo'), 5)

parentescoApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectParentescoApo'), 'value')

if (parentescoApo != parentescoApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectNacionalidadApo'), 5)

nacionalidadApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectNacionalidadApo'), 'value')

if (nacionalidadApo != nacionalidadApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputDireccionApo2'), 5)

direccionApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputDireccionApo2'), 'value')

if (direccionApo != direccionApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectRegionApo2'), 5)

regionApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectRegionApo2'), 'value')

if (regionApo != regionApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectComunaApo2'), 5)

comunaApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectComunaApo2'), 'value')

if (comunaApo != comunaApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputCodigoPostalApo2'), 5)

codigoPostalApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputCodigoPostalApo2'), 'value')

if (codigoPostalApo != codigoPostalApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputCorreoApo2'), 5)

correoApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputCorreoApo2'), 'value')

if (correoApo != correoApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputCelularApo2'), 5)

celularApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputCelularApo2'), 'value')

if (celularApo != celularApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputTelefonoApo2'), 5)

telefonoApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputTelefonoApo2'), 'value')

if (telefonoApo != telefonoApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_selectEscolaridadApo2                                                                                           Sin escolaridad'), 
    5)

escolaridadApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_selectEscolaridadApo2                                                                                           Sin escolaridad'), 
    'value')

if (escolaridadApo != escolaridadApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_inputOcupacionApo2'), 5)

ocupacionApo2 = WebUI.getAttribute(findTestObject('page_MatriculaVer/matriculaVer_inputOcupacionApo2'), 'value')

if (ocupacionApo != ocupacionApo2) {
    WebUI.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE, mensajeError)
}

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_buttonVolverApo'), 5)

WebUI.click(findTestObject('page_MatriculaVer/matriculaVer_buttonVolverApo'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('page_MatriculaVer/matriculaVer_buttonVolver'), 5)

WebUI.click(findTestObject('page_MatriculaVer/matriculaVer_buttonVolver'))

WebUI.delay(10)

