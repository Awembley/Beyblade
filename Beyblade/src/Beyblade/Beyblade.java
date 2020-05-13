package Beyblade;

import java.util.Random;

public class Beyblade {
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;
    private int can;
    
    Random rand = new Random();
    int say� = rand.nextInt(784);
    
    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu,int can) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = (saldiriGucu * donusHizi) / say�;
        this.can = can;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can =  can;
	}

	public void kutsalCanavarOrtayaCikar(Beyblade beyblade1) {
        System.out.println("Bu beyblade'in kutsal canavar� bulunmuyor...");
       
        
       
    }
	 public void saldir(Beyblade me,Beyblade rakip){
	        System.out.println(beybladeci + " " + saldiriGucu + " ve " + donusHizi + " ile sald�r�yor...");
	        rakip.can = rakip.getCan() - me.getSaldiriGucu();
	       
	    }
	    
	
	
	public void bilgileriGoster() {
        System.out.println("Beybladeci can�: " + can);
    	System.out.println("Beybladeci �smi : " + beybladeci);
        System.out.println("Sald�r� G�c�: " + saldiriGucu);
        System.out.println("D�n�� H�z� : " + donusHizi);
        
        
        
    }
    
}
