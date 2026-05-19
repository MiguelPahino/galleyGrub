package edu.teamrocket.order;

import java.util.List;
import edu.teamrocket.items.Item;

public interface Comanda {

    void addItem(String name,double precio);
    void addItem(String name,double precio,String extra);
    int size();
    List<Item> itemList();
    Double getTotal();
    void updateTotal(Double precio);
    void display();
    
}
