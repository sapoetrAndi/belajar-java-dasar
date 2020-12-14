public class TernaryOperator {
    public static void main(String[] args) {
        /** TERNARY OPERATOR
          # ternary operator adalah opertor sederhana dari if statement
          # ternary operator terdiri dari kondisi yang di evaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil*/

          var nilai = 70;
        String ucapan;

        if (nilai >= 70) {
            ucapan = "Selamat anda lulus";
        }else{
            ucapan = "Silahkan coba lagi";
        }

        //menggunakan ternary
        String ucapan2 = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan coba lagi";
        System.out.println(ucapan);
        System.out.println(ucapan2);
    }
}
