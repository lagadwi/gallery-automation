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



class ShoppingFilterAccessories {

	//Scenario: Add item to shopping cart on filter Accessories
	@Given("User on Shrine Gallery Dashboard with filter Accessories")
	def UserFilterAccScreen(){
		WebUI.comment("Verify dashboard components")
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/FilterButton'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/SearchButton'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)
	}
	@When("User select Vagabond Sack item")
	def UserTapItem3(){
		WebUI.comment("click Vagabond Sack item ")
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/VagabondSack'), 0)
	}
	@Then("Selected item Vagabond Sack move to cart")
	def Item3MoveToCart(){
		WebUI.comment("verify item 3rd on shopping cart ")
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/OpenMenu'), 0)
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/ClothingButton'), 0)
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/VagabonSackShoppingCart'), 0)
		Mobile.pressBack()
	}
}