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
public class VoucherController {
    public void AddVoucher(PlanetDB s)
    {
        Voucher v=new Voucher();
        System.out.println("Enter the name of the voucher: ");
        Scanner in=new Scanner(System.in);
        v.setName(in.nextLine());
        System.out.println("Enter the ID of the voucher: ");
        Scanner inn=new Scanner(System.in);
        v.setID(inn.nextInt());
        System.out.println("Enter the value of the voucher: ");
        Scanner ix=new Scanner(System.in);
        v.setVal(ix.nextInt());
        v.setAvl(true);
        s.vouchers.add(v);
        
    }
}
