package gr.aueb.cf.ch13.bankAppVag.model;

/**
 * Represents a joint bank account with two account holders.
 */
public class JointAccount {
    private String holderPrimary;
    private String holderSecondary;
    private double balance;

    public JointAccount() {}

    public JointAccount(String holderPrimary, String holderSecondary, double balance) {
        this.holderPrimary = holderPrimary;
        this.holderSecondary = holderSecondary;
        setBalance(balance);
    }

    public String getHolderPrimary() {
        return holderPrimary;
    }

    public void setHolderPrimary(String holderPrimary) {
        this.holderPrimary = holderPrimary;
    }

    public String getHolderSecondary() {
        return holderSecondary;
    }

    public void setHolderSecondary(String holderSecondary) {
        this.holderSecondary = holderSecondary;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "JointAccount{" +
                "holderPrimary='" + holderPrimary + '\'' +
                ", holderSecondary='" + holderSecondary + '\'' +
                ", balance=" + balance +
                '}';
    }
}
