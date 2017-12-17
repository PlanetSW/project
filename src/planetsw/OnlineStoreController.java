/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetsw;

/**
 *
 * @author maria
 */
public class OnlineStoreController extends StoreController 
{
     public void explore(Store oo)
    {
        OnlineStore o=(OnlineStore) oo;
        System.out.println("Products");
        for(int i =0; i< o.getArrayofproducts().size(); i++)
        {
            System.out.println("Product Name : " + o.getArrayofproducts().get(i).getName()+"  ");
            System.out.println("Product ID : " + o.getArrayofproducts().get(i).getProductID()+"  ");
            System.out.println("Product price : " +o. getArrayofproducts().get(i).getPrice()+"  ");
            o.getArrayofproducts().get(i).setViewCounter(o.getArrayofproducts().get(i).getViewCounter()+1);
        }
    }
}
