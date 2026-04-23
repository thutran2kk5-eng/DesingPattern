package Composite;
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Design Patterns");

        Member m1 = new Member("An");
        Member m2 = new Member("Binh");

        // nhóm nhỏ
        LibraryGroup group1 = new LibraryGroup(b1, m1);
        LibraryGroup group2 = new LibraryGroup(b2, m2);

        // nhóm lớn (composite của composite)
        LibraryGroup bigGroup = new LibraryGroup(group1, group2);

        System.out.println("=== Checkout ===");
        bigGroup.checkout();

        System.out.println("\n=== Return ===");
        bigGroup.returnItem();
    }
}
