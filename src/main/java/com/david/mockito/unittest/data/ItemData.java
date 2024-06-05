package com.david.mockito.unittest.data;

import com.david.mockito.unittest.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemData {

    @Autowired
    private ItemRepository repository;

    public Item retrieveHardCodedItem(){
        return new Item(1, "test", 90);
    }

    public List<Item> retrieveAllItems(){
        return repository.findAll();
    }

}
