package planetsw;

import java.util.ArrayList;

public class OfflineStore extends Store {
    private String address;
    private ArrayList<OfflineProduct> arrayofproducts;
    public ArrayList<OfflineProduct> getArrayofproducts() {return arrayofproducts;}
    public OfflineStore()
    {
        ArrayList<OfflineProduct> arrayofproductss= new ArrayList<>(); 
        arrayofproducts=arrayofproductss;
    }
    public void setArrayofproducts(ArrayList<OfflineProduct> arrayofproducts) {this.arrayofproducts = arrayofproducts;}
    
    public void setAddress(String address) {this.address = address;}

    public String getAddress() {return address;}
   
   
}
