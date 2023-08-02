import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.AppiumDriver

int randomInt;
randomInt = (int)(Math.random()*500);
intToString = randomInt.toString();

Mobile.startExistingApplication('com.kasirajaandroid')

Mobile.tap(findTestObject('KasirAja/Login Page/daftarLink'), 0)

Mobile.sendKeys(findTestObject('KasirAja/Registration Page/namaTokoReg'), "Sampurasun")

Mobile.sendKeys(findTestObject('KasirAja/Registration Page/emailReg'), "sampurasun.${intToString}@example.com")

Mobile.sendKeys(findTestObject('KasirAja/Registration Page/passReg'), 'rampes123456')

Mobile.tap(findTestObject('KasirAja/Registration Page/daftarBtn'), 0)

Mobile.verifyElementVisible(findTestObject('KasirAja/Registration Page/TextView Pendaftaran Berhasil'), 0)

//AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//
//driver.terminateApp('com.kasirajaandroid')

