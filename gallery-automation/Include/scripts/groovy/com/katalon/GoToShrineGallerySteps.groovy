package com.katalon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class GoToShrineGallerySteps {
	@Given("User Open Gallery Apk and navigate to dashboard screen")
	def navigateToDashboardScreen(){
		Mobile.startApplication('androidapp\\app-release.apk',true)
		WebUI.comment("inside main dashboard ")
	}
	@When("User click Shrine Gallery")
	def ClickShrineGallery(){
		WebUI.comment("click Shrine Gallery")
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShrineApp'), 0)
	}
	@Then("User is navigated to Shrine gallery login screen")
	def verifyLoginScreen(){
		WebUI.comment("inside Shrine Gallery Login Screen ")
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/LoginButton'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/UsernameEditText'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/PasswordEditText'), 0)
	}
	@And("User click login button")
	def clickLoginButton(){
		WebUI.comment("click login button  ")
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/LoginButton'), 0)
	}
}