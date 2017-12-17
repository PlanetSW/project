/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetsw;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class OwnerController 
{
public void Suggestp(PlanetDB mar , Owner oo)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("For Offline Product press 1 for online Product press 2 : ");
        choice=sc.nextInt();
        if(choice==1)
        {
            String Brand;
            OfflineProduct NewProduct= new OfflineProduct();
            NewProduct.setOwnerID(oo.getID());
            System.out.println("Enter Name of Product: ");
            sc.skip("[\r\n]+");
            NewProduct.setName(sc.nextLine());
            System.out.println("Enter Price of Produt: ");
            NewProduct.setPrice(sc.nextDouble());
            System.out.println("Enter Category of Produt: ");
            sc.skip("[\r\n]+");
            NewProduct.setCategory(sc.nextLine());
            System.out.println("Enter Amount of Product: ");
            NewProduct.setAmount(sc.nextInt());
            boolean x=true;
                System.out.println("Enter Name of Brand: ");
                sc.skip("[\r\n]+");
                Brand  = sc.nextLine();
                for(int j=0 ; j<oo.getArrayofbrand().size() ; j++)
                    if(Brand.equals(oo.getArrayofbrand().get(j).getName()))
                    {
                        x=false;
                        NewProduct.setBrandName(oo.getArrayofbrand().get(j));
                        mar.suggesto.add(NewProduct);
                        break;
                    }
                if(x==true)
                    System.out.println("Cant be added because this brand is not avabliable");
            }
       
         else  if(choice==2)
       {
            String Brand;
            OnlineProduct NewProduct= new OnlineProduct();
            NewProduct.setOwnerID(oo.getID());
            System.out.println("Enter Name of Product: ");
            sc.skip("[\r\n]+");
            NewProduct.setName(sc.nextLine());         
            System.out.println("Enter Price of Produt: ");
            NewProduct.setPrice(sc.nextDouble());
            System.out.println("Enter Category of Produt: ");
            sc.skip("[\r\n]+");
            NewProduct.setCategory(sc.nextLine());
            System.out.println("Enter Amount of Product: ");
            NewProduct.setAmount(sc.nextInt());
            
            boolean x=true;
           
                System.out.println("Enter Name of Brand: ");
                sc.skip("[\r\n]+");
                Brand  = sc.nextLine();
                for(int j=0 ; j<oo.getArrayofbrand().size() ; j++)
                    if(Brand.equals(oo.getArrayofbrand().get(j).getName()))
                    {
                        x=false;
                        NewProduct.setBrandName(oo.getArrayofbrand().get(j));
                        mar.suggesto.add(NewProduct);
                        break;
                    }
          
                if(x==true)
                    System.out.println("Cant be added because this brand is not avabliable");      
       
    }
        
    }
    
    public Product AddProduct(PlanetDB mar , Owner oo)
    { 
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("For Offline Product press 1 for online Product press 2 : ");
        choice=sc.nextInt();
        if(choice==1)
        {
            String Brand;
            OfflineStore f = new OfflineStore();
            OfflineProduct NewProduct= new OfflineProduct(); 
            System.out.println("STORES");
            for (int i = 0; i < oo.getArrayofstores().size(); i++) {
                System.out.println(oo.getArrayofstores().get(i).getName());
                System.out.println(oo.getArrayofstores().get(i).getStoreID());
            }
            System.out.println("Enter Name of Product: ");
              sc.skip("[\r\n]+");
            NewProduct.setName(sc.nextLine());
            System.out.println("Enter ID of Store : ");
            int id=sc.nextInt();
            boolean p=true;
            for(int i=0 ; i<oo.getArrayofstores().size() ; i++){
            if(oo.getArrayofstores().get(i).getStoreID()==id)
            {
                f=(OfflineStore) oo.getArrayofstores().get(i);
                p=false;
            }}
            if(p==true){
                System.out.println("This Store wasn't found.");
                return null;
            }
            boolean y=false;
            for(int i=0 ; i<mar.products.size() ; i++)
            {   
                if(mar.products.get(i).getName().equals(NewProduct.getName()))
                    y=true;
            }
            if(y==true)
            {
               System.out.println("This product can't be added because this product was added before");
               return null;
            }
            System.out.println("Enter Price of Produt: ");
            NewProduct.setPrice(sc.nextDouble());
            System.out.println("Enter Category of Produt: ");
            sc.skip("[\r\n]+");
            NewProduct.setCategory(sc.nextLine());
            System.out.println("Enter Amount of Product: ");
            NewProduct.setAmount(sc.nextInt());
            System.out.println("Enter BrandName of Product: ");
            sc.skip("[\r\n]+");
            Brand  = sc.nextLine();
            boolean x=true;
                for(int j=0 ; j<oo.getArrayofbrand().size() ; j++)
                    if(Brand.equals(oo.getArrayofbrand().get(j).getName()))
                    {
                        x=false;
                        NewProduct.setBrandName(oo.getArrayofbrand().get(j));
                        break;
                    }
                if(x==true){
                    System.out.println("Product will not be added please begin again because there is no brand !!!! ");
                    return null;
                }
            //arrayofproduct.add(NewProduct);
            f.getArrayofproducts().add(NewProduct);
            mar.products.add(NewProduct);
            return NewProduct;
       }
         else  if(choice==2)
       {
            String Brand;
            OnlineStore f = new OnlineStore();
            OnlineProduct NewProduct= new OnlineProduct(); 
            System.out.println("Enter Name of Product: ");
            NewProduct.setName(sc.nextLine());
            
            System.out.println("Enter ID of Store : ");
            int id=sc.nextInt();
            boolean p=true;
            for(int i=0 ; i<oo.getArrayofstores().size() ; i++){
            if(oo.getArrayofstores().get(i).getStoreID()==id)
            {
                f=(OnlineStore) oo.getArrayofstores().get(i);
                p=false;
                
            }}
            if (p==true){
                System.out.println("This Store wasn't found.");
                return null;
            }
            boolean y=false;
            for(int i=0 ; i<mar.products.size() ; i++)
            {   
                if(mar.products.get(i).getName().equals(NewProduct.getName()))
                    y=true;
            }
            if(y==true)
            {
               System.out.println("This product can't be added because this product was added before");
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
            boolean x=true;
                for(int j=0 ; j<oo.getArrayofbrand().size() ; j++)
                    if(Brand.equals(oo.getArrayofbrand().get(j).getName()))
                    {
                        x=false;
                        NewProduct.setBrandName(oo.getArrayofbrand().get(j));
                        break;
                    }
                if(x==true){
                    System.out.println("Product will not be added please begin again because there is no brand !!!! ");
                    return null;
       }
            mar.products.add(NewProduct);
            f.getArrayofproducts().add(NewProduct);
            return NewProduct;
       }
            return null;   
            
}
    
public void Addstore(PlanetDB ss, Owner o) 
   {  
       String Brand;
        int choice;
        Scanner sc = new Scanner(System.in);
       System.out.println("For Offline Store press 1 for online Store press 2 : ");
       choice=sc.nextInt();
       if(choice==1)
       {
            OfflineStore s = new OfflineStore();
            s.setOwnerID(o.getID());
            s.type=true;
            System.out.println("Enter the name of the store: ");
            sc.skip("[\r\n]+");
            s.setName(sc.nextLine());
            System.out.println("Enter the address of the store: ");
            s.setAddress(sc.nextLine());
            System.out.println("STORE ID = "+ s.getStoreID());
            o.getArrayofstores().add(s);
            ss.stores.add(s);
        }
       else if(choice==2)
       {
            OnlineStore s = new OnlineStore();
            s.setOwnerID(o.getID());
            s.type=false;
            System.out.print("Enter the name of the store: ");
             sc.skip("[\r\n]+");
            s.setName(sc.nextLine());
            o.getArrayofstores().add(s);
            ss.stores.add(s);
        }
              
    }  

public void exploreNumberOfViews( PlanetDB p )
   {
       Store s = new Store();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Store Name : ");
       String storeName = sc.nextLine();
       for (int i=0 ; i < p.stores.size() ; i++){
            if (p.stores.get(i).getName().equals(storeName)){
                s=p.stores.get(i);
            }
        }
       Product x = new Product ();
       System.out.println("Enter Product ID :");
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
   }    
}
