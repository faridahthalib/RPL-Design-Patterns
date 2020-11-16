package DecoratorPattern;

public class decorator5 extends decorator3{

    public decorator5(decorator1 newNilai) {
        super(newNilai);
            }
    
        
    public String getCerita1() {
        return nilai.getCerita1() + "\nSumber: \nData-data Warisan Budaya Tak Benda BPNB Kalbar Tahun 2010";
    }
    
    public String getCerita2() {
        return nilai.getCerita2() + "\nSumber: \nMustika, Jaka dkk. 2005. Kumpulan Cerita Rakyat di Barito Kuala. Barito Kuala : Dinas Lingkungan Hidup, Kebersihan Pariwisata dan Budaya Kabupaten Ba";
    }
        
    public String getCerita3() {
        return nilai.getCerita3() + "\nSumber: \nFahrurazie dkk. 2013. Kumpulan Cerita Rakyat Kalimantan Selatan. Kalimantan Selatan : UPT Taman Budaya dan Penerbit Pustaka Banua";
    }    
    public String getCerita4() {
        return nilai.getCerita4() + "\nSumber: \nMustika, Jaka dkk. 2005. Kumpulan Cerita Rakyat di Barito Kuala. Barito Kuala : Dinas Lingkungan Hidup, Kebersihan Pariwisata dan Budaya Kabupaten Ba";
    }    
    public String getCerita5() {
        return nilai.getCerita5() + "\nSumber: \nData-data Warisan Budaya Tak Benda BPNB Kalbar Tahun 2010.";
    }

    
}
