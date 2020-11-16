/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouraldesign;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class BehaviouralDesign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChainOR c1 = new OneDimension();
        ChainOR c2 = new TwoDimension();
        ChainOR c3 = new ThreeDimension();
        c1.setNext(c2);
        c2.setNext(c3);
        
        Scanner pilihan=new Scanner (System.in);
        System.out.println("-Sistem Informasi Laundry-");
        System.out.println("Halo Sobat Laundry Cintah");
        System.out.println("Yuuuu cek tarif berdasarkan kecepatannya ya...");
        System.out.println("1. CuciKering (1)");
        System.out.println("2. Cuci Setrika (2)");
        System.out.println("Masukkan kode pilihan kalian: ");
        int lihat = pilihan.nextInt();
        
        c1.process(new Dimension (lihat));
        if (lihat==1){
            System.out.println("Cuci Kering");
        }
        else if(lihat == 2){
            System.out.println("Cuci Setrika");
        }
    }
    
}
