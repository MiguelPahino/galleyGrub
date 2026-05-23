package edu.teamrocket.extras;

import edu.teamrocket.order.Comanda;
import java.util.Optional;

public class CheeseExtra extends Extra {

    public CheeseExtra(){};

    @Override
    public void sumExtras(Comanda comanda) {

        Optional<Double> total = comanda.itemList().stream()
        .filter(x-> "cheese".equalsIgnoreCase(x.extra()))
        .map(x-> Extra.getCHEESE()).reduce(Double::sum);
        
        if (total.isPresent()){
        comanda.updateTotal(total.get());
        }
 
        if (nextExtra.isPresent()){
        nextExtra.get().sumExtras(comanda);
        }
    }

    
}