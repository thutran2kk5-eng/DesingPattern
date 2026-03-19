package BridgePattern;

public class DropdownButton extends Button {

    public DropdownButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println(size.getSize() + " Dropdown Button");
    }
}