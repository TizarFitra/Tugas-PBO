package testnil;
import java.util.*;
/**
 *
 * @author tizar
 * 13020220005
 * waktu pengerjaan :12:30
 */
public class HitungRata {
       private double total = 0.0;
    private ArrayList<Integer> nilaiBaru = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void inputNilai(int[] nilai) {
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
    }

    public double rataNilai(int Ndata) {
        return total / ((double) Ndata);
    }

    public void cetakNilai(int[] nilai) {
        for (int angka : nilai) {
            System.out.print(angka + "\t");
        }
        System.out.println();
    }

    public void inputNilaiBaru(int jumlah) {
        while (jumlah > 0) {
            nilaiBaru.add(input.nextInt());
            jumlah--;
        }
    }

    public void cetakNilaiBaru() {
        ListIterator<Integer> iterator = nilaiBaru.listIterator();
        while (iterator.hasNext()) {
            Integer data = iterator.next();
            if (data == null) {
                System.out.println("null");
            } else {
                System.out.println(data.toString());
            }
        }
    }
}
