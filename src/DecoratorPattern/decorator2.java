package DecoratorPattern;

public class decorator2 implements decorator1{


    @Override
    public String getCerita1() {
        return "\nJudul: \nAnak Sima";        
    }

    @Override
    public String getCerita2() {
        return "\nJudul: \nAsal Mula Sungai Barito";
    }


    @Override
    public String getCerita3() {
        return "\nJudul: \nBatu Kasiangan";
    }
    
    @Override
    public String getCerita4() {
        return "\nJudul: \nKisah Asal Mula Marabahan";
    }

    @Override
    public String getCerita5() {
        return "\nJudul: \nNisan Berlumur Darah";
    }


    
}
