package mtk;

public class PrintSpooler {

    private static PrintSpooler instance;

    // Private constructor prevents instantiation
    private PrintSpooler() {
        init();
    }

    // Complex initialization logic
    private void init() {
        System.out.println("Initializing Print Spooler...");
    }

    public static PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
