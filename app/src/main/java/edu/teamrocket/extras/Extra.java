package edu.teamrocket.extras;

import java.util.Optional;
import edu.teamrocket.order.Comanda;

public abstract class Extra {
    static final String CHEESE = new String();
    static final String SAUCE = new String();
    static final String SIZE_LARGE =new String();

    String extraProduct = new String();
    Optional<Extra> nextExtra = Optional.empty();

    protected  Extra(){};

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.of(nextExtra);
    }

    public abstract void sumExtras(Comanda comanda);

    
}    
