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
        System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);
        
    }

    @Override
    public void kutsalCanavarOrtayaCikar(Beyblade beyblade) {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "�n� ortaya ��kar�yor...");
        System.out.println(getBeybladeci() + " �nn Sald�r�s�  : Hayalet Kas�rga");
        int g�� = beyblade.getSaldiriGucu() + 458;
        beyblade.setSaldiriGucu(g��);
    }
    
    
}
