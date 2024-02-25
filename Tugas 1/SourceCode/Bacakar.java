//Nim : 1302022005
//Nama : Tizar Fitrah Anugerah
//Hari Tanggal : Rabu-21-02-2023
//Waktu Pengerjaan : 23:59
//Waktu Selesai : 00:10

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Bacakar{
	
	public static void main(String[] args) throws IOException {
	char cc;
	int bil;
	InputStreamReader isr = new
	InputStreamReader(System.in);
	BufferedReader dataIn = new BufferedReader(isr);
	System.out.print ("hello\n");
	System.out.print ("baca 1 karakter : ");
	cc = dataIn.readLine().charAt(0);
	System.out.print("baca 1 bilangan : ");
	bil =Integer.parseInt(dataIn.readLine());
	String kar = JOptionPane.showInputDialog("karakter 1 : "); 	System.out.println(kar);
	JOptionPane.showMessageDialog(null,"welcome"); 
	System.out.print (cc +"\n" + bil +"\n");
	System.out.print ("Bye\n");
}
}

