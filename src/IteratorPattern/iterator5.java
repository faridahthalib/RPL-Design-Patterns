package IteratorPattern;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class iterator5 {
	
	iterator1 cerita1;
	iterator2 cerita2;
	iterator3 cerita3;
	iterator6 cerita6;
        iterator7 cerita7;
	// NEW Passing in song iterators
	
	iterator0 itercerita1;
	iterator0 itercerita2;
	iterator0 itercerita3;
	iterator0 itercerita6;
        iterator0 itercerita7;
	/* OLD WAY
	public DiscJockey(CeritaBagianSatu newSongs70s, CeritaBagianDua newSongs80s, CeritaBagianTiga newSongs90s) {
		
		songs70s = newSongs70s;
		songs80s = newSongs80s;
		songs90s = newSongs90s;
		
	}
	*/
	
	// NEW WAY Initialize the iterators	
	
	public iterator5(iterator0 newcerita1, iterator0 newcerita2, iterator0 newcerita3, iterator0 newcerita6, iterator0 newcerita7) {
		
		itercerita1 = newcerita1;
		itercerita2 = newcerita2;
		itercerita3 = newcerita3;
                itercerita6 = newcerita6;
                itercerita7 = newcerita7;
		
	}
        
        
	
	public void showTheSongs(){
		
		// Because the iterator4 Objects are stored in different
		// collections everything must be handled on an individual
		// basis. This is BAD!
		
		ArrayList aLcerita1 = cerita1.getBestStorys();
				
		for(int i=0; i < aLcerita1.size(); i++){
			
			iterator4 bestStorys = (iterator4) aLcerita1.get(i);
			
			System.out.println(bestStorys.getJudul());
			System.out.println(bestStorys.getTokoh());
			System.out.println(bestStorys.getAsal());
                        System.out.println(bestStorys.getJenis() + "\n");
			
		}
		
		ArrayList aLcerita2 = cerita2.getBestStorys();
				
		for(int i=0; i < aLcerita2.size(); i++){
			
			iterator4 bestStorys = (iterator4) aLcerita1.get(i);
			
			System.out.println(bestStorys.getJudul());
			System.out.println(bestStorys.getTokoh());
			System.out.println(bestStorys.getAsal());
                        System.out.println(bestStorys.getJenis() + "\n");
			
		}
		
		Hashtable<Integer, iterator4> htcerita3 = cerita3.getBestStorys();
				
		for (Enumeration<Integer> e = htcerita3.keys(); e.hasMoreElements();)
	    {
			iterator4 bestStorys = htcerita3.get(e.nextElement());
			
			System.out.println(bestStorys.getJudul());
			System.out.println(bestStorys.getTokoh());
			System.out.println(bestStorys.getAsal());
                        System.out.println(bestStorys.getJenis() + "\n");
			
	    }
                
                ArrayList aLcerita6 = cerita6.getBestStorys();
				
		for(int i=0; i < aLcerita6.size(); i++){
			
			iterator4 bestStorys = (iterator4) aLcerita1.get(i);
			
			System.out.println(bestStorys.getJudul());
			System.out.println(bestStorys.getTokoh());
			System.out.println(bestStorys.getAsal());
                        System.out.println(bestStorys.getJenis() + "\n");
			
		}
                
		ArrayList aLcerita7 = cerita7.getBestStorys();
				
		for(int i=0; i < aLcerita7.size(); i++){
			
			iterator4 bestStorys = (iterator4) aLcerita1.get(i);
			
			System.out.println(bestStorys.getJudul());
			System.out.println(bestStorys.getTokoh());
			System.out.println(bestStorys.getAsal());
                        System.out.println(bestStorys.getJenis() + "\n");
			
		}
	}
    
    
    private boolean isValid(int sins){
    if(sins > 4 || sins < 1){
        System.out.println("Input tidak sesuai.");
        return false;
    } else return true;
    }
	
	// Now that I can treat everything as an Iterator it cleans up
	// the code while allowing me to treat all collections as 1
	
	public void showCerita(){
            Scanner input = new Scanner(System.in);
            int pilih = 0;
                System.out.println("\nSilakan pilih cerita:\n"
                + "1.Anak Sima\n2.Asal Mula Sungai Barito\n3.Batu Kasiangan\n4.Kisah Asal Mula Marabahan\n5.Nisan Berlumur Darah\n\nMasukkan pilihan (1/2/3/4/5):");
                pilih = input.nextInt();
                switch(pilih){
                case 1:
                Iterator cerita1 = itercerita1.createIterator();
                System.out.println("\nDetail Cerita Anak Sima");
		printTheSongs(cerita1);
                break;
                case 2 :
                Iterator cerita2 = itercerita2.createIterator();
                System.out.println("\nDetail Cerita Asal Mula Sungai Barito");
                printTheSongs(cerita2);
                break;
                case 3 :
                Iterator cerita3 = itercerita3.createIterator();
                System.out.println("\nDetail Cerita Batu Kasiangan");
		printTheSongs(cerita3);
                break;
                case 4 :
                Iterator cerita6 = itercerita6.createIterator();
                System.out.println("\nDetail Cerita Kisah Asal Mula Marabahan");
		printTheSongs(cerita6);
                break;
                case 5 :
                Iterator cerita7 = itercerita7.createIterator();
                System.out.println("\nDetail Cerita Nisan Berlumur Darah");
		printTheSongs(cerita7);
                break;
                default:
                System.out.println("Input salah. Program akan ditutup.");
                exit(0);
                }
	
		
       
		
	
		
		
		
		
		
		
		
		
	}
	
	public void printTheSongs(Iterator iterator){
		
		while(iterator.hasNext()){
			
			iterator4 ceritaInfo = (iterator4) iterator.next();
			
			System.out.println(ceritaInfo.getJudul());
			System.out.println(ceritaInfo.getTokoh());
			System.out.println(ceritaInfo.getAsal());
                        System.out.println(ceritaInfo.getJenis() + "\n");
			
		}
		
	}
	
}
