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
public class ProductController {
    
     public void ViewSPD (PlanetDB mar)
    {
        //Store s=new Store();
        System.out.println("Enter Product ID: ");
        Scanner in= new Scanner(System.in);
        int IDD=in.nextInt();
        boolean ar=true;
       // if(s.isType()==true)
        //{
            //OfflineStore o= (OfflineStore) s;
            //PlanetDB mar = new PlanetDB();
            for (int i=0; i<mar.products.size(); i++)
            {
                if (mar.products.get(i).getProductID()==IDD)
                {
                    System.out.println("Product Name: " + mar.products.get(i).getName());
                    System.out.println("Product ID: " + mar.products.get(i).getProductID());
                    System.out.println("Product Brand name: " + mar.products.get(i).getBrandName());
                    System.out.println("Product category: " + mar.products.get(i).getCategory());
                    System.out.println("Product Amount: " + mar.products.get(i).getAmount());
                    System.out.println("Product Price: " + mar.products.get(i).getPrice());
                    mar.products.get(i).setViewCounter(mar.products.get(i).getViewCounter()+1);
                    ar=false;
                    break;
                }
            }
            if (ar==true)
                System.out.println("Product is not found!!");
        /*}
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
        }*/
    }
     public void GetMostViewed(PlanetDB s)
     {
         int temp=0;
                 
         for (int i=0; i<s.products.size(); i++ )
         {
             if (s.products.get(i).getViewCounter() > s.products.get(temp).getViewCounter())
             {
                 temp=i;        
             }
             System.out.println(s.products.get(temp).getName());
         }
     }

}
