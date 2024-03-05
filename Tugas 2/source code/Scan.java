//Nim : 1302022005
//Nama : Tizar Fitrah Anugerah
//Hari Tanggal : Rabu-21-02-2023
//Waktu Pengerjaan : 22:25
//Waktu Selesai : 22:50

import java.util.Scanner;

public class Scan{ 
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan NIM:");
        String nim = scanner.nextLine();
        
        System.out.println("Masukkan nama:");
        String nama = scanner.nextLine();
        
        System.out.println("Masukkan jurusan:");
        String jurusan = scanner.nextLine();
        
        System.out.println("Masukkan fakultas:");
        String fakultas = scanner.nextLine();
        
        System.out.println("Data yang dimasukkan:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        
        scanner.close();
}
}
