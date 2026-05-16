package edu.teamrocket.receipt;

import java.util.Optional;

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

    }

}
