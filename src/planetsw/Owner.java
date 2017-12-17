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
    public void Suggestp()
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("For Offline Product press 1 for online Product press 2 : ");
        choice=sc.nextInt();
        if(choice==1)
        {
            String Brand;
            OfflineProduct NewProduct= new OfflineProduct(); 
            System.out.println("Enter Name of Product: ");
            NewProduct.setName(sc.nextLine());
            System.out.println("Enter Price of Produt: ");
            NewProduct.setPrice(sc.nextDouble());
            System.out.println("Enter Category of Produt: ");
            NewProduct.setCategory(sc.nextLine());
            System.out.println("Enter Amount of Product: ");
            NewProduct.setAmount(sc.nextInt());
            System.out.println("Enter BrandName of Product: ");
            Brand  = sc.nextLine();
            System.out.println("If added brand before press 1  ");
            choice =sc.nextInt();
            boolean x=true;
            if(choice==1)
            {
                System.out.println("Enter Name of Brand: ");
                Brand  = sc.nextLine();
                for(int j=0 ; j<arrayofbrand.size() ; j++)
                    if(Brand.equals(arrayofbrand.get(j).getName()))
                    {
                        x=false;
                        NewProduct.setBrandName(arrayofbrand.get(j));
                        break;
                    }
            }
       }
         else  if(choice==2)
       {
            String Brand;
            OnlineProduct NewProduct= new OnlineProduct(); 
            
            System.out.println("Enter Name of Product: ");
            NewProduct.setName(sc.nextLine());         
            System.out.println("Enter Price of Produt: ");
            NewProduct.setPrice(sc.nextDouble());
            System.out.println("Enter Category of Produt: ");
            NewProduct.setCategory(sc.nextLine());
            System.out.println("Enter Amount of Product: ");
            NewProduct.setAmount(sc.nextInt());
            System.out.println("Enter BrandName of Product: ");
            Brand  = sc.nextLine();
            System.out.println("If added brand befor press 1 rouh kalm l admin y3ml add brand el awl yala :D ");
            choice =sc.nextInt();
            boolean x=true;
            if(choice==1)
            {
                System.out.println("Enter Name of Brand: ");
                Brand  = sc.nextLine();
                for(int j=0 ; j<arrayofbrand.size() ; j++)
                    if(Brand.equals(arrayofbrand.get(j).getName()))
                    {
                        x=false;
                        NewProduct.setBrandName(arrayofbrand.get(j));
                        break;
                    }
       }
    }
        
    }
    
    public Product AddProduct()
    { 
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("For Offline Product press 1 for online Product press 2 : ");
        choice=sc.nextInt();
        if(choice==1)
        {
            String Brand;
            OfflineProduct NewProduct= new OfflineProduct(); 
            System.out.println("Enter Name of Product: ");
            NewProduct.setName(sc.nextLine());
            System.out.println("Enter ID of Store : ");
            int id=sc.nextInt();
            PlanetSW ss= new PlanetSW();
            for(int i=0 ; i<arrayofstores.size() ; i++)
            if(arrayofstores.get(i).getStoreID()==id)
            {
                OfflineStore f=(OfflineStore) arrayofstores.get(i);
                f.getArrayofproducts().add(NewProduct);
                
            }
            boolean y=false;
            for(int i=0 ; i<ss.products.size() ; i++)
            {   
                if(ss.products.get(i).getName().equals(NewProduct.getName()))
                    y=true;
            }
            if(y==false)
            {
               System.out.println("This product can't be added because this product wasnt added before");
               return null;
            }
            System.out.println("Enter Price of Produt: ");
            NewProduct.setPrice(sc.nextDouble());
            System.out.println("Enter Category of Produt: ");
            NewProduct.setCategory(sc.nextLine());
            System.out.println("Enter Amount of Product: ");
            NewProduct.setAmount(sc.nextInt());
            System.out.println("Enter BrandName of Product: ");
            Brand  = sc.nextLine();
            System.out.println("If added brand before press 1 else press 2 ");
            choice =sc.nextInt();
            boolean x=true;
            if(choice==1)
            {
                System.out.println("Enter Name of Brand: ");
                Brand  = sc.nextLine();
                for(int j=0 ; j<arrayofbrand.size() ; j++)
                    if(Brand.equals(arrayofbrand.get(j).getName()))
                    {
                        x=false;
                        NewProduct.setBrandName(arrayofbrand.get(j));
                        break;
                    }
                if(x==true)
                    System.out.println("Product will not be added please begin again because there is no brand !!!! ");
            }
                 return NewProduct;
       }
         else  if(choice==2)
       {
            String Brand;
            OnlineProduct NewProduct= new OnlineProduct(); 
            System.out.println("Enter Name of Product: ");
            NewProduct.setName(sc.nextLine());
            PlanetSW ss=new PlanetSW ();
            
            System.out.println("Enter ID of Store : ");
            int id=sc.nextInt();
            for(int i=0 ; i<arrayofstores.size() ; i++)
            if(arrayofstores.get(i).getStoreID()==id)
            {
                OnlineStore f=(OnlineStore) arrayofstores.get(i);
                f.getArrayofproducts().add(NewProduct);
                
            }
            boolean y=false;
            for(int i=0 ; i<ss.products.size() ; i++)
            {   
                if(ss.products.get(i).getName().equals(NewProduct.getName()))
                    y=true;
            }
            if(y==false)
            {
               System.out.println("This product can't be added because this product wasnt added before");
               return null;
            }
            System.out.println("Enter Price of Produt: ");
            NewProduct.setPrice(sc.nextDouble());
            System.out.println("Enter Category of Produt: ");
            NewProduct.setCategory(sc.nextLine());
            System.out.println("Enter Amount of Product: ");
            NewProduct.setAmount(sc.nextInt());
            System.out.println("Enter BrandName of Product: ");
            Brand  = sc.nextLine();
            System.out.println("If added brand befor press 1 else press 2 ");
            choice =sc.nextInt();
            boolean x=true;
            if(choice==2)
               ;// addbrand();
            else if(choice==1)
            {
                
                System.out.println("Enter Name of Brand: ");
                Brand  = sc.nextLine();
                for(int j=0 ; j<arrayofbrand.size() ; j++)
                    if(Brand.equals(arrayofbrand.get(j).getName()))
                    {
                        x=false;
                        NewProduct.setBrandName(arrayofbrand.get(j));
                        break;
                    }
                if(x==true)
                    System.out.println("Product will not be added please begin again because there is no brand !!!! ");
            }
            return NewProduct;
       }
            return null;   
}
    
public void Addstore() 
   {  
       String Brand;
        int choice;
        Scanner sc = new Scanner(System.in);
       System.out.println("For Offline Store press 1 for online Store press 2 : ");
       choice=sc.nextInt();
       if(choice==1)
       {
            OfflineStore s = new OfflineStore();
            s.type=true;
            System.out.println("Enter the name of the store: ");
            sc.skip("[\r\n]+");
            s.setName(sc.nextLine());
            System.out.println("Enter the address of the store: ");
            s.setAddress(sc.nextLine());
           //sc.skip("[\r\n]+");
            arrayofstores.add(s);
        }
       else if(choice==2)
       {
            OnlineStore s = new OnlineStore();
            s.type=false;
            System.out.print("Enter the name of the store: ");
             sc.skip("[\r\n]+");
            s.setName(sc.nextLine());
            arrayofstores.add(s);
            PlanetSW ss= new PlanetSW ();
            ss.stores.add(s);
        }
              
    }  

public void exploreNumberOfViews()
   {
       PlanetSW p = new PlanetSW ();
       Store s = new Store();
       Scanner sc = new Scanner(System.in);
       String storeName = sc.nextLine();
       for (int i=0 ; i < p.stores.size() ; i++){
            if (p.stores.get(i).getName().equals(storeName)){
                s=p.stores.get(i);
            }
        }
       Product x = new Product ();
       int productID = sc.nextInt();
        if(s.type == true)
        {
            OfflineStore o= (OfflineStore) s;
       for(int i =0; i< o.getArrayofproducts().size(); i++)
        {
            if (o.getArrayofproducts().get(i).getProductID()==productID){
                x=o.getArrayofproducts().get(i);
            }
        }
       System.out.println("veiw counter = "+x.getViewCounter());
        }
        else
        {
            OnlineStore o= (OnlineStore) s;
       for(int i =0; i< o.getArrayofproducts().size(); i++)
        {
            if (o.getArrayofproducts().get(i).getProductID()==productID){
                x=o.getArrayofproducts().get(i);
            }
        }
       System.out.println("veiw counter = "+x.getViewCounter());
        }
   }}

