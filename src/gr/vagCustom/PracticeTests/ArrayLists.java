package gr.vagCustom.PracticeTests;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<>();
        friends.add("Maria");
        friends.add("Nikos");
        friends.remove("Nikos");
        friends.forEach(System.out::println);

    }
}
