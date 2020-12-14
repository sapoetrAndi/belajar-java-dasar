public class Method {
    public static void main(String[] args) {
/*        # method/(fungsi jika tidak menggunakan konsep oo) adalah block kode program yang akan berjalan saat kita panggil
        # sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console
        # untuk membuat method di java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama
          method, kurung() dan diakhiri dengan block
        # kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung()
        # di bahasa pemrograman lain, method juga disebut dengan function*/

        sayHelloWorld();
        //helloWorld();//error karna bukan static method

    }
    static void sayHelloWorld(){
        //static method hanya boleh di panggil oleh method static juga
        System.out.println("Hello World menggunakan keyword static pada method");
    }
    void helloWorld(){
        System.out.println("Hello world tanpa keyword static pada method");
    }

}
