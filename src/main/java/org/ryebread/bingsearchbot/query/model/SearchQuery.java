package org.ryebread.bingsearchbot.query.model;

import java.util.ArrayList;
import java.util.List;

public class SearchQuery {

	private List<Integer> query;

	public SearchQuery() {
		query = new ArrayList<Integer>();
	}

	public void add(Integer i) {
		query.add(i);
	}

	public int size() {
		return query.size();
	}

	public Integer get(int index) {
		return query.get(index);
	}

}
