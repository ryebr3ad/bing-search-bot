package org.ryebread.bingsearchbot.test.query;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.ryebread.bingsearchbot.java.query.SearchQueryGenerator;

public class SearchQueryGeneratorTest {
	
	@Test
	public void testNumQuerys() {
		int size = 4;
		SearchQueryGenerator generator = new SearchQueryGenerator();
		generator.generate(size);
		assertEquals(generator.size(), size);
	}
	
}
