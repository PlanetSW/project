package planetsw;
//m
import java.util.Scanner;


public class Admin extends User
{
    void viewsuggest()
    {
        PlanetSW ss=new PlanetSW();
        System.out.println("Normal Suggestion : ");
        int i=0;
        Scanner sc = new Scanner(System.in);
        for(i=0 ; i<ss.suggestN.size() ; i++)
        {
            System.out.println(i+1+"  "+ss.suggestN.get(i));
            System.out.println("To Confirm product enter Yes , to reject enter No ");
            String con = sc.nextLine();
            if (con.equals("Yes")){
            Product p = new Product();
            p.setName(ss.suggestN.get(i));
            ss.products.add(p);
            }
        }
        
            System.out.println("Owner Suggestion : ");
        for(i=0 ; i<ss.suggesto.size() ; i++)
        {
            System.out.println(i+1+"  "+ss.suggesto.get(i).getName());
            System.out.println(i+1+"  "+ss.suggesto.get(i).getBrandName());
            System.out.println(i+1+"  "+ss.suggesto.get(i).getCategory());
            System.out.println(i+1+"  "+ss.suggesto.get(i).getPrice());
            System.out.println(i+1+"  "+ss.suggesto.get(i).getAmount());
            System.out.println("To Confirm product enter Yes , to reject enter No ");
            String con = sc.nextLine();
            if (con.equals("Yes")){
            Product p = new Product();
            p.setName(ss.suggesto.get(i).getName());
            p.setBrandName(ss.suggesto.get(i).getBrandName());
            p.setCategory(ss.suggesto.get(i).getCategory());
            p.setPrice(ss.suggesto.get(i).getPrice());
            p.setAmount(ss.suggesto.get(i).getAmount());
            ss.products.add(p);
            for(int j=0 ; j<ss.registered.size() ; j++)
            {
                Owner o=(Owner) ss.registered.get(j);   
                if(o.getID()==ss.suggesto.get(i).getOwnerID())
                {
                    for(int k=0 ; k<o.getArrayofstores().size() ; k++)
                    {
                        if(o.getArrayofstores().get(k).getStoreID()==ss.suggesto.get(j).getStoreID())
                        {
                            if( o.getArrayofstores().get(k).isType()==true)
                            {
                                Store sss=(o.getArrayofstores().get(k));
                                OfflineStore z=(OfflineStore) sss ;
                                z.getArrayofproducts().add((OfflineProduct) ss.suggesto.get(j));
                            }
                                        
                            
                            else
                            {
                                Store sss=(o.getArrayofstores().get(k));
                                OnlineStore z=(OnlineStore) sss ;
                                z.getArrayofproducts().add((OnlineProduct) ss.suggesto.get(j));
                            }
                        }
                             
                    }
                }
            }
            }
        }
        
        
        
    }
    
}
