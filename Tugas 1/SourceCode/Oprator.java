//Nim : 1302022005
//Nama : Tizar Fitrah Anugerah
//Hari Tanggal : Sabtu-24-02-2023
//Waktu Pengerjaan : 22:31
//Waktu Selesai : 22:40

public class Oprator{

	public static void main(String[]args){

	boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        System.out.println("Silahkan Baca Teksnya Dan Tambahkan Program Di Bawah Ini Untuk Menampilkan Output Program");

        Bool1 = true;
        Bool2 = false;
        TF = Bool1 && Bool2;
    
        TF = Bool1 || Bool2;
        System.out.println("Bool1 || Bool2 = " + TF);
        TF = !Bool1;
        System.out.println("!Bool1 = " + TF);
        TF = Bool1 ^ Bool2;
        System.out.println("Bool1 ^ Bool2 = " + TF);

        i = 5;
        j = 2;
        hsl = i + j;
        System.out.println("i + j = " + hsl);
        hsl = i - j;
        System.out.println("i - j = " + hsl);
        hsl = i / j;
        System.out.println("i / j = " + hsl);
        hsl = i * j;
        System.out.println("i * j = " + hsl);
        hsl = i / j;
        System.out.println("i / j = " + hsl);
        hsl = i % j;
        System.out.println("i % j = " + hsl);

        x = 5;
        y = 5;
        res = x + y;
        System.out.println("x + y = " + res);
        res = x - y;
        System.out.println("x - y = " + res);
        res = x / y;
        System.out.println("x / y = " + res);
        res = x * y;
        System.out.println("x * y = " + res);

        TF = (i == j);
        System.out.println("i == j = " + TF);
        TF = (i != j);
        System.out.println("i != j = " + TF);
        TF = (i < j);
        System.out.println("i < j = " + TF);
        TF = (i > j);
        System.out.println("i > j = " + TF);
        TF = (i <= j);
        System.out.println("i <= j = " + TF);
        TF = (i >= j);
        System.out.println("i >= j = " + TF);

        TF = (x != y);
        System.out.println("x != y = " + TF);
        TF = (x < y);
        System.out.println("x < y = " + TF);
        TF = (x > y);
        System.out.println("x > y = " + TF);
        TF = (x <= y);
        System.out.println("x <= y = " + TF);
        TF = (x >= y);
        System.out.println("x >= y = " + TF);
}
}