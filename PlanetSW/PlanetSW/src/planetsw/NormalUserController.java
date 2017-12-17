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
public class NormalUserController 
{
        public void buyProduct(PlanetDB p , NormalUser n) {
        Store s = new Store();
        Scanner w = new Scanner(System.in);
        System.out.println("enter StoreName : ");
        String StoreName = w.nextLine();
        boolean f = true;
        for (int i = 0; i < p.stores.size(); i++) 
        {
            if (p.stores.get(i).getName().equals(StoreName)) 
            {
                s = p.stores.get(i);
                System.out.println("found");
                f=false;
            }
        }
        if (f==true)
        {
            System.out.println("not exist!");
            return;
        }
        
        
        
            StoreController ss = new OfflineStoreController();
            ss.explore( s);
        
        System.out.print("Enter Product ID you want to  buy : ");
        int productID = w.nextInt();
        System.out.print("Enter the amount you  want to buy : ");
        int amount = w.nextInt();
      
        double money;
        if (s.type == true) {
            System.out.println("ofline");
            OfflineStore o = (OfflineStore) s;
            System.out.println("balance = "+n.getBalance());
            for (int i = 0; i < o.getArrayofproducts().size(); i++) {
                if (o.getArrayofproducts().get(i).getProductID() == productID) {
                    if (amount > o.getArrayofproducts().get(i).getAmount() ){
                        System.out.println("the amount you're asking is not available!");
                        return;
                    }
                    money = amount * (o.getArrayofproducts().get(i).getPrice());
                    if (n.getBalance() >= money) {
                        o.getArrayofproducts().get(i).setAmount(o.getArrayofproducts().get(i).getAmount() - amount);
                        o.getArrayofproducts().get(i).setBuyCounter(o.getArrayofproducts().get(i).getBuyCounter() + amount);
                        if (o.getArrayofproducts().get(i).getAmount()==0){
                            o.getArrayofproducts().remove(o.getArrayofproducts().get(i));
                        }
                        n.setBalance(n.getBalance()-money);
                        System.out.println("balance = "+n.getBalance());
                        for (int j = 0; j < p.registered.size(); j++) {
                            if (p.registered.get(j).type == "owner") {
                                Owner l = (Owner) p.registered.get(j);
                                if (l.getID() == o.getOwnerID()) {
                                    l.setBalance(l.getBalance() + money);
                                    break;
                                }
                            }
                        }
                        
                    }
                 else {
                    System.out.println("Your balnace is not enough!");
                    return;
                }
                }
            }
            System.out.println(s);
        } else {
            System.out.println("online");
            OnlineStore o = (OnlineStore) s;
            System.out.println("balance before = "+n.getBalance());
            for (int i = 0; i < o.getArrayofproducts().size(); i++) {
                if (o.getArrayofproducts().get(i).getProductID() == productID) {
                    if (amount > o.getArrayofproducts().get(i).getAmount() ){
                        System.out.println("the amount you're asking is not available!");
                        return;
                    }
                    money = amount * (o.getArrayofproducts().get(i).getPrice());
                    if (n.getBalance() >= money) {
                        o.getArrayofproducts().get(i).setAmount(o.getArrayofproducts().get(i).getAmount() - amount);
                        o.getArrayofproducts().get(i).setBuyCounter(o.getArrayofproducts().get(i).getBuyCounter() + amount);
                        if (o.getArrayofproducts().get(i).getAmount()==0){
                            o.getArrayofproducts().remove(o.getArrayofproducts().get(i));
                        }
                        n.setBalance(n.getBalance()-money);
                        System.out.println("balance after = "+n.getBalance());
                        for (int j = 0; j < p.registered.size(); j++) {
                            if (p.registered.get(j).type == "owner") {
                                Owner l = (Owner) p.registered.get(j);
                                if (l.getID() == o.getOwnerID()) {
                                    l.setBalance(l.getBalance() + money);
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Your balnace is not enough!");
                        return;
                    }
                }
            }
        }

    }

    public void SuggestProduct(PlanetDB ss) 
    {
        System.out.println("Enter Name of Product to suggest");
        Scanner sc = new Scanner(System.in);
        ss.suggestN.add(sc.nextLine());
    }

    public void BuyVoucher(PlanetDB x , NormalUser n) 
    {
        System.out.println("Enter Voucher Name: ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("Enter you cridet card number: ");
        String c = in.nextLine();
        if (c.length() != 8) {
            System.out.println("Unvalid number!!");
            return;
        }
        boolean h = true;
        for (int i = 0; i < x.vouchers.size(); i++) {
            System.out.println(x.vouchers.get(i).getName());
            if (x.vouchers.get(i).getName().equals(a) && x.vouchers.get(i).isAvl() == true) {
                n.setBalance(n.getBalance()+x.vouchers.get(i).getVal());

                h = false;
            }
        }
        if (h == true) {
            System.out.println("unvalid!!");
        }
    }

    
}
