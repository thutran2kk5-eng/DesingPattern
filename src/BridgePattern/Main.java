package BridgePattern;

public class Main {

    public static void main(String[] args) {

        Button b1 = new RadioButton(new SmallSize());
        Button b2 = new CheckboxButton(new LargeSize());
        Button b3 = new DropdownButton(new MediumSize());

        b1.draw();
        b2.draw();
        b3.draw();
    }
}