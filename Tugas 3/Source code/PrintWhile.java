//Nim : 1302022005
//Nama : Tizar Fitrah Anugerah
//Hari Tanggal : senin-11-03-2023
//Waktu Pengerjaan : 22:07
//Waktu Selesai : 22:17

import java.util.Scanner;
public class PrintWhile {
public static void main(String[] args) {
int N;
int i;
Scanner masukan=new Scanner(System.in);
System.out.print ("Nilai N >0 = "); 
N = masukan.nextInt();
i = 1; 
System.out.print ("Print i dengan WHILE: \n");
while (i <= N)
{ System.out.println (i);
i++;
}; 
}
}
