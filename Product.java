package planetsw;

import java.util.Scanner;

public class Product 
{
    
    static int it=0;
    int ProductID=++it;
    private String name;
    private double price;
    private String category;
    private Brand BrandName;
    private boolean checkNormal;
    private int viewCounter=0;
    private int buyCounter=0;
    private int amount;
    private int OwnerID;
    private int storeID;
    

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setOwnerID(int OwnerID) {
        this.OwnerID = OwnerID;
    }

    public int getOwnerID() {
        return OwnerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrandName(Brand BrandName) {
        this.BrandName = BrandName;
    }

    public void setCheckNormal(boolean checkNormal) {
        this.checkNormal = checkNormal;
    }

    public void setViewCounter(int viewCounter) {
        this.viewCounter = viewCounter;
    }

    public void setBuyCounter(int buyCounter) {
        this.buyCounter = buyCounter;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Brand getBrandName() {
        return BrandName;
    }

    public boolean isCheckNormal() {
        return checkNormal;
    }

    public int getViewCounter() {
        return viewCounter;
    }

    public int getBuyCounter() {
        return buyCounter;
    }

    public int getAmount() {
        return amount;
    }

    public int getProductID() {
        return ProductID;
    }
    

     public void ViewSPD ()
    {
        Store s=new Store();
        System.out.println("Enter Product ID: ");
        Scanner in= new Scanner(System.in);
        int IDD=in.nextInt();
        boolean ar=true;
        if(s.isType()==true)
        {
            OfflineStore o= (OfflineStore) s;
            for (int i=0; i<o.getArrayofproducts().size(); i++)
            {
                if (o.getArrayofproducts().get(i).getProductID()==IDD)
                {
                    System.out.println("Product Name: " + o.getArrayofproducts().get(i).getName());
                    System.out.println("Product ID: " + o.getArrayofproducts().get(i).getProductID());
                    System.out.println("Product Brand name: " + o.getArrayofproducts().get(i).getBrandName());
                    System.out.println("Product category: " + o.getArrayofproducts().get(i).getCategory());
                    System.out.println("Product Amount: " + o.getArrayofproducts().get(i).getAmount());
                    System.out.println("Product Price: " + o.getArrayofproducts().get(i).getPrice());
                    o.getArrayofproducts().get(i).setViewCounter(o.getArrayofproducts().get(i).getViewCounter()+1);
                    ar=false;
                    break;
                }
            }
            if (ar==true)
                System.out.println("Product is not found!!");
        }
       else
        {
            OnlineStore o= (OnlineStore) s;
            for (int i=0; i<o.getArrayofproducts().size(); i++)
            {
                if (o.getArrayofproducts().get(i).getProductID()==IDD)
                {
                    System.out.println("Product Name: " + o.getArrayofproducts().get(i).getName());
                    System.out.println("Product ID: " + o.getArrayofproducts().get(i).getProductID());
                    System.out.println("Product Brand name: " + o.getArrayofproducts().get(i).getBrandName());
                    System.out.println("Product category: " + o.getArrayofproducts().get(i).getCategory());
                    System.out.println("Product Amount: " + o.getArrayofproducts().get(i).getAmount());
                    System.out.println("Product Price: " + o.getArrayofproducts().get(i).getPrice());
                    o.getArrayofproducts().get(i).setViewCounter(o.getArrayofproducts().get(i).getViewCounter()+1);
                    ar=false;
                    break;
                }
            }
            if (ar==true)
                System.out.println("Product is not found!!");
        }
    }
     public void GetMostViewed()
     {
         PlanetSW s=new PlanetSW();
         int temp=0;
                 
         for (int i=0; i<s.products.size(); i++ )
         {
             if (s.products.get(i).viewCounter >s.products.get(temp).viewCounter)
             {
                 temp=i;
                                 
             }
             
             System.out.println(s.products.get(temp).name);
         }
     }
}
