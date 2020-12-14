public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        /*    - Tipe data primitif adalah tipe data bawaan di dalam bahasa pemrograman. tipe data primitif tidak bisa diubah lagi
    - tipe data number, char, boolean adalah tipe data primitif. Tipedata primitif selalu memiliki default value
    - tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
    - Tipe data bukan primitif bisa memiliki method/ function (yang akan dibahas nanti)
    - di java, semua tipe data primitif memiliki representasi tipedata bukan primitif*/

    /*tipe data primitif
    - byte
    - short
    - int
    - long
    - float
    - double
    - char
    -boolean

    tipe data bukan primitif alias objek
    - Byte
    - Short
    - Integer
    - Long
    - Float
    - Double
    - Character
    - Boolean
    saat membuat tipe data bukan primitif maka default valuenya null*/

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        iniByte = 100;

        //konversi primitif ke bukan primitif
        int iniInt = 100;
        int age = 2000;

        Integer ageObject = age;
        Integer iniInteger2 = iniInt;
        //konversi balik ke primitif
        int ageAgain = ageObject;
        int intAgain = iniInteger2;

        //konversi ke value yang berbeda
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        System.out.println(shortAge);
    }
}