package planetsw;

import java.util.ArrayList;

public class Store 
{
    private String name;
    static int it=0;
    private int StoreID=++it;
    private String Address;
    boolean type;

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
    
    public void setName(String name) {
        this.name = name;
    }

   /* public void setArrayofproducts(ArrayList<Product> arrayofproducts) {
        this.arrayofproducts = arrayofproducts;
    }
*/
    public void setStoreID(int StoreID) {
        this.StoreID = StoreID;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getName() {
        return name;
    }

  /*  public ArrayList<Product> getArrayofproducts() {
        return arrayofproducts;
    }
*/
    public int getStoreID() {
        return StoreID;
    }

    public String getAddress() {
        return Address;
    }
       public void explore()
    {
    }
    
   
}
