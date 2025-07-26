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

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

Windows.startApplicationWithTitle('E:\\kiem_thu_phan_mem\\bt_nhom\\CV_DT.exe', '')

Windows.setText(findWindowsObject('Object Repository/tron/Edit'), 'admin')

Windows.setText(findWindowsObject('Object Repository/tron/Edit(1)'), 'abc123')

Windows.click(findWindowsObject('Object Repository/tron/Button'))

Windows.click(findWindowsObject('Object Repository/tron/Button(1)'))

Windows.switchToWindowTitle('Form1')

Windows.click(findWindowsObject('Object Repository/tron/RadioButton'))

Windows.setText(findWindowsObject('Object Repository/tron/Edit(2)'), r)

Windows.click(findWindowsObject('Object Repository/tron/Button(2)'))

def cv = Windows.getText(findWindowsObject('Object Repository/tron/Edit(3)'))

def dt = Windows.getText(findWindowsObject('Object Repository/tron/Edit(4)'))

Windows.verifyMatch(cv, me_cv, false)

Windows.verifyMatch(dt, me_dt, false)

Windows.click(findWindowsObject('Object Repository/tron/Button(3)'))

Windows.click(findWindowsObject('Object Repository/tron/Button(4)'))

