import java.util.Date;
import java.util.Scanner;

public class Account {

    private int id;
    private double balance;
    private double annual_interest_rate;
    private Date date_created;

    Scanner sc= new Scanner(System.in);


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnual_interest_rate() {
        return annual_interest_rate;
    }

    public void setAnnual_interest_rate(double annual_interest_rate) {
        this.annual_interest_rate = annual_interest_rate;
    }

    public Date getDate_created() {
        return date_created;
    }


    public Account(int id, double balance, double annual_interest_rate) {
        this.id = id;
        this.balance = balance;
        this.annual_interest_rate = annual_interest_rate;
    }

    public boolean withdraw (double n)
    {
        System.out.println("Enter the amount to withdraw:");

        if (n <= balance)
        {
            System.out.println("Successfully withdraw");
            setBalance(balance-n);
            return true;
        }
        else
        {
            System.out.println("Insufficent balance");
            return false;
        }
    }
    public void deposit(double a)
    {
        setBalance(balance+a);
        System.out.println("successfully deposit");
    }

    public static void main(String[] args) {
        Account A =new Account(1,5000,5);
        A.withdraw(6000);
       // System.out.println( A.getBalance());
    }
}
