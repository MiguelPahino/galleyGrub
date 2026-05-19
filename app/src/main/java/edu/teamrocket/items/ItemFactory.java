package edu.teamrocket.items;


import java.util.HashMap;

public class ItemFactory {

    private static final HashMap<String,Item> itemMap = new HashMap<>();

    public static Item getItem(String name,double price){
        itemMap.putIfAbsent(name,new Item(name, price));
        return itemMap.get(name);
    }

    public static Item getItem(String name,double price,String extra){
        itemMap.putIfAbsent(name + "w/" + extra,new Item(name, price,extra));
        return itemMap.get(name + "w/" + extra);
    }

    static int size(){
        return itemMap.size();
    }

    static void clear(){
        itemMap.clear();    
    }




    
}
