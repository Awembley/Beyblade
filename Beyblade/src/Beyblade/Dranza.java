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
        
        System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);
        
    }

    @Override
    public void kutsalCanavarOrtayaCikar(Beyblade beyblade) {
        
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "�n� Ortaya ��kar�yor...");
        System.out.println(getBeybladeci() + " �n Sald�r�s� : Alev K�l�c�");
        int g�� = beyblade.getSaldiriGucu() + 958;
        beyblade.setSaldiriGucu(g��);
    }
    
    
}
