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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.sendKeys(findTestObject('Login/Username_Textbox'), 'Admin')

WebUI.sendKeys(findTestObject('Login/Password_Textbox'), 'admin123')

WebUI.click(findTestObject('Login/Login_Button'))

WebUI.waitForElementVisible(findTestObject('Dashboard/Dashboard_Title'), 60)

WebUI.waitForElementClickable(findTestObject('Dashboard/Assign_Leave_Menu'), 30)

String assignLeaveTittle = WebUI.getText(findTestObject('Dashboard/Assign_Leave_Title'))

WebUI.click(findTestObject('Dashboard/Assign_Leave_Menu'))

WebUI.waitForElementVisible(findTestObject('Leave/Employee_Name_Input'), 30)

WebUI.verifyElementText(findTestObject('Leave/Assign_Leave_Title'), 'Assign Leave')

WebUI.sendKeys(findTestObject('Leave/Employee_Name_Input'), 'Orange Test')

WebUI.click(findTestObject('Leave/Leave_Type_Dropdown'))

WebUI.selectOptionByLabel(findTestObject('Leave/Leave_Type_Dropdown'), 'CAN - Personal', false)

WebUI.click(findTestObject('Leave/From_Date_Input'))

WebUI.sendKeys(findTestObject('Leave/From_Date_Input'), '2022-05-07')

WebUI.click(findTestObject('Leave/Employee_Name_Input'))

WebUI.click(findTestObject('Leave/Employee_Name_Input'))
public String randomEmail(String firstName, String lastName)
{
	int randomNumber = (int)(Math.random() * 9999);
	return firstName + lastName + randomNumber + "@gmail.com"
}
String email = randomEmail("tony", "user");
println(email);

WebUI.sendKeys(findTestObject('Leave/Comment_Text_Area'), email)

WebUI.click(findTestObject('Leave/Assign_Button'))

//WebUI.closeBrowser()

