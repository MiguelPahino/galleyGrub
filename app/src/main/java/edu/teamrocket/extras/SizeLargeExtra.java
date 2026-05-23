package edu.teamrocket.extras;

import edu.teamrocket.order.Comanda;
import java.util.Optional;

public class SizeLargeExtra extends Extra {

    

    public SizeLargeExtra(){};

    @Override
    public void sumExtras(Comanda comanda) {
        Optional<Double> total = comanda.itemList().stream()
            .filter(x -> "large".equalsIgnoreCase(x.extra()))
            .map(x -> Extra.getSIZE_PRICE())
            .reduce(Double::sum);

        if (total.isPresent()){
            comanda.updateTotal(total.get());
        }

        if (nextExtra.isPresent()){
            nextExtra.get().sumExtras(comanda);
        }
    }

}
