package com.david.mockito.unittest.controller;

import com.david.mockito.unittest.controllers.ItemController;
import com.david.mockito.unittest.data.ItemData;
import org.apache.coyote.Request;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    private ItemData data;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void dummyItemBasic() throws Exception{

        RequestBuilder request = MockMvcRequestBuilders
                .get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\" :1,\"price\":90,\"string\":\"New item\"}"))
                .andReturn();

    }

    public void itemFromDB() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/dummy-item")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json(""))
                .andReturn();
    }

}
