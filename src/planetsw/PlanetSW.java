package planetsw;
/* authors Mariam Adham 
* Mariam Ehab
* Nour Adel
* Nagham Sherif 
* Marwa Belal */ 

import java.util.ArrayList;
import java.util.Scanner;

public class PlanetSW {

    public static void main(String[] args) {

        PlanetDB db = new PlanetDB();
        PlanetSW p = new PlanetSW();
        User u = new User();
        NormalUser nu = new NormalUser();
        UserControler uc = new UserControler();
        StoreController sc = new StoreController();
        NormalUserController nuc = new NormalUserController();
        Brandcontroller bc = new Brandcontroller();
        OwnerController oc = new OwnerController();
        ProductController pc = new ProductController();
        VoucherController vc = new VoucherController();
        Admin aa = new Admin();
        Owner ow = new Owner();
        Brand b = new Brand();
        Store s2 = new Store();
        ow.setName("hagar");
        ow.setPassword("h");
        ow.setID(1);
        ow.setEmail("hagar@gmail.com");
        ow.setPremium(true);
        ow.setType("owner");
        db.registered.add(ow);
        nu.setName("nour");
        nu.setPassword("n");
        nu.setEmail("nour@gmail.com");
        nu.setType("NormalUser");
        db.registered.add(nu);
        aa.setName("mariam");
        aa.setPassword("m");
        aa.setEmail("mariam@gmail.com");
        aa.setType("admin");
        db.registered.add(aa);
        Scanner a = new Scanner(System.in);
        int m = 0;
        int num;
        boolean check = false;
        while (true) {
            ///////////////////////////////////////////////////////////////////////////
            System.out.println("Users");
            for (int i = 0; i < db.registered.size(); i++) {
                System.out.println("Name : "+db.registered.get(i).getName());
                System.out.println("Email : "+db.registered.get(i).getEmail());
                System.out.println("Password : "+db.registered.get(i).getPassword());
                System.out.println("Type : "+db.registered.get(i).getType());
                System.out.println("------------------------------------------------------------------------------");
            }
            System.out.println("Stores");
            for (int i = 0; i < db.stores.size(); i++) {
                System.out.println("Name : "+db.stores.get(i).getName());
                System.out.println("ID : "+db.stores.get(i).getStoreID());
                System.out.println("Owner ID : "+db.stores.get(i).getOwnerID());
                //System.out.println(db.stores.get(i).getAddress());
                //System.out.println(db.stores.get(i).isType());
                System.out.println("------------------------------------------------------------------------------");
            }
            System.out.println("Brands");
            for (int i = 0; i < db.brands.size(); i++) {
                System.out.println("Name : "+db.brands.get(i).getName());
                System.out.println("ID : "+db.brands.get(i).getBrandID());
                System.out.println("Owner ID : "+db.brands.get(i).getOwnerID());
                //System.out.println(db.brands.get(i).getCounter());
                System.out.println("------------------------------------------------------------------------------");
            }
            System.out.println("products");
            for (int i = 0; i < db.products.size(); i++) {
                System.out.println("Name : "+db.products.get(i).getName());
                System.out.println("ID : "+db.products.get(i).getProductID());
                //System.out.println(db.products.get(i).getOwnerID());
                //System.out.println(db.products.get(i).getBrandName());
                System.out.println("Price : "+db.products.get(i).getPrice());
                //System.out.println(db.products.get(i).getCategory());
                //System.out.println(db.products.get(i).getAmount());
                //System.out.println(db.products.get(i).getBuyCounter());
                //System.out.println(db.products.get(i).getStoreID());
                //System.out.println(db.products.get(i).getViewCounter());
                System.out.println("------------------------------------------------------------------------------");
            }
            System.out.println("Vouchers");
            for (int i = 0; i < db.vouchers.size(); i++) {
                System.out.println("Name : "+db.vouchers.get(i).getName());
                System.out.println("ID : "+db.vouchers.get(i).getID());
                //System.out.println(db.vouchers.get(i).getVal());
                //System.out.println(db.vouchers.get(i).isAvl());
                System.out.println("------------------------------------------------------------------------------");
            }
            System.out.println("SuggestedO");
            for (int i = 0; i < db.suggesto.size(); i++) {
                System.out.println("Name : "+db.suggesto.get(i).getName());
                //System.out.println(db.suggesto.get(i).getAmount());
                //System.out.println(db.suggesto.get(i).getStoreID());
                //System.out.println(db.suggesto.get(i).getProductID());
                //System.out.println(db.suggesto.get(i).getOwnerID());
                //System.out.println(db.suggesto.get(i).getBrandName());
                System.out.println("------------------------------------------------------------------------------");
            }
            //////////////////////////////////////////////////////////////////////////
            System.out.println("1. Register ");
            System.out.println("2. Log In ");
            System.out.println("3. Exit ");
            num = a.nextInt();
            if (num == 1) {
                u = uc.register(db);
                check = true;
            } else if (num == 2) {
                String n, pw, type;
                u = uc.LogIN(db);
                if (u != null) {
                    check = true;
                }
            } else if (num == 3) {
                break;
            }
            while (check == true) {
                if (u.type == "owner") {
                    System.out.println("1. Add Store.");
                    System.out.println("2. Suggest Product.");
                    System.out.println("3. Add Product to Store.");
                    System.out.println("4. Explore Products in Store.");
                    System.out.println("5. View Specific Product.");
                    System.out.println("6. Log Out.");
                    Owner o = (Owner) u;
                    if (o.isPremium() == true) {
                        System.out.println("7. Explore Number of views for each Product.");
                        System.out.println("8. Get the most view Product.");

                    }
                    m = a.nextInt();
                    switch (m) {
                        case 1:
                            oc.Addstore(db, o);
                            break;
                        case 2:
                            oc.Suggestp(db, o);
                            break;
                        case 3:
                            oc.AddProduct(db, o);
                            break;
                        case 4:
                            System.out.println("Enter Id of the Store : ");
                            int id = a.nextInt();
                            for (int j = 0; j < db.stores.size(); j++) {
                                if (db.stores.get(j).getStoreID() == id) {
                                    sc.explore(db.stores.get(j));

                                }
                            }
                            break;
                        case 5:
                            pc.ViewSPD(db);
                            break;
                        case 6:
                            check = false;
                            break;
                        case 7:
                            oc.exploreNumberOfViews(db);
                            break;
                        case 8:
                            pc.GetMostViewed(db);
                    }
                } else if (u.type == "NormalUser") {
                    System.out.println("1. Buy Product.");
                    System.out.println("2. Explore Products.");
                    System.out.println("3. Suggest Product.");
                    System.out.println("4. view specific products deatils.");
                    System.out.println("5. Buy Voucher");
                    System.out.println("6. Log Out.");
                    NormalUser o = (NormalUser) u;
                    m = a.nextInt();
                    switch (m) {
                        case 1:
                            nuc.buyProduct(db, o);
                            break;
                        case 2:
                            System.out.println("Enter id of the store : ");
                            int id = a.nextInt();
                            for (int j = 0; j < db.stores.size(); j++) {
                                if (db.stores.get(j).getStoreID() == id) {
                                    sc.explore(db.stores.get(j));
                                    System.out.println("heyyyy");
                                }
                            }
                            break;
                        case 3:
                            nuc.SuggestProduct(db);
                            break;
                        case 4:
                            Product pr = new Product();
                            pc.ViewSPD(db);
                            break;
                        case 5:
                            nuc.BuyVoucher(db, o);
                            break;
                        case 6:
                            check = false;
                            break;
                    }
                } else {
                    System.out.println("1. Add product to the system.");
                    System.out.println("2. Add brand.");
                    System.out.println("3. Explore products in Store.");
                    System.out.println("4. View specific Products.");
                    System.out.println("5. Provide Voucher.");
                    System.out.println("6. Log Out.");
                    Admin o = (Admin) u;
                    m = a.nextInt();
                    switch (m) {
                        case 1:
                            o.viewsuggest(db);
                            break;
                        case 2:
                            bc.AddBrand(db);
                            break;
                        case 3:
                            System.out.println("Enter id of the store : ");
                            int id = a.nextInt();
                            for (int j = 0; j < db.stores.size(); j++) {
                                if (db.stores.get(j).getStoreID() == id) {
                                    sc.explore(db.stores.get(j));
                                }
                            }
                            break;
                        case 4:
                            pc.ViewSPD(db);
                            break;
                        case 5:
                            vc.AddVoucher(db);
                            break;
                        case 6:
                            check = false;
                            break;
                    }

                }
            }
            if (num == 3) {
                break;
            }

        }
    }
}
