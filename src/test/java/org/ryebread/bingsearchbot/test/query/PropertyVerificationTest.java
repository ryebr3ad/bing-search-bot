package org.ryebread.bingsearchbot.test.query;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.ryebread.bingsearchbot.PropertyGetter;

import static org.ryebread.bingsearchbot.PropertyGetter.*;

public class PropertyVerificationTest {

	@Test
	public void testPropertiesExist() {
		List<String> required = PropertyGetter.getRequiredProps();
		for (String req : required) {
			assertTrue(!"".equals(PropertyGetter.get(req)));
		}
	}

	@Test
	public void testTotalPointsIsANumber() {
		assertDoesNotThrow(() -> {
			Integer.parseInt(PropertyGetter.get(POINTS_PER_SEARCH));
			Integer.parseInt(PropertyGetter.get(TOTAL_POINTS));
		});
	}

}
