package Builder;

public class Bedroom {
    private String bedType;
    private String color;
    private boolean hasTV;
    private boolean hasAC;
    private int numberOfWindows;
    private boolean hasDesk;
    private boolean hasWardrobe;
    private double size;

    public Bedroom(String bedType, String color, boolean hasTV, boolean hasAC,
                   int numberOfWindows, boolean hasDesk, boolean hasWardrobe, double size) {
        this.bedType = bedType;
        this.color = color;
        this.hasTV = hasTV;
        this.hasAC = hasAC;
        this.numberOfWindows = numberOfWindows;
        this.hasDesk = hasDesk;
        this.hasWardrobe = hasWardrobe;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bedroom [bedType=" + bedType + ", color=" + color +
                ", hasTV=" + hasTV + ", hasAC=" + hasAC +
                ", windows=" + numberOfWindows + ", desk=" + hasDesk +
                ", wardrobe=" + hasWardrobe + ", size=" + size + "]";
    }
}