package edu.teamrocket.items;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ItemTest {

    @Test
    public void equals_test() {

        Item patty = new Item("Krabby Patty", 1.25);
        Item kpatty = new Item("Krabby Patty", 1.25);

        assertTrue(patty.equals(kpatty));

    }
    
}