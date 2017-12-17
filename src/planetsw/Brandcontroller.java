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
public class Brandcontroller {
       public Brand AddBrand(PlanetDB s )
    {
        Brand p=new Brand();
        System.out.println("Enter the name of the Brand: ");
        Scanner in=new Scanner(System.in);
        p.setName(in.nextLine());
        System.out.println("Enter the Owner ID: ");
        Scanner inn=new Scanner(System.in);
        p.setOwnerID(inn.nextInt());
        boolean f=true;
        for (int i=0;i< s.registered.size(); i++)
        {
            if (s.registered.get(i).getType()=="owner" )
            {
                Owner o= (Owner)s.registered.get(i);
                if (o.getID()== p.getOwnerID())
                {
                    o.getArrayofbrand().add(p);
                    f=false;
                    s.brands.add(p);
                    break;
                }
               
            }
        }
        if (f==true)
        {
            System.out.println("Wrong ID!!");
        }
        return null;
    }  
}

