package planetsw;

import java.util.Scanner;

public class Voucher {
    
    static int it=0;
    int ID=++it;
    int val;
    boolean Avl;
    String name;

    public int getVal() {return val;}

    public void setVal(int val) {this.val = val;}
    
    
    public Voucher ()
    {
        Avl=true;
    }
   

    public void setAvl(boolean Avl) {this.Avl = Avl;}

    public boolean isAvl() {return Avl;}
    
    public void setID(int ID) {this.ID = ID;}

    public void setName(String name) {this.name = name;}

    public int getID() {return ID;}

    public String getName() {return name;}
    
    
}