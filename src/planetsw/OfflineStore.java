package planetsw;

import java.util.ArrayList;

public class OfflineStore extends Store {
    private String address;
    private ArrayList<OfflineProduct> arrayofproducts;

   public ArrayList<OfflineProduct> getArrayofproducts() {
        return arrayofproducts;
    }

    public void setArrayofproducts(ArrayList<OfflineProduct> arrayofproducts) {
        this.arrayofproducts = arrayofproducts;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
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
