public class ForEach {
    public static void main(String[] args) {
        /*# Kadang kala kita biasa mengakses data array menggunakan perulangan
        # mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat var counter,
          lalu mengakses array menggunakan var counter yang kita buat
        # namun untungnya, di java terdapat perulangan for each, yang bisa digunakan untuk mengakses
          seluruh data di array secara otomatis
        # hanya untuk mengambil data di array*/

        String[] names = {
                "Eko", "Kurniawan", "Khannedy",
                "Programmer", "Zaman", "Now"
        };

        for(var value : names){
            //var value akan di isi data dari array satu perasatu
            System.out.println(value);
        }
    }
}
