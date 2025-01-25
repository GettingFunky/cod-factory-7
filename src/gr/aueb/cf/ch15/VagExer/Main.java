package gr.aueb.cf.ch15.VagExer;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(5, "Generic Animal");
        Cat cat = new Cat(3, "Whiskers");
        Dog dog = new Dog(4, "Buddy");

        // Χρήση της doSpeak()
        doSpeak(animal);
        doSpeak(cat);
        doSpeak(dog);

        // Εκτύπωση με toString()
        System.out.println(animal);
        System.out.println(cat);
        System.out.println(dog);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
