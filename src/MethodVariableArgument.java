public class MethodVariableArgument {
    public static void main(String[] args) {
        /*# kadang kita butuh mengirim data ke method dengan sejumlah data yang tidak pasti
        # biasanya, agar bisa seperti ini, kita akan menggunakan array sebagai parameter di method tersebut
        # namun di java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah
          tak tentu, bisa nol atau lebih.
        # parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter*/

        int[] array = {80, 80, 80, 90};
        sayCongrats("andi", array);

        //jika menggunakan variable argument kita bisa langsung memasukan nilai ke dalam parameter
        sayCongratulation("andi", 75, 80, 90, 90);
    }
    //jika menggunakan array
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value: values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ",Anda Lulus");
        }else{
            System.out.println("Maaf " + name + ",Anda Belum Lulus");
        }
    }

    //jika menggunakan variable argument
    // variable argument selalu diletakan paling akhir setelah parameter lain
    static void sayCongratulation(String name, int... values){
        var total = 0;
        for (var value: values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ",Anda Lulus");
        }else{
            System.out.println("Maaf " + name + ",Anda Belum Lulus");
        }
    }
}
