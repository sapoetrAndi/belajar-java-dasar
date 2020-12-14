public class MehodReturnValue {
    public static void main(String[] args) {
        /*# secara default method tidak menghasilkan apapun, namun jika kita ingin, kita bisa membuat sebuah
          method mengembalikan nilai
        # agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang
          dihasilkan
        # dan didalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci
          return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan dimethod
        # di java, kita hanya bisa menghasilkan 1 data/return value disebuah method, tidak bisa lebih dari satu*/

        var a = 100;
        var b = 200;
        var c = sum(a, b);
        var d = sum(400, 500);
        System.out.println(d);
        System.out.println("=============");
        int hasil = hitung(200, "*", 100);
        System.out.println(hasil);
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return  total;
    }

    //return bisa digunakan lebih dari satu untuk kondisional
    static  int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
                //break;
            case "-":
                return value1 - value2;
                //break;
            default:
                return 0;
        }
    }
}
