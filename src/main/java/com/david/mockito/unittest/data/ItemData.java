package com.david.mockito.unittest.data;

import com.david.mockito.unittest.models.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemData {

    public Item retrieveHardCodedItem(){
        return new Item(1, "test", 90);
    }

}
