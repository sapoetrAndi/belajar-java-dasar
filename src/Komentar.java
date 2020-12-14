public class Komentar {
    public static void main(String[] args) {
        /*# kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut
        # komentar adalah kode program yang akan dihiraukan saat proses kompilasi, sehingga di binary code java,
          tidak akan ada kode komentar tersebut
        # biasanya komentar digunakan untuk dokumentasi*/


    }

/*
    ini adalah contoh komentar multiline 1
    aksnlakjfas
    alkfjklajfka
*/


    /**
     * ini adalah contoh komentar multiline 2
     * method untuk menjumlahkan value1 dan value2
     * @param value1 angka pertama
     * @param value2 angka kedua
     * @return hasil penjumlahan value1 dan value2
     */

    static int sum(int value1, int value2){
        // ini adalah komentar single line
        // jumlahkan value1 ditambah value2
        return value1 + value2;
    }
}
