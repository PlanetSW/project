package planetsw;

import java.util.Scanner;

public class Brand {
    private String name;
    private int OwnerID;
    private int counter;
    static int it=0;
    private int BrandID=++it;

    public void setName(String name) { this.name = name;}

    public void setOwnerID(int OwnerID) {this.OwnerID = OwnerID;}

    public void setCounter(int counter) {this.counter = counter;}

    public void setBrandID(int BrandID) {this.BrandID = BrandID; }

    public String getName() {return name;}

    public int getOwnerID() {return OwnerID;}

    public int getCounter() {return counter;}

    public int getBrandID() {return BrandID;}
    
}
