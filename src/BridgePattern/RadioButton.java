package BridgePattern;

public class RadioButton extends Button {

    public RadioButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println(size.getSize() + " Radio Button");
    }
}