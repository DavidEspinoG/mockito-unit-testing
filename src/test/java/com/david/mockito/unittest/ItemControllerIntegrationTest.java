package com.david.mockito.unittest;
import com.david.mockito.unittest.data.ItemRepository;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemControllerIntegrationTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() throws Exception{
        String response = this.restTemplate.getForObject("/items", String.class);
        JSONAssert.assertEquals("[{id: 1001}, {id: 1002}, {id: 1003} ]", response, false);
    }
}
