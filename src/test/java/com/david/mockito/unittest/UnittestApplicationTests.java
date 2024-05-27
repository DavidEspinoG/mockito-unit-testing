package com.david.mockito.unittest;

import dataService.DataService;
import logic.SomeLogic;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class UnittestApplicationTests {

	@Test
	void calculateSum_basic() {
		SomeLogic logic = new SomeLogic();
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2,3 });
		logic.setData(dataServiceMock);
		int actualResult = logic.calculateSum();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

}
