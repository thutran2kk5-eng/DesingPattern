package Proxy;

public class InventoryProxy implements IInventory {
    private RealInventory realInventory;
    private String storeName;

    public InventoryProxy(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public void showInventory() { 
        if (realInventory == null) {
            realInventory = new RealInventory();
        }
        System.out.println("Cửa hàng: " + storeName);
        realInventory.showInventory();
    }
}