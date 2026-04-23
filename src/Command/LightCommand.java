package Command;


public class LightCommand implements Command {
    private Light light;
    private int prevBrightness;
    private int newBrightness;

    public LightCommand(Light light, int brightness) {
        this.light = light;
        this.newBrightness = brightness;
    }

    @Override
    public void execute() {
        prevBrightness = light.getBrightness(); // Lưu lại trạng thái cũ để Undo
        light.setBrightness(newBrightness);
    }

    @Override
    public void undo() {
        light.setBrightness(prevBrightness);
    }
}