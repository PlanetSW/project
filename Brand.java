package planetsw;

import java.util.Scanner;

public class Brand {
    private String name;
    private int OwnerID;
    private int counter;
    static int it=0;
    private int BrandID=++it;

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerID(int OwnerID) {
        this.OwnerID = OwnerID;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setBrandID(int BrandID) {
        this.BrandID = BrandID;
    }

    public String getName() {
        return name;
    }

    public int getOwnerID() {
        return OwnerID;
    }

    public int getCounter() {
        return counter;
    }

    public int getBrandID() {
        return BrandID;
    }
    
    public Brand AddBrand()
    {
        PlanetSW s = new PlanetSW();
        Brand newb=new Brand();
        System.out.println("Enter the name of the Brand: ");
        Scanner in=new Scanner(System.in);
        String x=in.nextLine();
        newb.setName(x);
        System.out.println("Enter the Owner ID: ");
        Scanner inn=new Scanner(System.in);
        int xx=inn.nextInt();
        newb.setOwnerID(xx);
        boolean f=true;
        for (int i=0;i< s.registered.size(); i++)
        {
            
            if (s.registered.get(i).getType()=="owner" )
            {
                Owner o=new Owner();
                o=(Owner)s.registered.get(i);
                if (o.getID()==xx)
                {
                    o.getArrayofbrand().add(newb);
                    f=false;
                    break;
                
                }
               
            }
        }
        if (f==true)
        {
            System.out.println("Wrong ID!!");
        }
        return null;
   
            
        
        
    }
     
}
