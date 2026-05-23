package edu.teamrocket.extras;

import java.util.Optional;
import edu.teamrocket.order.Comanda;

public class SauceExtra extends Extra {

    

    public SauceExtra(){};

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> total = comanda.itemList().stream()
            .filter(x -> "sauce".equalsIgnoreCase(x.extra()))
            .map(x -> Extra.getSAUCE())
            .reduce(Double::sum);

        if (total.isPresent()){
            comanda.updateTotal(total.get());
        }

        if (nextExtra.isPresent()){
            nextExtra.get().sumExtras(comanda);
        }
    }

    
}
