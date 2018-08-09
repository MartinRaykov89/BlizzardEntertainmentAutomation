package BlizzardEntertainment.pages;

import org.openqa.selenium.By;

import BlizzardEntertainment.utilities.Browser;

public class HeaderPage {
	
	private static By searchField = By.id("search-desktop-input");
	private static By homeButton = By.xpath("//*[contains(@class , 'svg-inline--fa fa-home fa-w-23')]");
	private static By gamesDropdownMenu = By.xpath("//*[contains(@class , 'menu-item-title')][contains(text(),'Games')]");
	
	public static void search (String item ) {
		Browser.driver.findElement(searchField).sendKeys(item);	
	}
	
	public static void navigateToHomePage() {
		Browser.driver.findElement(homeButton).click();
	}
	
	public static void choiceElementFromDropdownGamesMenu (String item) {
		Browser.driver.findElement(gamesDropdownMenu).click();
		switch (item) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;

		default:
			break;
		}
	}

}
