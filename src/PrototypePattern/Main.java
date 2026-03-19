package PrototypePattern;

public class Main {

    public static void main(String[] args) {

        // tạo chủ
        Person p = new Person("Nam");

        // tạo thỏ ban đầu
        Rabbit r1 = new Rabbit(2, p);

        // clone thỏ
        Rabbit r2 = r1.clone(); // KHÔNG cần ép kiểu

        // in thông tin
        System.out.println("Tuổi thỏ r1: " + r1.getAge());
        System.out.println("Tuổi thỏ r2: " + r2.getAge());

        System.out.println("Chủ thỏ r1: " + r1.getOwner().getName());
        System.out.println("Chủ thỏ r2: " + r2.getOwner().getName());

        // đổi owner của r2
        r2.getOwner().setName("An");

        System.out.println("\nSau khi đổi chủ của r2:");

        System.out.println("Chủ thỏ r1: " + r1.getOwner().getName());
        System.out.println("Chủ thỏ r2: " + r2.getOwner().getName());
    }
}