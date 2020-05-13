package Beyblade;

public class Drayga extends Beyblade {
    private String kutsalCanavar;
    
    public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,int can) {
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
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ýný ortaya Çýkarýyor...");
        System.out.println(getBeybladeci() + " ýn Saldýrýsý : Kaplan Pençesi");
        int güç = beyblade.getSaldiriGucu() + 524;
        beyblade.setSaldiriGucu(güç);
    }
    
    
}
