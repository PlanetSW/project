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
public class UserControler {
    
    public User LogIN(PlanetDB db) {
        String mail, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter mail : ");
        mail = s.nextLine();
        System.out.print("Enter Password : ");
        password = s.nextLine();
        for (int i = 0; i < db.registered.size(); i++) {
            if (db.registered.get(i).getEmail().equals(mail) && db.registered.get(i).getPassword().equals(password)) {
                System.out.println("Found");
                System.out.println("You registered as an : " + db.registered.get(i).getType());
                System.out.println("Your Name is : " + db.registered.get(i).getName());
                return (db.registered.get(i));
            }
        }
        System.out.println("Not Found.");
        return null;
    }

    public User register(PlanetDB db) {
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
            for (int j = 0; j < db.registered.size(); j++) {
                if (db.registered.get(j).getEmail().equals(mail)) {
                    System.out.println("This mail is used, please enter another mail.");
                    mail = s.nextLine();
                }
            }
            System.out.println("Are you Premium if yes enter True , if no enter False?");
            o.setPremium(s.nextBoolean());
            o.setName(name);
            o.setEmail(mail);
            o.setPassword(password);
            o.setType("owner");
            db.registered.add(o);
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
            for (int j = 0; j < db.registered.size(); j++) {
                if (db.registered.get(j).getEmail().equals(mail)) {
                    System.out.println("This mail is used, please enter another mail.");
                    mail = s.nextLine();
                }
            }
            nU.setName(name);
            nU.setEmail(mail);
            nU.setPassword(password);
            nU.setType("NormalUser");
            db.registered.add(nU);
            return nU;
        }
        return null;
    }
}
