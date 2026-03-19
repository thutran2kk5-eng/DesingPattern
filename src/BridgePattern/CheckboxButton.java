package BridgePattern;

public class CheckboxButton extends Button {

    public CheckboxButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println(size.getSize() + " Checkbox Button");
    }
}