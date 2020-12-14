public class TipeDataArray {
    public static void main(String[] args) {
       /*- array / larik adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
       - jumlah data di array tidak bisa berubah setelah pertama kali di buat*/

        //cara 1 deklarasi array
        String[] arrayString;
        arrayString = new String[3];
        //cara 2 deklarasi array
        String[] arrayString2 = new String[3];

        //cara menginisialisasi data langsung ke dalam array
        int[] arrayInt = new int[]{
                11, 12, 13, 14, 15
        };

        int[] arrayInt2 = {
                11, 12, 13, 14, 15
        };

        String[] arrayNama = {
                "andi", "saputra", "lubis"
        };

        //operasi pada array
        //cara mengubah atau memasukan data ke dalam array
        arrayString[0] = "andi";
        arrayString[1] = "saputra";
        arrayString[2] = "lubis";


        //cara memanggil array
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        //cara mengambil panjang array
        System.out.println(arrayNama.length);

        //di java kita tidak bisa menghapus data yang ada didalam array tetapi kita bisa mengganti nilainya menjadi null/0/string kosong
        long[] arrayLong = {
                10L, 20L, 30L, 40L, 50L
        };

        arrayLong[0]= 0;

        String[] arrayString3 = {
                "menghapus", "data", "pada", "array"
        };

        arrayString3[1] = "";
        arrayString3[3] = null;

        System.out.println("=======");
        for (int i = 0; i < arrayString3.length; i++) {
            System.out.print(arrayString3[i]+ " ");
        }

        //array di dalam array (multidimensi)
        String[][] members = {
                {"andi", "saputra", "lubis"},
                {"susilo", "bambang", "yudhoyono"},
                {"soekarno"}
        };

        System.out.println(members[0]);// hasilnya pointer dari array yang berada di index ke satu
        System.out.println(members[0][1]);
        System.out.println(members[1][1]);

    }
}
