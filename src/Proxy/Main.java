package Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- App bắt đầu chạy ---");
        
        // Khởi tạo Proxy cực nhanh vì chưa load database
        IInventory inventory = new InventoryProxy("Siêu thị Co.op Mart");

        System.out.println("App đã sẵn sàng, nhưng dữ liệu kho chưa được tải để tiết kiệm tài nguyên.");
        System.out.println("Đang thực hiện các công việc nhẹ khác...");

        // Khi người dùng yêu cầu xem kho, lúc này dữ liệu mới được load (Lazy Loading)
        System.out.println("\n--- Người dùng nhấn nút 'Xem Kho' ---");
        inventory.showInventory();
        
        // Lần gọi thứ 2 sẽ không tốn thời gian load nữa vì đã có sẵn trong proxy
        System.out.println("\n--- Người dùng xem lại kho lần 2 ---");
        inventory.showInventory();
    }
}