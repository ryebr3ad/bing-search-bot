package org.ryebread.bingsearchbot.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.ryebread.bingsearchbot.java.query.SearchQueryGenerator;

/**
 * Use Robot and Selenium to do quick hits of the Bing search page in order to amass points so I can get Amazon bucks.
 * 
 * @author Ryan
 *
 */
public class BingSearchBot {

	public static void main(String args[]) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\code\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Robot rob = new Robot();
		driver.get("http://www.bing.com");
		Thread.sleep(1000);
		
		SearchQueryGenerator sqg = new SearchQueryGenerator();
		int numberOfLoops = numberOfLoops();
		sqg.generate(numberOfLoops);
		List<Integer> searchQuery = sqg.next();
		int backspaceCount = 0;
		while(searchQuery != null) {
			WebElement searchBox = driver.findElement(By.id("sb_form_q"));
			searchBox.click();
			Thread.sleep(1000);
			for(int i = 0; i < backspaceCount; i++) {
				rob.keyPress(KeyEvent.VK_BACK_SPACE);
				Thread.sleep(100);
			}
			
			Thread.sleep(1000);
			
			for(int j = 0; j < searchQuery.size(); j++) {
				rob.keyPress(searchQuery.get(j));
				Thread.sleep(100);
			}
			rob.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			backspaceCount = searchQuery.size();
			searchQuery = sqg.next();
		}
		
		driver.quit();
		
	}
	
	private static int numberOfLoops() {
		return Constants.TOTAL_POINTS / Constants.POINTS_PER_SEARCH;
	}
	
}
