package org.ryebread.bingsearchbot.java.query;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.ryebread.bingsearchbot.java.Constants;

public class SearchQueryGenerator {

	private List<List<Integer>> searchQueries;
	
	private Iterator<List<Integer>> iter;

	public void generate(int numberOfLoops) {

		searchQueries = new ArrayList<List<Integer>>();
		Random randSize = new Random();
		Random randKey = new Random();
		for(int i = 0; i < numberOfLoops; i++) {
			int querySize = generateRandomNumberWithinRange(randSize, Constants.QUERY_SIZE_MIN, Constants.QUERY_SIZE_MAX);
			List<Integer> query = new ArrayList<Integer>();
			for(int j = 0; j < querySize; j++) {
				int keyChoice = generateRandomNumberWithinRange(randKey, KeyEvent.VK_A, KeyEvent.VK_Z);
				query.add(keyChoice);
			}
			searchQueries.add(query);
		}
		
		iter = searchQueries.iterator();
	}
	
	public List<Integer> next() {
		return iter.hasNext() ? iter.next() : null;
	}
	
	public int size() {
		return searchQueries.size();
	}
	
	private int generateRandomNumberWithinRange(Random rand, int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}

}
