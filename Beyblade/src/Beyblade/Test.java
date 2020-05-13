package Beyblade;

import java.util.Scanner;


public class Test  {
   

	
	public static void main(String[] args) {
        // Polymorphism kullanarak Beyblade Programý
        System.out.println("Beyblade Programýna Hoþgeldiniz.");
        System.out.println("Programdan çýkmak için q ya basýn...");
        
        Scanner scanner =  new Scanner(System.in);
        
        while(true) {
            System.out.println("Arenaya gitmek için 2 ye basýnýz.");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                
                System.out.println("Programdan Çýkýlýyor.");
                break;
                
            }
            else if (islem.equals("2")){
            	System.out.println("Arenaya Hoþgeldin!!!");
            		while(true) {
            		
            		System.out.println("Beyblade seç(Dranza,Draciel,Dragon,Drayga)");
            		String Beybladesec = scanner.nextLine();
            		BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                    
                    Beyblade beyblade1 = fabrika.beybladeUret(Beybladesec);
                    System.out.println("Rakip Beybladeyi seç");
                    String Beybladesec2 = scanner.nextLine();
                    Beyblade rakip = fabrika.beybladeUret(Beybladesec2);
                    
                    if (beyblade1 == null && rakip == null) {
                        
                    	System.out.println("Lütfen geçerli bir beyblade ismi girin...");
                    }
                    else {                         
                    	String arenaislem = "1.Saldýr \n"
                    			+ "2.Kutsal Canavar Ortaya Çýkar \n"
                    			+ "3.Bilgileri Göster \n"
                    			+ "Geri dönmek için q ya basýn";
                      
                    		System.out.println(arenaislem);
                    		System.out.println("Ýþlem seçiniz.");
		                 while(true) {
		                    		
		                    		String arenaislem2 = scanner.nextLine();
		                    		
		                    		
		                    		if (arenaislem2.equals("q")) {
		                    			System.out.println("Geri dönülüyor.");
		                    			break;
		                    		}
		                    	
		                    		else if (arenaislem2.equals("1")) {
		                     	   		beyblade1.saldir(beyblade1,rakip);
		                     	   		rakip.saldir(rakip, beyblade1);
		                     	   		
		                     	   			if (rakip.getCan() <= 0 ) {
		                     	   				System.out.println("Oyun Bitti!");
		                     	   				System.out.println(rakip.getBeybladeci() + " Kaybetti.");
		                     	   				break;
		                     	   				}
		                     	   			else if(beyblade1.getCan() <= 0) {
		                     	   				System.out.println("Oyun Bitti!");
	                     	   					System.out.println(beyblade1.getBeybladeci() + " Kaybetti.");
	                     	   					break;
		                     	   			}
		                     	   			else {
		                     	   				System.out.println("Senin Kalan Canýn: " + beyblade1.getCan());
		                     	   				System.out.println("Rakibin Kalan Caný: " + rakip.getCan());
		                     	   				
		                     	   			}
		                    		}
		                     	   	else if (arenaislem2.equals("2") ) {
		                     	   		beyblade1.kutsalCanavarOrtayaCikar(beyblade1);
		                     	   	}
		                     	   	else if (arenaislem2.equals("3")) {
		                     	   		System.out.println("Sizin Bilgileriniz");
		                     	   		beyblade1.bilgileriGoster();
		                     	   		System.out.println("**************************************");
		                     	   		System.out.println("Rakip Bilgileri");
		                     	   		rakip.bilgileriGoster();
		                     	   		
		                     	   	}
		                     	   	else {
		                     	   		System.out.println("Geçerli bir iþlem giriniz.");
		                     	   		
		                     	   	}

		                 } 
                       
                       
                       }
            
           
            		}
                
                
            }
            
            
            
        }
        
        
    }
}
