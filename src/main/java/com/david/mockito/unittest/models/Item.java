package com.david.mockito.unittest.models;

public class Item {
    private int id;
    private String name;
    private int price;

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
