package SingletonPattern;
public class Main {
    public static void main(String[] args) {

        PrintSpooler p1 = PrintSpooler.getInstance();
        PrintSpooler p2 = PrintSpooler.getInstance();

        p1.print("Document A");
        p2.print("Document B");

        System.out.println(p1 == p2); 
    }
}