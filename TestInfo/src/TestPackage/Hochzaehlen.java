package TestPackage;

public class Hochzaehlen {
	
	public static void main (String[] args){
		
		int high = (int) Math.round(Math.random()*100);
		
	
		for (long zahl = 1; zahl <= high; zahl++ ){
			
		
				if (zahl%2 == 0){
					
					System.out.println("Gerade Zahl\t" + zahl);
				}
				
				if (zahl%2 == 1){
					
					System.out.println("Ungerade Zahl\t" + zahl);
				}
				
			}
			
			
		}
			
	}

	
