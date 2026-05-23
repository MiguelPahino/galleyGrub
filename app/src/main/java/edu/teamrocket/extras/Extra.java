package edu.teamrocket.extras;

import java.util.Optional;
import edu.teamrocket.order.Comanda;

public abstract class Extra {
    private static Double CHEESE = 0.25d;
    private static Double SAUCE = 0.50d;
    private static Double SIZE_PRICE = 0.50d;


    Optional<Extra> nextExtra = Optional.empty();

    protected  Extra(){};

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.of(nextExtra);
    }

    public abstract void sumExtras(Comanda comanda);

    public static Double getCHEESE() {
        return CHEESE;
    }

    public static Double getSAUCE() {
        return SAUCE;
    }

    public static Double getSIZE_PRICE() {
        return SIZE_PRICE;
    }

    

    
}    
