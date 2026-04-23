package Composite;

public class Member implements LibraryItem {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public void checkout() {
        System.out.println("Member " + name + " checked out books.");
    }

    @Override
    public void returnItem() {
        System.out.println("Member " + name + " returned books.");
    }
}