package org.ryebread.bingsearchbot.test.query;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.ryebread.bingsearchbot.query.SearchQueryGenerator;

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
		List<Integer> query = generator.next();
		assertTrue(query.size() >= SearchQueryGenerator.QUERY_SIZE_MIN);
		assertTrue(query.size() <= SearchQueryGenerator.QUERY_SIZE_MAX);
	}
	
}
