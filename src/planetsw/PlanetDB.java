/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetsw;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class PlanetDB {
    public static ArrayList<Product> products ;
    public static ArrayList<Product> suggesto;
    public static ArrayList<String> suggestN ;
    public static ArrayList<User> registered;
    public static ArrayList<Store> stores ;
    public static ArrayList<Voucher> vouchers ;
    public static ArrayList<Brand> brands ;

    PlanetDB()
   {
     ArrayList<Product> productss = new ArrayList<>();
     products=productss;
     ArrayList<Product> suggestoo = new ArrayList<>();
     suggesto=suggestoo;
     ArrayList<String> suggestNN = new ArrayList<>();
     suggestN=suggestNN;
     ArrayList<User> registeredd = new ArrayList<>();
     registered=registeredd;
     ArrayList<Store> storess= new ArrayList<>();
     stores=storess;
     ArrayList<Voucher> voucherss = new ArrayList<>();
     vouchers=voucherss;
     ArrayList<Brand> brandss = new ArrayList<>();
     brands=brandss;
}
}
