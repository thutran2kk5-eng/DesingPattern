package Command;


public class Projector {
    private String mode = "Tắt";

    public void setMode(String mode) {
        this.mode = mode;
        System.out.println("Máy chiếu: Đang ở chế độ [" + mode + "]");
    }

    public String getMode() { return mode; }
}