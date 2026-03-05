
package mtk;

public abstract class Candy {

    public void prepare() {
        System.out.println("Preparing candy...");
    }

    public abstract void produce();

    public void packageCandy() {
        System.out.println("Packaging candy...");
    }
}
