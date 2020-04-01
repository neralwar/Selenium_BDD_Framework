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

	public void acceptcookies() throws InterruptedException {

		Thread.sleep(3000);
		cookiesalert.click();
		Thread.sleep(3000);
		
		
	}
	


	public void selectIeltsScore(String intieltsscore) throws AWTException, InterruptedException {

		
		iletscore.click();
	

		Robot robobj = new Robot();

		if (intieltsscore.trim().equals("5"))

		{
			robobj.keyPress(KeyEvent.VK_5);
		}

		else if (intieltsscore.trim().equals("6"))

		{
			robobj.keyPress(KeyEvent.VK_6);
			
		} else if (intieltsscore.trim().equals("7"))

		{
			robobj.keyPress(KeyEvent.VK_7);
		}

		else {
			
			robobj.keyPress(KeyEvent.VK_9);
		}
		
		

		robobj.keyPress(KeyEvent.VK_ENTER);
	}

	public void searchorganization() throws InterruptedException, AWTException {

		
		searchorg.click();
	}

}
