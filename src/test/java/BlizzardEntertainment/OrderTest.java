package BlizzardEntertainment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import BlizzardEntertainment.utilities.Browser;

public class OrderTest {
	
	@Before
	public void setUp() {
		Browser.openBrowser();
	}
	
	@Test
	public void productOrdering() {
		Browser.openURL();
		
	}
	/*
	@After
	public void thearDown() {
		Browser.quit();
	}
	*/

}
