package edu.teamrocket.extras;

import java.util.Optional;

import edu.teamrocket.order.Comanda;
import edu.teamrocket.items.Item;;

public class Regular extends Extra {
    
    public Regular(){};

    @Override
    public void sumExtras(Comanda comanda) {
    
    Optional<Double> total = comanda.itemList().stream().map(Item::price).reduce(Double::sum);
    
    if (!total.isEmpty()){
        comanda.updateTotal(total.get());
    }
    
    };

}
