package com.david.mockito.unittest.controllers;
import com.david.mockito.unittest.data.ItemData;
import com.david.mockito.unittest.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemData data;

    @GetMapping("/dummy-item")
    public Item dummyItem(){
        return new Item(1, "New item", 90);
    }
    @GetMapping("/item-from-db")
    public Item itemFromDB(){
        return this.data.retrieveHardCodedItem();
    }
}
