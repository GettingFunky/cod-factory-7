package gr.aueb.cf.ch15.VagExer;

public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + '\'' + ", age=" + age + '}';
    }

    public void speak() {
        System.out.println("I am an animal");
    }
}
