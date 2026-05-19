package edu.teamrocket.order;

import java.util.ArrayList;
import java.util.List;
import edu.teamrocket.items.Item;

public class Order implements Comanda{
    private Double total = 0d;
    private List<Item> itemsList = new ArrayList<>();

    public Order(){};

    public void addItem(String name, double price){
        itemsList.add(new Item(name, price));
    }

    public void addItem(String name, double price,String extra){
        itemsList.add(new Item(name, price,extra));
    }

    public List<Item> itemList(){
        return this.itemsList;
    }

    public int size(){
        return this.itemList().size();
    }

    public Double getTotal(){
        return this.total;
    }
    public void updateTotal(Double total){
        this.total = total;
    }

    public void display(){
        itemsList.stream().forEach(i-> i.display());
    }
    
}
