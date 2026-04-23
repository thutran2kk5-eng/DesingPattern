package Proxy;

public class RealInventory implements IInventory {
    @Override
    public void showInventory() {
        System.out.println("Đang hiển thị danh sách hàng hóa...");
    }
}