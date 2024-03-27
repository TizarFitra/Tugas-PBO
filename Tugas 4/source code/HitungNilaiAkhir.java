package Evaluasi.HitungNilai;

/**
 *
 * @author tizar fitrah
 */
public class HitungNilaiAkhir {
     public double nilaiTugas(int tugas1, int tugas2) {
        double rataTugas = (tugas1 + tugas2) / 2.0;
        return rataTugas;
    }

    public double nilaiAkhir(double tugas, int mid, int uas) {
        double nilaiAkhir = (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
        return nilaiAkhir;
    }
}
