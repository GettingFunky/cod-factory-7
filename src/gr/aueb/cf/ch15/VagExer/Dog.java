package gr.aueb.cf.ch15.VagExer;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void speak() {
        System.out.println("I am a dog");
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + '\'' + ", age=" + getAge() + '}';
    }
}
