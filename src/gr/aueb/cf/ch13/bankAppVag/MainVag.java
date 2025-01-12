package gr.aueb.cf.ch13.bankAppVag;

import gr.aueb.cf.ch13.bankAppVag.model.JointAccount;
import gr.aueb.cf.ch13.bankAppVag.model.OverdraftAccount;

public class MainVag {

    public static void main(String[] args) throws Exception {
        OverdraftAccount over1 = new OverdraftAccount(1234, "GR123456", "Alice", "Cooper", "123", 6000.0);

        // Κλήση overdraft και εκτύπωση
        String overdraftResult = over1.Overdraft(340.0);
        System.out.println(overdraftResult);

        // Δημιουργία κοινού λογαριασμού
        JointAccount joint1 = new JointAccount("AliceCooper", "BobDylan", 5000.00);

        System.out.println(joint1.toString());
    }
}
