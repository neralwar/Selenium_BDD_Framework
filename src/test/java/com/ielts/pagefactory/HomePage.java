package com.ielts.pagefactory;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://takeielts.britishcouncil.org/organisations/organisations-recognise-ielts")
public class HomePage extends PageObject {

	@FindBy(xpath = "//*[@id='select2-edit-field-minimum-bandscore-value-container']")
	WebElement iletscore;

	@FindBy(id = "edit-submit-recognizing-organizations")
	WebElement searchorg;

	@FindBy(id = "onetrust-accept-btn-handler")
	WebElement cookiesalert;
	
	@FindBy(xpath = "//descendant::li[@class='select2-results__option'][7]")
	WebElement iletscore_6;
	@FindBy(xpath = "//descendant::li[@class='select2-results__option'][8]")
	WebElement iletscore_7;
	@FindBy(xpath = "//descendant::li[@class='select2-results__option'][6]")
	WebElement iletscore_5;
	
	

	public void acceptcookies() throws InterruptedException {

		Thread.sleep(3000);
		cookiesalert.click();
		Thread.sleep(3000);
		
		
	}
	


	public void selectIeltsScore(String intieltsscore) throws AWTException, InterruptedException {

		
		iletscore.click();
		
		if (intieltsscore.trim().equals("5"))

		{
			iletscore_5.click();
		}

		else if (intieltsscore.trim().equals("6"))

		{
			iletscore_6.click();
			
		} else if (intieltsscore.trim().equals("7"))

		{
			iletscore_7.click();
		}

		else 
		
		{
			
			iletscore.click();
		}
		
		Thread.sleep(3000);
	}

	public void searchorganization() throws InterruptedException, AWTException {

		
		searchorg.click();
	}

}
