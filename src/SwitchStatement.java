import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        /** Switch Statement
         # Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
         # konsdisi di switch statement hanya untuk perbandingan ==*/

        Scanner input = new Scanner(System.in);
        var nilai = input.nextLine().toUpperCase();

        switch (nilai) {
            case "A":
                System.out.println("Wow anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        //switch lambda
/*        # di java versi 14, diperkenalkan switch expression dengan lambda
        # ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break*/

        /*switch (nilai){
            case "A" -> System.out.println("wow anda lulus");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default ->{//jika baris lebih dari satu pakai block
                System.out.println("Mungkin Anda salah jurusan");
            }
        }*/

        //yield keyword di java v14 keatas
        /*# di java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield uuntuk
          mengembalikan nilai pada switch statement
        # ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi swith statement*/


        /*
        jika tidak menggunakan keyword yield
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "wow anda lulus";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default ->{//jika baris lebih dari satu pakai block
                ucapan = "Mungkin Anda salah jurusan";
            }
    }
        System.out.println(ucapan);

        String ucapan = switch (nilai){
            case "A":
            yield "wow anda lulus";
            case "B", "C":
            yield "Anda Lulus";
            case "D" :
             yield "Anda Tidak Lulus";
            default:
            yield "Mungkin Anda salah jurusan";
            }
    }
        System.out.println(ucapan);
        */
    }
}
