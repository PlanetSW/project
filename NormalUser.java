package planetsw;

import java.util.Scanner;

public class NormalUser extends User 
{
    static int it=0;
    int ID=++it;
    
    public void buyProduct()
    {
        PlanetSW p = new PlanetSW();
        Store s = new Store();
        Scanner w = new Scanner (System.in);
        System.out.println("enter StoreName : ");
        String StoreName = w.nextLine();
        for (int i=0 ; i < p.stores.size() ; i++){
            if (p.stores.get(i).getName().equals(StoreName)){
                s=p.stores.get(i);
            }
        }
        s.explore();
        System.out.print("Enter Product ID you want to  buy : ");
        int productID = w.nextInt();
        System.out.print("Enter the amount you  want to buy : ");
        int amount = w.nextInt();
        if(s.type == true)
        {
            OfflineStore o= (OfflineStore) s;
        
        for(int i =0; i< o.getArrayofproducts().size(); i++)
        {
            if (o.getArrayofproducts().get(i).getProductID()==productID){
                o.getArrayofproducts().get(i).setAmount(o.getArrayofproducts().get(i).getAmount() - amount);
                o.getArrayofproducts().get(i).setBuyCounter(o.getArrayofproducts().get(i).getBuyCounter() + amount);
            }
        }
        System.out.println(s);}
        else
        {
            OnlineStore o= (OnlineStore) s;
        
        for(int i =0; i< o.getArrayofproducts().size(); i++)
        {
            if (o.getArrayofproducts().get(i).getProductID()==productID){
                o.getArrayofproducts().get(i).setAmount(o.getArrayofproducts().get(i).getAmount() - amount);
                o.getArrayofproducts().get(i).setBuyCounter(o.getArrayofproducts().get(i).getBuyCounter() + amount);
            }
        }}
    }
    void SuggestProduct()
    {
        System.out.println("Enter Name of Product to suggest");
        Scanner sc=new Scanner(System.in);
        PlanetSW ss=new PlanetSW();
        ss.suggestN.add( sc.nextLine());
    }
    
    
}
