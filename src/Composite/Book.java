package Composite;

public class Book implements LibraryItem {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void checkout() {
        System.out.println("Book \"" + title + "\" has been checked out.");
    }

    @Override
    public void returnItem() {
        System.out.println("Book \"" + title + "\" has been returned.");
    }
}