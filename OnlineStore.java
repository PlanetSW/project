package planetsw;

import java.util.ArrayList;

public class OnlineStore extends Store {
    
    private ArrayList<OnlineProduct> arrayofproducts;

    public ArrayList<OnlineProduct> getArrayofproducts() {
        return arrayofproducts;
    }

    public void setArrayofproducts(ArrayList<OnlineProduct> arrayofproducts) {
        this.arrayofproducts = arrayofproducts;
    }
     public void explore()
    {
        System.out.println("Products");
        for(int i =0; i< getArrayofproducts().size(); i++)
        {
            System.out.print(getArrayofproducts().get(i).getName()+"  ");
            System.out.print(getArrayofproducts().get(i).getProductID()+"  ");
            System.out.print(getArrayofproducts().get(i).getPrice()+"  ");
            //getArrayofproducts().get(i).setViewCounter(getArrayofproducts().get(i).getViewCounter()+1);
        }
    }
}
