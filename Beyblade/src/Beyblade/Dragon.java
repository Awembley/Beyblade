package Beyblade;

public class Dragon extends  Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,String gizliYetenek,int can) {
        super(beybladeci, donusHizi, saldiriGucu,can);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
        
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adý : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);
        
    }

    @Override
    public void kutsalCanavarOrtayaCikar(Beyblade beyblade) {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "ýný ortaya Çýkarýyor...");
        System.out.println(getBeybladeci() + " ýnn Saldýrýsý  : Hayalet Kasýrga");
        int güç = beyblade.getSaldiriGucu() + 458;
        beyblade.setSaldiriGucu(güç);
    }
    
    
}
