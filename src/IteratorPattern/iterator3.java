package IteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class iterator3 implements iterator0{
	
	Hashtable<Integer, iterator4> bestStorys = new Hashtable<Integer, iterator4>();
	
	
	int hashKey = 0;
	
	public iterator3() {
		
		addStory("Judul: Batu Kasiangan", "Tokoh: Datu Balan, Datu Tapin ", "Asal: Semua Kecamatan, Semua Kabupaten", "Jenis: Legenda");
		
	}
	
	public void addStory(String judul, String tokoh, String asal, String jenis){
		
		iterator4 storyInfo = new iterator4(judul, tokoh, asal, jenis);
		
		bestStorys.put(hashKey, storyInfo);
		
		hashKey++;
			
	}
	
	public Hashtable<Integer, iterator4> getBestSongs(){
		
		return bestStorys;
		
	}
	
	public Iterator createIterator() {
		
		return bestStorys.values().iterator();
	}

    Hashtable<Integer, iterator4> getBestStorys() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setCeritaBagianTiga() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
