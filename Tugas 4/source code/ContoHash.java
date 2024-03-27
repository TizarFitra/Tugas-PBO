package contohash;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Tizar Fitrah
 * waktu pengerjaan = 14:00
 */
public class ContoHash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hashMap = new HashMap<>();

        System.out.println("Masukkan jumlah data yang ingin dimasukkan:");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Memasukkan nilai dan kunci (key) ke dalam HashMap
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan kunci (key) ke-" + (i + 1) + ":");
            String key = scanner.nextLine();
            System.out.println("Masukkan nilai ke-" + (i + 1) + ":");
            int value = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            hashMap.put(key, value);
        }

        // Menampilkan isi HashMap
        System.out.println("Isi HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
    
    

