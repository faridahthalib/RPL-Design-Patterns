/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternsrpl;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Faridah
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
        Main obj = new Main ();
        obj.run (args);
        }
    catch (Exception e)
        {
        e.printStackTrace ();
        }
    }
    
    private void run (String[] args) throws Exception
    {
        int sins;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Katalog Cerita Rakyat Kalsel! \n\nBerikut adalah list cerita rakyat yang tersedia:\n"
                + "1.Anak Sima\n2.Asal Mula Sungai Barito\n3.Batu Kasiangan\n4.Kisah Asal Mula Marabahan\n5.Nisan Berlumur Darah\n\n"
                + "Apa yang ingin Anda lihat?\n\n1. Ringkasan cerita\n2. Detail cerita\n3. Nilai dan sumber cerita\n4. Keluar\n");
               
        do {
            System.out.println("Masukkan Pilihan(1/2/3/4):");
            sins = input.nextInt();
        } while ( !isValid(sins) );
        
        if (sins == 1)
            Ringkasan();
        else if (sins == 2)
            Detail();
        else if (sins == 3)
            NilaiSumber();
        else if (sins == 4)
            exit(0);
    }
    
    private boolean isValid(int sins){
    if(sins > 4 || sins < 1){
        System.out.println("Input tidak sesuai.");
        return false;
    } else return true;
    }

    private void Ringkasan() {
        FactoryPattern cerita = new FactoryPattern();
        
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        System.out.println("\nSilakan pilih cerita:\n"
                + "1.Anak Sima\n2.Asal Mula Sungai Barito\n3.Batu Kasiangan\n4.Kisah Asal Mula Marabahan\n5.Nisan Berlumur Darah\n\nMasukkan pilihan (1/2/3/4/5):");
        
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                factory cerita1 = cerita.getCerita("CERITA1");
                cerita1.judul();
                cerita1.ringkasan();
                break;
            case 2:
                factory cerita2 = cerita.getCerita("CERITA2");
                cerita2.judul();
                cerita2.ringkasan();
                break;
            case 3:
                factory cerita3 = cerita.getCerita("CERITA3");
                cerita3.judul();
                cerita3.ringkasan();
                break;
            case 4:
                factory cerita4 = cerita.getCerita("CERITA4");
                cerita4.judul();
                cerita4.ringkasan();
                break;
            case 5:
                factory cerita5 = cerita.getCerita("CERITA5");
                cerita5.judul();
                cerita5.ringkasan();
                break;
            default:
                System.out.println("Input salah. Program akan ditutup.");
                exit(0);
        }

    }
    
}
