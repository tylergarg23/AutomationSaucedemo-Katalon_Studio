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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.click(findTestObject('Object Repository/Login_Page/userTxt'))

WebUI.setText(findTestObject('Object Repository/Login_Page/userTxt'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Login_Page/passTxt'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Login_Page/loginBtn'))

WebUI.click(findTestObject('Object Repository/Login_Page/div_Sauce Labs Backpackcarry.allTheThings()_33489d'))

WebUI.doubleClick(findTestObject('Object Repository/Login_Page/productsSpan'))

WebUI.click(findTestObject('Object Repository/Login_Page/div_Sauce Labs Backpackcarry.allTheThings()_33489d'))

WebUI.takeScreenshot('D:/2024/Projects QA/Katalon - Automation/Project-Saucedemo/Imagenes/test.png')

WebUI.closeBrowser()