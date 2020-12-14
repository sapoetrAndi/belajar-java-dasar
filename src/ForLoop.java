public class ForLoop {
    public static void main(String[] args) {
        /*# for adalah kata kunci yang bisa digunakan untuk melakukan perulangan
        # block kode yang terdapat didalam for akan selalu diulang selama kondisi for terpenuhi

        for(init statement; kondisi; post statement){
            //block perulangan
        }

        - init statement akan dieksekusi sekali diawal sebelum perulangan
        - kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan jika false perulangan akan berhenti
        - post statement akan dieksekusi setiap kali diakhir perulangan
        - init statemenet, kondisi dan post statement tidak wajib diisi, jika kondisi tidak diisi maka kondisi bernilai true*/
        var counter = 1;
        for (; counter <= 10 ;) {
            System.out.println("perulangan ke-" + counter);
            counter++;
        }


        for (var i = 1; i <= 10 ;i++) {
            System.out.println("perulangan ke-" + i);

        }

    }
}
