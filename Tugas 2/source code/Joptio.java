//Nim : 1302022005
//Nama : Tizar Fitrah Anugerah
//Hari Tanggal : senin-04-03-2023
//Waktu Pengerjaan : 22:51
//Waktu Selesai : 23:05

import javax.swing.JOptionPane;

public class Joptio{
    public static void main(String[] args) {
        String nim = JOptionPane.showInputDialog("Masukkan NIM:");
        String nama = JOptionPane.showInputDialog("Masukkan nama:");
        String jurusan = JOptionPane.showInputDialog("Masukkan jurusan:");
        String fakultas = JOptionPane.showInputDialog("Masukkan fakultas:");
        
        String message = "Data yang dimasukkan:\n" +
                "NIM: " + nim + "\n" +
                "Nama: " + nama + "\n" +
                "Jurusan: " + jurusan + "\n" +
                "Fakultas: " + fakultas;
        
        JOptionPane.showMessageDialog(null, message);
    }
}
