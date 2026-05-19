package edu.teamrocket.extras;

import edu.teamrocket.order.Comanda;

public class SauceExtra extends Extra {

    private Double SAUCE_PRICE = 100d;

    public SauceExtra(){};

    @Override
    public void sumExtras(Comanda comanda) {
        comanda.updateTotal(comanda.getTotal() + SAUCE_PRICE);
    }

    
}
