package planetsw;

import java.util.Scanner;

public class Voucher {
    
    static int it=0;
    int ID=++it;
    int Percentage;
    String name;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPercentage(int Percentage) {
        this.Percentage = Percentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public int getPercentage() {
        return Percentage;
    }

    public String getName() {
        return name;
    }

    
    public void AddVoucher()
    {
        Voucher v=new Voucher();
        System.out.println("Enter the name of the voucher: ");
        Scanner in=new Scanner(System.in);
        v.setName(in.nextLine());
        System.out.println("Enter the ID of the voucher: ");
        Scanner inn=new Scanner(System.in);
        v.setID(inn.nextInt());
        System.out.println("Enter the percentage of the voucher: ");
        Scanner ix=new Scanner(System.in);
        v.setPercentage(ix.nextInt());
        PlanetSW s=new PlanetSW();
        s.vouchers.add(v);
        
    }
}