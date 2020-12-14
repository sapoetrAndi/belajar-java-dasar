public class MethodParameter {
    public static void main(String[] args) {
        /*# kita bisa mengirim informasi ke method yang ingin kita panggil
        # untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang
          sudah kita buat
        # cara membuat para meter sama seperti membuat variabel
        # parameter di tempatkan didalam kurung() di deklarasi method
        # parameter bisa lebih dari satu, jika lebih dari satu, harus dipidah menggunakan tanda koma*/

        sayHello("andi", "saputra");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("hello " + firstName + "  " + lastName);
    }
}
