package Beyblade;

public class Dranza extends Beyblade {
    
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,int can) {
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
        
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "ýný Ortaya Çýkarýyor...");
        System.out.println(getBeybladeci() + " ýn Saldýrýsý : Alev Kýlýcý");
        int güç = beyblade.getSaldiriGucu() + 958;
        beyblade.setSaldiriGucu(güç);
    }
    
    
}
