//Nim : 1302022005
//Nama : Tizar Fitrah Anugerah
//Hari Tanggal : senin-11-03-2023
//Waktu Pengerjaan : 22:17
//Waktu Selesai : 22:24

import java.util.Scanner;
public class PrintWhile1 {
public static void main(String[] args) {
int N;
int i = 1;
Scanner masukan=new Scanner(System.in);
System.out.print ("Nilai N >0 = "); 
N = masukan.nextInt();
System.out.print ("Print i dengan WHILE (ringkas): \n");
while (i <= N){
System.out.println (i++);
}
}
}