
package prototipe;


public class Makanan {
       
    private long biasa;
    
    public String reguler;
    public String kilat;
    public String express;
    
    private Makanan (Builder builder){
        reguler = builder.reguler;
        kilat = builder.kilat;
        express = builder.express;
        biasa = builder.biasa;
        
    }
    
    public static class Builder {
        private long biasa;
    
        private String reguler;
        private String kilat;
        private String express;
        
        public Builder setnopesan (long biasa){
            this.biasa = biasa;
            return this;
        }
        
        public Builder setreguler (String reguler){
            this.reguler =reguler;
            return this;
        }
        
        public Builder setkilat (String kilat){
            this.kilat = kilat;
            return this;
        }
        
        public Builder setexpress (String express){
            this.express = express;
            return this;
        }
        
        public Makanan build (){
            return new Makanan (this);
        }   // TODO code application logic here
    }

    @Override
    public String toString (){
        return "********Laundry Penuh Cinta*********" + ("\n") 
                + "Cuci Kering per/kg Reguler = " + reguler + ("\n")
                + "Cuci Kering per/kg Kilat = " + kilat + ("\n") 
                + "Cuci Kering per/kg Express = " + express + ("\n");
    }
    
}
