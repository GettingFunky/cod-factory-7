package gr.aueb.cf.ch13.bankAppVag.model;

/**
 * Represents a bank account with an overdraft feature, allowing
 * withdrawals beyond the current balance up to a specified limit.
 */
public class OverdraftAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public OverdraftAccount() {
    }

    public OverdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Withdraws a specified amount from the account balance.
     *
     * @param amount the amount to withdraw
     * @return a message indicating success or failure of the withdrawal
     * @throws Exception if the amount is negative
     */
    public String Overdraft(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("The amount must not be negative.");
        }
        if (balance - amount < -1000) { // Υποθέτουμε όριο overdraft
            return "Withdrawal denied. Exceeds overdraft limit.";
        }
        balance -= amount;
        return "Amount " + amount + " successfully withdrawn. Remaining balance: " + balance;
    }
}
