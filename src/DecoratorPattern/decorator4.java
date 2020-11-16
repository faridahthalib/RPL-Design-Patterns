package DecoratorPattern;

public class decorator4 extends decorator3{

    public decorator4(decorator1 newNilai) {
        super(newNilai);
            }
    
        
    public String getCerita1() {
        return nilai.getCerita1() + "\nNilai: \nNilai budaya yang bisa dipetik dari cerita ini adalah nilai hati-hati, janganlah kita mudah terujuk rayu oleh omongan orang lain supaya tidak tertipu.";
    }
    
    public String getCerita2() {
        return nilai.getCerita2() + "\nNilai: \nTuruti nasihat orang tua, hargai pengorbanan yang telah dilakukan oleh orang lain";
    }
        
    public String getCerita3() {
        return nilai.getCerita3() + "\nNilai: \nSegala yang zalim akan binasa dan yang berlaku adil dan bijaksana akan dilindungi Tuhan YME";
    }    
    public String getCerita4() {
        return nilai.getCerita4() + "\nNilai: \nTekad yang kuat dan mau mengalahkan rasa takut menjadikan sekecil apapun kita pasti akan mampu meraih apa yang menjadi tujuan";
    }    
    public String getCerita5() {
        return nilai.getCerita5() + "\nNilai: \nPerlu untuk kita sebagai manusia mengetahui apa yang baik untuk kita dan orang lain. \nJanganlah selalu melihat kekayaan seseorang. Ketahuilah bahwa akhlak yang baik juga sangat penting.";
    }

    
}
