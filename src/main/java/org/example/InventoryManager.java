package org.example;




import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    public void addItem(String item, int quantity) {
        inventory.put(item, quantity);
    }

    public void removeItem(String item) {
        inventory.remove(item);
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}
