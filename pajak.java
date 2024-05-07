/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ASUS
 */

public class pajak {
    
   
    private String vendor,tipe;
    public int harga;
    public double ppn;
    public double Harga_stlh_ppn; 
    public int banyak_itm = 1;
    public pajak(){
   
  
    };
    

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void ppnSet (){
        
        if (harga>4000000&&harga<=4200000) {
            ppn = harga / 100 ;
        } 
        else if (harga>4200000&&harga<=4500000){
            ppn = harga / 100 *2;
        }
        else if (harga<4500000){
            ppn = harga /100 *5;
        }
    };
    
    
}
