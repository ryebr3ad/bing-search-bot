package org.ryebread.bingsearchbot.query;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.ryebread.bingsearchbot.query.model.SearchQuery;

public class SearchQueryGenerator {

	public static final int QUERY_SIZE_MIN = 4;
	public static final int QUERY_SIZE_MAX = 10;

	private List<SearchQuery> searchQueries;

	private Iterator<SearchQuery> iter;

	public void generate(int numberOfLoops) {

		searchQueries = new ArrayList<SearchQuery>();
		Random randSize = new Random();
		Random randKey = new Random();
		for (int i = 0; i < numberOfLoops; i++) {
			int querySize = generateRandomNumberWithinRange(randSize, QUERY_SIZE_MIN, QUERY_SIZE_MAX);
			SearchQuery query = new SearchQuery();
			for (int j = 0; j < querySize; j++) {
				int keyChoice = generateRandomNumberWithinRange(randKey, KeyEvent.VK_A, KeyEvent.VK_Z);
				query.add(keyChoice);
			}
			searchQueries.add(query);
		}

		iter = searchQueries.iterator();
	}

	public SearchQuery next() {
		return iter.hasNext() ? iter.next() : null;
	}

	public int size() {
		return searchQueries.size();
	}

	private int generateRandomNumberWithinRange(Random rand, int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}

}
