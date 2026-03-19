package PrototypePattern;

public class Person implements Prototype {

    private String name;

    public Person(String name) { // tạo chủ cho thỏ
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // clone (quan trọng)
    @Override
    public Person clone() {
        return new Person(this.name); // copy object
    }

    @Override
    public String toString() {
        return name;
    }
}