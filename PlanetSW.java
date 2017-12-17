package planetsw;

import java.util.ArrayList;
import java.util.Scanner;

public class PlanetSW {

    public static ArrayList<Product> products = new ArrayList<>();
    public static ArrayList<Product> suggesto = new ArrayList<>();
    public static ArrayList<String> suggestN = new ArrayList<>();
    public static ArrayList<User> registered = new ArrayList<>();
    public static ArrayList<Store> stores = new ArrayList<>();
    public static ArrayList<Voucher> vouchers = new ArrayList<>();

    public String LogIN() {
        String name, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = s.nextLine();
        System.out.print("Enter Password : ");
        password = s.nextLine();
        for (int i = 0; i < registered.size(); i++) {
            if (registered.get(i).getName().equals(name) && registered.get(i).getPassword().equals(password)) {
                System.out.println("Found");
                return (registered.get(i).getType());

            }
        }

        System.out.println("Not Found.");
        return ("");

    }

    public User register() {
        System.out.println("Register as an Owner enter 1 ");
        System.out.println("Register as an User enter 2 ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String name, password, mail;
        if (n == 1) {
            Owner o = new Owner();
            System.out.println("Enter Name : ");
            s.skip("[\r\n]+");
            name = s.nextLine();
            System.out.print("Enter Password : ");
            password = s.nextLine();
            System.out.print("Enter mail : ");
            mail = s.nextLine();
            System.out.println("Are you Premium if yes enter True , if no enter False?");
            o.setPremium(s.nextBoolean());
            o.setName(name);
            o.setEmail(mail);
            o.setPassword(password);
            o.setType("owner");
            registered.add(o);
            return o;
        } else if (n == 2) {
            NormalUser nU = new NormalUser();
            System.out.print("Enter Name : ");
            s.skip("[\r\n]+");
            name = s.nextLine();
            System.out.print("Enter Password : ");
            password = s.nextLine();
            System.out.print("Enter mail : ");
            mail = s.nextLine();
            nU.setName(name);
            nU.setEmail(mail);
            nU.setPassword(password);
            nU.setType("NormalUser");
            registered.add(nU);
            return nU;
        }
        return null;
    }

    public static void main(String[] args) {
        int m = 0;
        PlanetSW p = new PlanetSW();
        User u = new User();
        Scanner a = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("1. Register ");
            System.out.println("2. Log In ");
            num = a.nextInt();
            if (num == 1) {
                u = p.register();
                if (u.type == "owner") {
                    System.out.println("1. Add Store.");
                    System.out.println("2. Suggest Product.");
                    System.out.println("3. Add Product to Store.");
                    System.out.println("4. Explore Products in Store.");
                    System.out.println("5. View Specific Product.");
                    Owner o = (Owner) u;
                    if (o.isPremium() == true) {
                        System.out.println("6. Explore Number of views for each Product.");
                        System.out.println("7. Get the most view Product.");

                    }
                    m = a.nextInt();
                    switch (m) {
                        case 1:
                            o.Addstore();
                            break;
                        case 2:
                            o.Suggestp();
                            break;
                        case 3:
                            o.AddProduct();
                            break;
                        case 4:
                            int id = a.nextInt();
                            for (int j = 0; j < stores.size(); j++) {
                                if (stores.get(j).getStoreID() == id) {
                                    stores.get(j).explore();
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Enter product ID: ");
                            Scanner in = new Scanner(System.in);
                            Store sar = new Store();
                            int IDD = in.nextInt();
                            boolean ar = true;
                            if (sar.isType() == true) {
                                OfflineStore oo = (OfflineStore) sar;
                                for (int i = 0; i < oo.getArrayofproducts().size(); i++) {
                                    if (oo.getArrayofproducts().get(i).getProductID() == IDD) {
                                        oo.getArrayofproducts().get(i).ViewSPD();
                                    }
                                }
                        //case 6:
                                //case 7:

                            }
                    }
                }
                if (num == 2) {
                    String n, pw, type;
                    n = a.nextLine();
                    pw = a.nextLine();
                    type = p.LogIN();
                    if (type == "owner") {
                        System.out.println("1. Add Store.");
                        System.out.println("2. Suggest Product.");
                        System.out.println("3. Add Product to Store.");
                        System.out.println("4. Explore Products in Store.");
                        System.out.println("5. View Specific Product.");
                        System.out.println("8. Log Out");
                        Owner o = (Owner) u;
                        if (o.isPremium() == true) {
                            System.out.println("6. Explore Number of views for each Product.");
                            System.out.println("7. Get the most view Product.");

                        }
                        m = a.nextInt();
                        switch (m) {
                            case 1:
                                o.Addstore();
                                break;
                            case 2:
                                o.Suggestp();
                                break;
                            case 3:
                                o.AddProduct();
                                break;
                            case 4:
                                int id = a.nextInt();
                                for (int j = 0; j < stores.size(); j++) {
                                    if (stores.get(j).getStoreID() == id) {
                                        stores.get(j).explore();
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Enter product ID: ");
                                Scanner in = new Scanner(System.in);
                                Store sar = new Store();
                                int IDD = in.nextInt();
                                boolean ar = true;
                                if (sar.isType() == true) {
                                    OfflineStore oo = (OfflineStore) sar;
                                    for (int i = 0; i < oo.getArrayofproducts().size(); i++) {
                                        if (oo.getArrayofproducts().get(i).getProductID() == IDD) {
                                            oo.getArrayofproducts().get(i).ViewSPD();
                                        }
                                    }
                                }
                                break;
                            case 6:
                                o.exploreNumberOfViews();
                                break;
                            case 7:
                            case 8:
                                break;

                        }

                    } else {
                        System.out.println("1. Buy Product.");
                        System.out.println("2. Explore Products.");
                        System.out.println("3. Suggest Product.");
                        System.out.println("4. view specific products deatils.");
                        NormalUser o = (NormalUser) u;
                        m = a.nextInt();
                        switch (m) {
                            case 1:
                                o.buyProduct();
                                break;
                            case 2:
                                int id = a.nextInt();
                                for (int j = 0; j < stores.size(); j++) {
                                    if (stores.get(j).getStoreID() == id) {
                                        stores.get(j).explore();
                                    }
                                }
                                break;
                            case 3:
                                o.SuggestProduct();
                                break;
                            case 4:
                                System.out.println("Enter product ID: ");
                                Scanner in = new Scanner(System.in);
                                Store sar = new Store();
                                int IDD = in.nextInt();
                                boolean ar = true;
                                if (sar.isType() == true) {
                                    OfflineStore oo = (OfflineStore) sar;
                                    for (int i = 0; i < oo.getArrayofproducts().size(); i++) {
                                        if (oo.getArrayofproducts().get(i).getProductID() == IDD) {
                                            oo.getArrayofproducts().get(i).ViewSPD();
                                        }
                                    }
                                }
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
}
