package Beyblade;

import java.util.Scanner;


public class Test  {
   

	
	public static void main(String[] args) {
        // Polymorphism kullanarak Beyblade Program�
        System.out.println("Beyblade Program�na Ho�geldiniz.");
        System.out.println("Programdan ��kmak i�in q ya bas�n...");
        
        Scanner scanner =  new Scanner(System.in);
        
        while(true) {
            System.out.println("Arenaya gitmek i�in 2 ye bas�n�z.");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                
                System.out.println("Programdan ��k�l�yor.");
                break;
                
            }
            else if (islem.equals("2")){
            	System.out.println("Arenaya Ho�geldin!!!");
            		while(true) {
            		
            		System.out.println("Beyblade se�(Dranza,Draciel,Dragon,Drayga)");
            		String Beybladesec = scanner.nextLine();
            		BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                    
                    Beyblade beyblade1 = fabrika.beybladeUret(Beybladesec);
                    System.out.println("Rakip Beybladeyi se�");
                    String Beybladesec2 = scanner.nextLine();
                    Beyblade rakip = fabrika.beybladeUret(Beybladesec2);
                    
                    if (beyblade1 == null && rakip == null) {
                        
                    	System.out.println("L�tfen ge�erli bir beyblade ismi girin...");
                    }
                    else {                         
                    	String arenaislem = "1.Sald�r \n"
                    			+ "2.Kutsal Canavar Ortaya ��kar \n"
                    			+ "3.Bilgileri G�ster \n"
                    			+ "Geri d�nmek i�in q ya bas�n";
                      
                    		System.out.println(arenaislem);
                    		System.out.println("��lem se�iniz.");
		                 while(true) {
		                    		
		                    		String arenaislem2 = scanner.nextLine();
		                    		
		                    		
		                    		if (arenaislem2.equals("q")) {
		                    			System.out.println("Geri d�n�l�yor.");
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
		                     	   				System.out.println("Senin Kalan Can�n: " + beyblade1.getCan());
		                     	   				System.out.println("Rakibin Kalan Can�: " + rakip.getCan());
		                     	   				
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
		                     	   		System.out.println("Ge�erli bir i�lem giriniz.");
		                     	   		
		                     	   	}

		                 } 
                       
                       
                       }
            
           
            		}
                
                
            }
            
            
            
        }
        
        
    }
}
