package edu.teamrocket.items;

import java.util.HashMap;
import java.util.Map;

public class RetailPrice {
    

    static Map<String,Double> prices = new HashMap<>();

    RetailPrice(){}

    public static void init_prices(){
        prices.put("cheese",0.25);
        prices.put("medium", 0.25);
        prices.put("large", 0.50);
        prices.put("sauce", 0.50);
    }

    public static Double getPrice(String item){
        return prices.getOrDefault(item, 10.0);
    }

    public static boolean contains(String item){
        return prices.containsKey(item);
    }

    public static void display(){
        prices.forEach((key,value) ->{System.out.println(key+"="+value);});
    }
}
