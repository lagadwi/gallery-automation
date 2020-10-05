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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Start Application')

Mobile.startApplication('C:\\Users\\Laga_DP181\\Documents\\WORK\\gallery-automation\\gallery-automation\\androidapp\\app-release.apk', 
    true)

WebUI.comment('Selecting Shrine App')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShrineApp'), 0)

WebUI.comment('Verify login screen components')

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/LoginButton'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/UsernameEditText'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/PasswordEditText'), 0)

WebUI.comment('Tap login button')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/LoginButton'), 0)

WebUI.comment('Verify Shrine Gallery dashboard components')

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/FilterButton'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/SearchButton'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)

WebUI.comment('Select Stella Sunglasses Item to shopping cart')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/StellaSunglasses'), 0)

WebUI.comment('Open filter menu')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)

WebUI.comment('Select All Item on filter menu')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/AllButton'), 0)

WebUI.comment('Tap Shopping cart and check shopping cart items')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/StellaSunglassesShoppingCart'), 0)

Mobile.pressBack()

WebUI.comment('Select Whitney Belt Item to shopping cart')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/WhitneyBelt'), 0)

WebUI.comment('Open filter menu')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)

WebUI.comment('Select Accesories Item on filter menu')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/AccButton'), 0)

WebUI.comment('Tap Shopping cart and check shopping cart items')

Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/WhitneyBeltShoppingCart'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Application/ShrineShoppingObject/VagabondSack'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/ClothingButton'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/VagabonSackShoppingCart'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Application/ShrineShoppingObject/PlasterTunic'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/HomeButton'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/PlasterTunicShoppingCart'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Application/ShrineShoppingObject/GiltDeskTrio'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)

Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/GiltDeskTrioShoppingCart'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/RemoveStellaSunglasses'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/RemoveWhitneyBelt'), 0)

WebUI.comment('Verify all item clear')

Mobile.verifyElementNotExist(findTestObject('Application/ShrineShoppingObject/StellaSunglassesShoppingCart'), 1)

Mobile.verifyElementNotExist(findTestObject('Application/ShrineShoppingObject/WhitneyBeltShoppingCart'), 1)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/ClearCartButton'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)

WebUI.comment('Verify all item clear')

Mobile.verifyElementNotExist(findTestObject('Application/ShrineShoppingObject/VagabonSackShoppingCart'), 1)

Mobile.verifyElementNotExist(findTestObject('Application/ShrineShoppingObject/PlasterTunicShoppingCart'), 1)

Mobile.verifyElementNotExist(findTestObject('Application/ShrineShoppingObject/GiltDeskTrioShoppingCart'), 1)

Mobile.pressBack()

Mobile.tap(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)

Mobile.tap(findTestObject('Application/ShrineShoppingObject/LogoutButton'), 0)

Mobile.closeApplication()

