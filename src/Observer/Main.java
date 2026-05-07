package Observer;

public class Main {
    public static void main(String[] args) {
        CityTraffic hanoi = new CityTraffic("Hà Nội");
        CityTraffic danang = new CityTraffic("Đà Nẵng");

        TrafficBoard board1 = new TrafficBoard("Bảng điện tử trung tâm");
        TrafficBoard board2 = new TrafficBoard("Ứng dụng di động");

        // Đăng ký quan sát
        hanoi.addObserver(board1);
        hanoi.addObserver(board2);
        danang.addObserver(board2);

        // Thay đổi trạng thái
        hanoi.setStatus("Ùn tắc tại đường Trần Duy Hưng");
        danang.setStatus("Thông thoáng toàn thành phố");
    }
}

