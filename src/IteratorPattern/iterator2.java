package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public final class iterator2 implements iterator0{
	
	ArrayList<iterator4> BestStorys;
	
	public iterator2() {
		
		BestStorys = new ArrayList<>();
		addStory("Judul: Asal Mula Sungai Barito", "Tokoh: Bari dan Ito", "Asal: Semua Kecamatan, Semua Kabupaten", "Jenis: Dongeng");
		
	}
	
	public void addStory(String judul, String tokoh, String asal, String jenis){
		
		iterator4 iterator4 = new iterator4(judul, tokoh, asal, jenis);
		
		BestStorys.add(iterator4);
		
	}
	
	public ArrayList<iterator4> getBestStorys(){
		
		return BestStorys;
		
	}
        @Override
	public Iterator createIterator() {
		return BestStorys.iterator();
	}
	
}
