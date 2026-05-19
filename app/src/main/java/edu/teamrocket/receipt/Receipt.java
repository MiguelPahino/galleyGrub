package edu.teamrocket.receipt;

import java.util.Optional;
import edu.teamrocket.order.Comanda;
import edu.teamrocket.extras.Extra;


public class Receipt implements Ticket {
    private Double total = 0d;
    private Comanda comanda;
    private Optional<Extra> extra = Optional.empty();

    public Receipt(Comanda comanda){
        this.comanda = comanda;
    };

    public Comanda getOrder(){
        return this.comanda;
    }

    public void setChain(Extra extra){

    }

    public Extra getExtra(){
        return this.extra.get();
    }

}
