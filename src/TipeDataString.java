import org.w3c.dom.ls.LSOutput;

public class TipeDataString<fullName> {
    public static void main(String[] args) {
        /*    String merupakan tipedata yang berisi kumpulan dari karakter atau sederhananya adalah teks
            untuk membuat string di java kita menggunakan " (petik dua)
    tipe data string defauktnya adalah null*/

        String firstName = "andi";
        String lastName = "Saputra";

        //mengabungkan lebih dari satu string (concatenation) menggunakan +
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}
