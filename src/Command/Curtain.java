package Command;


public class Curtain {
    private int position = 0; // 0: Lên hết, 100: Hạ hết

    public void setPosition(int pos) {
        this.position = pos;
        System.out.println("Rèm cửa: Đã dừng ở vị trí " + pos + "%");
    }

    public int getPosition() { return position; }
}