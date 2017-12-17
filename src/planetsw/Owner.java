package planetsw;

import java.util.ArrayList;
import java.util.Scanner;

public class Owner extends User
{
    static int it=0;
    private double balance;
    private ArrayList <Store> arrayofstores;
    private ArrayList <Brand> arrayofbrand;
    private int ID=++it;
    private boolean premium;
    
    public Owner()
    {
        
        ArrayList<Store>s=new ArrayList<>();
        arrayofstores=s;
        ArrayList <Brand> arrayofb  = new ArrayList<>();
        arrayofbrand=arrayofb;
        
    }
    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
    
    

    public void setArrayofbrand(ArrayList<Brand> arrayofbrand) {
        this.arrayofbrand = arrayofbrand;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setArrayofstores(ArrayList<Store> arrayofstores) {
        this.arrayofstores = arrayofstores;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Store> getArrayofstores() {
        return arrayofstores;
    }

    public ArrayList<Brand> getArrayofbrand() {
        return arrayofbrand;
    }

    public int getID() 
    { 
        return ID; 
    }
    }

