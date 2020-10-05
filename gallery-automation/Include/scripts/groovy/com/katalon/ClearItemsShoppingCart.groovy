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



class ClearItemsShoppingCart {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User on shopping cart menu and want to clear item")
	def UserOnShoppingCartMenu() {
		WebUI.comment("shopping cart items check")
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/VagabonSackShoppingCart'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/PlasterTunicShoppingCart'), 0)
		Mobile.verifyElementExist(findTestObject('Application/ShrineShoppingObject/GiltDeskTrioShoppingCart'), 0)
	}

	@When("User tap clear cart")
	def UserTapClearCartButton() {
		WebUI.comment("tap clear cart on shopping cart")
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/ClearCartButton'), 0)
		Mobile.tap(findTestObject('Application/ShrineShoppingObject/ShoppingCart'), 0)
	}

	@Then("All items removed from shopping cart list")
	def VerifyRemovedItems() {
		WebUI.comment("check all items no longer exist")
		Mobile.verifyElementNotExist(findTestObject('Application/ShrineShoppingObject/VagabonSackShoppingCart'), 1)
		Mobile.verifyElementNotExist(findTestObject('Application/ShrineShoppingObject/PlasterTunicShoppingCart'), 1)
		Mobile.verifyElementNotExist(findTestObject('Application/ShrineShoppingObject/GiltDeskTrioShoppingCart'), 1)
		Mobile.pressBack()
	}
}