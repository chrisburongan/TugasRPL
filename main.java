
package prototipe;

import java.lang.*;

public class main {

    public static void main(String[] args) {
        Makanan laundry = new Makanan.Builder ()
                .setnopesan (01)
                .setreguler ("Rp 6.000")
                .setkilat ("Rp 9.000")
                .setexpress ("Rp 10.000")
                .build();
        
        System.out.println (laundry);
        // TODO code application logic here
    }
    
}
