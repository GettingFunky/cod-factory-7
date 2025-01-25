package gr.aueb.cf.ch15.VagExer;

public class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return "Cat{name='" + getName() + '\'' + ", age=" + getAge() + '}';
    }
}
