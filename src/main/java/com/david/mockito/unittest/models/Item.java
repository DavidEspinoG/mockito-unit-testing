package com.david.mockito.unittest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Item {
    @Id
    private int id;
    private String name;
    private int price;
    @Transient
    private int value;

    protected Item() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Item (int id, String name, int price ){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId(){
        return this.id;
    }

    public String getString(){
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }



    public String toString(){
        return String.format("Item[%d, $s, $d]", id, name, price);
    }

}
