package Beyblade;

public class Draciel extends Beyblade {
    private String kutsalCanavar;
    
    public Draciel(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,int can) {
        super(beybladeci, donusHizi, saldiriGucu,can);
        this.kutsalCanavar = kutsalCanavar;
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavar Adý : " + kutsalCanavar);
        	
    }

    @Override
    public void kutsalCanavarOrtayaCikar(Beyblade beyblade) {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "ýný  ortaya Çýkarýyor...");
        System.out.println(getBeybladeci() + "nin  Savunmasý  : Kale Savunmasý");
        int can = beyblade.getCan() + 1750;
        beyblade.setCan(can);
        
    }
    
    
}
