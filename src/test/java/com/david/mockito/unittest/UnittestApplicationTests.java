package com.david.mockito.unittest;

import dataService.DataService;
import logic.SomeLogic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class UnittestApplicationTests {
	@InjectMocks
	SomeLogic logic;

	@Mock
	DataService dataServiceMock;

	@Test
	void calculateSum_basic() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2,3 });
		logic.setData(dataServiceMock);
		int actualResult = logic.calculateSum();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

}
