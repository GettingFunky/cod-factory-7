package gr.aueb.cf.ch12.modelVag;

public class Main {

    public static void main(String[] args) {


    User admin = new User(1L, "Alice", "Cooper");

    UserCredentials aliceCooper = new UserCredentials(1L, "AliceCooper", "12345pass");

        System.out.println("User: {" + admin.getId() + ", " + admin.getFirstname() + ", " + admin.getLastname() + "}");
        System.out.println("UserCredentials: {" + aliceCooper.getId() + ", " + aliceCooper.getUsername() + ", " + aliceCooper.getPassword() + "}");

    }

}