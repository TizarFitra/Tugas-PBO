//Nim : 1302022005
//Nama : Tizar Fitrah Anugerah
//Hari Tanggal : senin-04-03-2023
//Waktu Pengerjaan : 23:20
//Waktu Selesai : 23:35

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = scanner.nextInt();
        int detikSekarang = totalDetik % 60;
        int totalMenit = totalDetik / 60;
        int menitSekarang = totalMenit % 60;
        int totalJam = totalMenit / 60;
        int jamSekarang = totalJam % 24;

       
        System.out.println("Waktu sekarang: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);

        scanner.close();
        }
}