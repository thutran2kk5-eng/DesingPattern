package SingletonPattern;

public class PrintSpooler {

    private static PrintSpooler instance;

  
    private PrintSpooler() {
        init();
    }

    private void init() {
        System.out.println("PrintSpooler initialized");
    }

    public static PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}