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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication('com.kasirajaandroid')

Mobile.tap(findTestObject('KasirAja/Login Page/daftarLink'), 0)

Mobile.sendKeys(findTestObject('KasirAja/Registration Page/namaTokoReg'), 'Test')

Mobile.sendKeys(findTestObject('KasirAja/Registration Page/emailReg'), 'test@')

Mobile.sendKeys(findTestObject('KasirAja/Registration Page/passReg'), 'password12345')

Mobile.tap(findTestObject('KasirAja/Registration Page/daftarBtn'), 0)

Mobile.verifyElementVisible(findTestObject('KasirAja/Registration Page/Alert Group'), 0)

Mobile.verifyElementText(findTestObject('KasirAja/Registration Page/Alert'), '"email" harus menggunakan email yang valid', 
    FailureHandling.CONTINUE_ON_FAILURE)

//AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//
//driver.terminateApp('com.kasirajaandroid')

