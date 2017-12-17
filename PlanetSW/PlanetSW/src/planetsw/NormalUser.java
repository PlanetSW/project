package planetsw;

import java.util.Scanner;

public class NormalUser extends User 
{

    static int it = 0;
    int ID = ++it;
    double  balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


}
