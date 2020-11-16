package DecoratorPattern;

abstract class decorator3 implements decorator1{
    protected decorator1 nilai;
    
    public decorator3(decorator1 newNilai){
        nilai = newNilai;
    }
    
    public String getCerita1() {
        return nilai.getCerita1();
    }
    
    public String getCerita2() {
        return nilai.getCerita2();
    }
        
    public String getCerita3() {
        return nilai.getCerita3();
    }    
    public String getCerita4() {
        return nilai.getCerita4();
    }    
    public String getCerita5() {
        return nilai.getCerita5();
    }
    
}
