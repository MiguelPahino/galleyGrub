package edu.teamrocket.receipt;

import edu.teamrocket.extras.Extra;
import edu.teamrocket.order.Comanda;

public interface Ticket {

    Comanda getOrder();
    void setChain(Extra extra);
    Extra getChain();
    Double total();
    void sumExtrasCharge();
    void print();
}