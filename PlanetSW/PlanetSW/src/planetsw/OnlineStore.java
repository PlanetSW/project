package planetsw;

import java.util.ArrayList;

public class OnlineStore extends Store {
    
    private ArrayList<OnlineProduct> arrayofproducts;
    OnlineStore()
    {
         ArrayList<OnlineProduct> arrayofproductss=new ArrayList<>();
         arrayofproducts=arrayofproductss;
    }
    public ArrayList<OnlineProduct> getArrayofproducts() {
        return arrayofproducts;
    }

    public void setArrayofproducts(ArrayList<OnlineProduct> arrayofproducts) {
        this.arrayofproducts = arrayofproducts;
    }
    
}
