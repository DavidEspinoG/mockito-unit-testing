package com.david.mockito.unittest.controllers;
import com.david.mockito.unittest.models.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/dummy-item")
    public Item dummy_item(){
        return new Item(1, "New item", 90);
    }
}
