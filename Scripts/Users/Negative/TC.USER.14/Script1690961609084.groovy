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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

Mobile.startExistingApplication('com.kasirajaandroid')

Mobile.sendKeys(findTestObject('KasirAja/Login Page/emailLogin'), 'sampurasun@example.com')

Mobile.sendKeys(findTestObject('KasirAja/Login Page/passLogin'), 'rampes123456')

Mobile.tap(findTestObject('KasirAja/Login Page/loginBtn'), 0)

Mobile.verifyElementVisible(findTestObject('KasirAja/Kasir/Nav Title'), 0)

Mobile.verifyElementText(findTestObject('KasirAja/Kasir/Nav Title'), 'kasirAja')

Mobile.tap(findTestObject('KasirAja/Kasir/Buger Menu'), 0)

Mobile.tap(findTestObject('KasirAja/Kasir/Menu Role Admin/Menu Pengguna'), 0)

Mobile.verifyElementVisible(findTestObject('KasirAja/Kasir/Nav Title'), 0)

Mobile.verifyElementText(findTestObject('KasirAja/Kasir/Nav Title'), 'pengguna')

Mobile.tap(findTestObject('KasirAja/Pengguna Page/Button Tambah'), 0)

Mobile.tap(findTestObject('KasirAja/Pengguna Page/Buat Pengguna/Button Simpan'), 0, FailureHandling.CONTINUE_ON_FAILURE)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()
try {
	
	def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'nama, email dan password tidak boleh kosong\']').getText()
	KeywordUtil.markPassed("PASS: Objek Toast '$toast' ditemukan!")
	log.logInfo("PASS: Objek Toast '$toast' ditemukan!")
	
}catch(Exception e) {
	
	KeywordUtil.markFailed('ERROR: Objek Toast tidak ditemukan!')	
}

WebUI.callTestCase(findTestCase('Users/logout'), [:], FailureHandling.STOP_ON_FAILURE)


