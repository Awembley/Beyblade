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
        System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);
        	
    }

    @Override
    public void kutsalCanavarOrtayaCikar(Beyblade beyblade) {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "�n�  ortaya ��kar�yor...");
        System.out.println(getBeybladeci() + "nin  Savunmas�  : Kale Savunmas�");
        int can = beyblade.getCan() + 1750;
        beyblade.setCan(can);
        
    }
    
    
}
