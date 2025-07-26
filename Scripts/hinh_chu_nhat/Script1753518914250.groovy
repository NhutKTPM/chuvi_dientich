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
import com.kms.katalon.core.annotation.BeforeTestCase as BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite as BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase as AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite as AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext as TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext as TestSuiteContext

Windows.startApplicationWithTitle('E:\\kiem_thu_phan_mem\\bt_nhom\\CV_DT.exe', '')

Windows.setText(findWindowsObject('Object Repository/chu_nhat/Edit'), 'admin')

Windows.setText(findWindowsObject('Object Repository/chu_nhat/Edit(1)'), 'abc123')

Windows.click(findWindowsObject('Object Repository/chu_nhat/Button'))

Windows.click(findWindowsObject('Object Repository/chu_nhat/Button(1)'))

Windows.switchToWindowTitle('Form1')

Windows.click(findWindowsObject('Object Repository/chu_nhat/RadioButton'))

Windows.setText(findWindowsObject('Object Repository/chu_nhat/Edit(2)'), d)

Windows.setText(findWindowsObject('Object Repository/chu_nhat/Edit(3)'), r)

Windows.click(findWindowsObject('Object Repository/chu_nhat/Button(2)'))

def cv = Windows.getText(findWindowsObject('Object Repository/chu_nhat/Edit(4)'))

def dt = Windows.getText(findWindowsObject('Object Repository/chu_nhat/Edit(5)'))

Windows.verifyMatch(cv, me_cv, false)

Windows.verifyMatch(dt, me_dt, false)

Windows.click(findWindowsObject('Object Repository/chu_nhat/Button(3)'))

Windows.click(findWindowsObject('Object Repository/chu_nhat/Button(4)'))

