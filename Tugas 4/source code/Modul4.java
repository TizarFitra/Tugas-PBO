package modul4;

/**
 *
 * @author tizar fitrah
 */
public class Modul4 {
     public static void main(String[] args) {
        Orang orang = new Orang();
        orang.nama = "Tizar";
        System.out.println("Stb : " + orang.nama);
        
        Orang.info();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Fitrah";
        System.out.println("Stb Mahasiswa : " + mahasiswa.nama);
        
        Mahasiswa.info();
        
} 
}
