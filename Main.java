/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("banyak vendor");
        int a = s.nextInt();
        s.nextLine();
       UTS.pajak []b = new pajak[a];
        for (int input = 0; input <a ; input++) {
            b[input] = new pajak();
            System.out.println("set vendor"+(input+1));
            b[input].setVendor(s.nextLine());
            System.out.println("set tipe");
            b[input].setTipe(s.nextLine());
            System.out.println("set harga");
            b[input].setHarga(s.nextInt());
            System.out.println("set banyak item");
            b[input].ppnSet();
            b[input].banyak_itm = s.nextInt();
            s.nextLine();
        }
        int harga_totl=0;
        for (int i = 0; i < a; i++) {
            harga_totl+= (b[i].harga+b[i].ppn)*b[i].banyak_itm;
        }
        System.out.println(harga_totl);
    }
}