package org.ryebread.bingsearchbot.test.query;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.ryebread.bingsearchbot.query.SearchQueryGenerator;
import org.ryebread.bingsearchbot.query.model.SearchQuery;

public class SearchQueryGeneratorTest {
	
	@Test
	public void testNumQuerys() {
		int size = 4;
		SearchQueryGenerator generator = new SearchQueryGenerator();
		generator.generate(size);
		assertEquals(generator.size(), size);
	}
	
	@Test
	public void testQuerySize() {
		SearchQueryGenerator generator = new SearchQueryGenerator();
		generator.generate(1);
		SearchQuery query = generator.next();
		assertTrue(query.size() >= SearchQueryGenerator.QUERY_SIZE_MIN);
		assertTrue(query.size() <= SearchQueryGenerator.QUERY_SIZE_MAX);
	}
	
}
