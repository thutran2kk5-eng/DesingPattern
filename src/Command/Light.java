package Command;


public class Light {
    private int brightness = 0;

    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println("Hệ thống chiếu sáng: Độ sáng hiện tại là " + level + "%");
    }

    public int getBrightness() { return brightness; }
}