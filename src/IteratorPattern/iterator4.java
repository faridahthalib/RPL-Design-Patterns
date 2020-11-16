package IteratorPattern;

public class iterator4{
	
	String judul; 
	String tokoh; 
	String asal;
        String jenis;
	
	public iterator4(String newJudul, String newTokoh, String newAsal, String newJenis){
		
		judul = newJudul;
		tokoh = newTokoh;
		asal  = newAsal;
                jenis = newJenis;
		
	}

    iterator4(String judul, String tokoh, int asal, String jenis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public String getJudul(){ return judul; }
	public String getTokoh(){ return tokoh; }
	public String getAsal(){ return asal; }
        public String getJenis(){ return jenis; }
	
}

