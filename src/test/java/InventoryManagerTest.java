// InventoryManagerTest.java

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import repositorio.InventoryManager;
import src.main.java.repositorio.InventoryManager;

@RunWith(MockitoJUnitRunner.class)
public class InventoryManagerTest {
    @Mock
    private InventoryManager inventoryManager;

    @Before
    public void setUp() {
        inventoryManager = new InventoryManager();
    }

    @Test
    public void testAddItem() {
        inventoryManager.addItem("Item1", 10);
        assertEquals(10, inventoryManager.getInventory().get("Item1").intValue());
    }

    @Test
    public void testRemoveItem() {
        inventoryManager.addItem("Item2", 5);
        inventoryManager.removeItem("Item2");
        assertEquals(null, inventoryManager.getInventory().get("Item2"));
    }
}
