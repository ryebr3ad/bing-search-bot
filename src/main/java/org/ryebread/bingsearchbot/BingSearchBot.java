package org.ryebread.bingsearchbot;

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

/**
 * Use Robot and Selenium to do quick hits of the Bing search page in order to amass points so I can get Amazon bucks.
 * 
 * @author Ryan
 *
 */
public class BingSearchBot {
	
	private static List<List<Integer>> searchQueries;
	

	public static void main(String args[]) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\code\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		Robot rob = new Robot();		
		driver.get("http://www.bing.com");
		Thread.sleep(1000);
		
		for(int i = 0; i < searchQueries.size(); i++) {
			WebElement searchBox = driver.findElement(By.id("sb_form_q"));
			Point searchBoxPoint = searchBox.getLocation();
			rob.mouseMove(searchBoxPoint.getX(), searchBoxPoint.getY() + 90);
			Thread.sleep(1000);
			rob.mousePress(InputEvent.BUTTON1_MASK);
			rob.mouseRelease(InputEvent.BUTTON1_MASK);
			rob.mousePress(InputEvent.BUTTON1_MASK);
			rob.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(1000);
			
			List<Integer> searchQuery = searchQueries.get(i);
			
			for(int j = 0; j < searchQuery.size(); j++) {
				rob.keyPress(searchQuery.get(j));
				Thread.sleep(100);
			}
			rob.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}
		driver.quit();
		
	}
	
	static {
		
		searchQueries = new ArrayList<List<Integer>>();
		
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_T, KeyEvent.VK_E, KeyEvent.VK_S, KeyEvent.VK_T}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_A, KeyEvent.VK_B, KeyEvent.VK_C, KeyEvent.VK_D}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_D, KeyEvent.VK_O, KeyEvent.VK_G}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_C, KeyEvent.VK_A, KeyEvent.VK_T}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_K}));
		
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_F, KeyEvent.VK_I, KeyEvent.VK_S, KeyEvent.VK_K}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_D, KeyEvent.VK_O, KeyEvent.VK_O, KeyEvent.VK_R}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_B, KeyEvent.VK_E, KeyEvent.VK_N}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_P, KeyEvent.VK_N, KeyEvent.VK_C}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_A, KeyEvent.VK_L, KeyEvent.VK_L}));
		
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_T, KeyEvent.VK_O, KeyEvent.VK_U, KeyEvent.VK_R}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_T, KeyEvent.VK_E, KeyEvent.VK_L, KeyEvent.VK_L}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_S, KeyEvent.VK_A, KeyEvent.VK_M}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_K, KeyEvent.VK_E, KeyEvent.VK_Y}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_S, KeyEvent.VK_S, KeyEvent.VK_L}));
		
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_V, KeyEvent.VK_E, KeyEvent.VK_S, KeyEvent.VK_T}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_A, KeyEvent.VK_B, KeyEvent.VK_C, KeyEvent.VK_R}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_D, KeyEvent.VK_O, KeyEvent.VK_M}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_C, KeyEvent.VK_A, KeyEvent.VK_R}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_L}));
		
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_P, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_C, KeyEvent.VK_A, KeyEvent.VK_R, KeyEvent.VK_E}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_Y, KeyEvent.VK_Y, KeyEvent.VK_Y}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_G, KeyEvent.VK_G, KeyEvent.VK_G}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_L, KeyEvent.VK_L, KeyEvent.VK_L}));
		
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W, KeyEvent.VK_Q}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_E, KeyEvent.VK_R}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_M, KeyEvent.VK_M, KeyEvent.VK_M}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_L, KeyEvent.VK_M, KeyEvent.VK_N}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_P, KeyEvent.VK_P, KeyEvent.VK_O}));
		
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_D, KeyEvent.VK_F}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_D, KeyEvent.VK_F, KeyEvent.VK_F, KeyEvent.VK_F}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_I, KeyEvent.VK_I, KeyEvent.VK_I}));
		searchQueries.add(Arrays.asList(new Integer[]{KeyEvent.VK_P, KeyEvent.VK_O, KeyEvent.VK_U}));

	}
	
}
