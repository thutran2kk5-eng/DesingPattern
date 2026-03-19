package Builder;

public class BedroomBuilder implements Builder {

    private String bedType;
    private String color;
    private boolean hasTV;
    private boolean hasAC;
    private int numberOfWindows;
    private boolean hasDesk;
    private boolean hasWardrobe;
    private double size;

    @Override
    public void reset() {
        bedType = null;
        color = null;
        hasTV = false;
        hasAC = false;
        numberOfWindows = 0;
        hasDesk = false;
        hasWardrobe = false;
        size = 0;
    }

    public BedroomBuilder setBedType(String bedType) {
        this.bedType = bedType;
        return this;
    }

    public BedroomBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public BedroomBuilder setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }

    public BedroomBuilder setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public BedroomBuilder setHasDesk(boolean hasDesk) {
        this.hasDesk = hasDesk;
        return this;
    }

    public BedroomBuilder setHasWardrobe(boolean hasWardrobe) {
        this.hasWardrobe = hasWardrobe;
        return this;
    }

    public BedroomBuilder setSize(double size) {
        this.size = size;
        return this;
    }

    public Bedroom build() {
        return new Bedroom(bedType, color, hasTV, hasAC,
                numberOfWindows, hasDesk, hasWardrobe, size);
    }
}