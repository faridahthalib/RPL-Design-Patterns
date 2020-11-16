/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsrpl;

/**
 *
 * @author Faridah
 */
public class FactoryPattern {
    //menggunakan getCerita untuk get object dari cerita daerah
    public factory getCerita (String ceritaDaerah){
        if(ceritaDaerah == null){
            return null;
        }
        if(ceritaDaerah.equalsIgnoreCase("CERITA1")){
            return new factory1();
        
        } else if(ceritaDaerah.equalsIgnoreCase("CERITA2")){
            return new factory2();
            
        } else if(ceritaDaerah.equalsIgnoreCase("CERITA3")){
            return new factory3();
            
        } else if(ceritaDaerah.equalsIgnoreCase("CERITA4")){
            return new factory4();
            
        } else if(ceritaDaerah.equalsIgnoreCase("CERITA5")){
            return new factory5();
        }
        
        return null;
    }
}
