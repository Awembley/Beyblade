package Beyblade;

public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beyblade_turu) {
          
    	
    	if (beyblade_turu.equals("Dragon")){
            return new Dragon("Takao", 800, 300,"Mavi Ejderha","Kutsal Canavarla Konu�ma",10000);
            
        }
        else if (beyblade_turu.equals("Draciel")) {
            
            return new Draciel("Max",600,400,"Kara Kaplumba�a",10000);
            
        }
        else if (beyblade_turu.equals("Dranza")) {
            
            return new Dranza("Kai",800,250,"K�rm�z� Anka Ku�u",10000);
            
        }
        else if (beyblade_turu.equals("Drayga")) {
            
            return new Drayga("Rei",400,800,"Beyaz Kaplan",10000);
            
        }
        else {
           
        	
        	
        return null;
            
        }
        
    }

}
	