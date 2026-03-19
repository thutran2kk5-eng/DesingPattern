package PrototypePattern;

public class Rabbit implements Cloneable {

    private int age;        // tuổi con thỏ
    private Person owner;   // chủ con thỏ

    public Rabbit(int age, Person owner) {
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // clone chuẩn (deep copy)
    @Override
    public Rabbit clone() {
        try {
            Rabbit copy = (Rabbit) super.clone();

            // 🔥 deep copy owner
            copy.owner = new Person(owner.getName());

            return copy;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}