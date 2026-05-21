package edu.teamrocket.receipt;

import java.util.Optional;

import edu.teamrocket.order.Comanda;
import edu.teamrocket.extras.Extra;


public class Receipt implements Ticket {
    private Double total = 0d;
    private final Comanda comanda;
    private Optional<Extra> extra = Optional.empty();

    public Receipt(Comanda comanda){
        this.comanda = comanda;
        this.total = comanda.getTotal();
    }

    public Comanda getOrder(){
        return this.comanda;
    }

    public void setChain(Extra extra){
        this.extra = Optional.of(extra);
    }

    public Extra getChain(){
        return this.extra.get();
    }

    public void sumExtrasCharge(){
        if (extra.isPresent()){
            extra.get().sumExtras(getOrder());
        }
    }

    public Double total(){
        if(this.total <= 0d){
            this.sumExtrasCharge();  
            this.total = this.getOrder().getTotal(); 
        }
        return this.total;
    }

    public void print() {
        this.getOrder().display();
        System.out.print("\tTOTAL --------> " + String.format("%.2f", this.total) + "$\n");
    }

}
