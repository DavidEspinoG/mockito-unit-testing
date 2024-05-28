package com.david.mockito.unittest;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest {
    List<String> mock = mock(List.class);
    @Test
    public void test(){
        when(mock.size()).thenReturn(5);
        assertEquals(5, mock.size());
    }
    public void returnWithGenericParameters(){
        when(mock.get(anyInt())).thenReturn("works");
        assertEquals("works", mock.get(3));
    }
    public void verificationBasics(){
        String value = mock.get(0);
        verify(mock).get(0);
    }
}
