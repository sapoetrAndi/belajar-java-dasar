import javax.print.attribute.standard.OrientationRequested;

public class OperasiBoolean {
    public static void main(String[] args) {
        /*digunakan untuk cek dua data boolean
                # && = AND // jika salah satu false maka hasilnya false
                # || = OR // jika salah satu true maka hasilnya true jika keduanya false maka hasilnya false
                # !  = NOT (negasi/kebalikan) // nilainya akan menjadi kebalikan dari nilai variabelnya*/

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);
    }
}
