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



class ShoppingWithoutFilter {

	@Given("User on Shrine Gallery Dashboard")
	def UserOnShrineGalleryDasboardScreen(){
		WebUI.comment("Verify dashboard components")
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/FilterButton'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/SearchButton'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)
	}
	@When("User select Stella Sunglasses item")
	def UserTapItem1(){
		WebUI.comment("click stella sunglasses item ")
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/StellaSunglasses'), 0)
	}
	@Then("Selected item Stella Sunglasses move to cart")
	def Item1MoveToCart(){
		WebUI.comment("verify item 1st on shopping cart ")
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/AllButton'), 0)
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/StellaSunglassesShoppingCart'), 0)
		Mobile.pressBack()
	}
}