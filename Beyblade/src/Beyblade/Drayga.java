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
        System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);

    }

    @Override
    public void kutsalCanavarOrtayaCikar(Beyblade beyblade) {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " �n� ortaya ��kar�yor...");
        System.out.println(getBeybladeci() + " �n Sald�r�s� : Kaplan Pen�esi");
        int g�� = beyblade.getSaldiriGucu() + 524;
        beyblade.setSaldiriGucu(g��);
    }
    
    
}
