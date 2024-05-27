package com.david.mockito.unittest;

import logic.SomeLogic;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UnittestApplicationTests {

	@Test
	void calculateSum_basic() {
		SomeLogic logic = new SomeLogic();
		int actualResult = logic.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

}
