public class BreakDanContinue {
    public static void main(String[] args) {
        /*# break digunakan untuk menghentikan seluruh perulangan.
        # sedangkan continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan
          keperulangan selanjutnya.*/

        var counter = 1;
        //break
        while (true){
            System.out.println("Perulangan ke- "+ counter);
            counter++;

            if(counter > 10){
                break;
            }
        }

        //continue
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                continue;
                //menampilkan looping ganjil saja
                //jika kondisi if true kode di bawah tidak akan di eksekusi
            }
            System.out.println("perulangan ganjil - " + i);
        }
    }
}
