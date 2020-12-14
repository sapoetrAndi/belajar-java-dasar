public class KonversiNumber {
    /*konversi tipe data number
        - Widening Casting(Otomatis): byte-> short-> int-> long-> float-> double
        - Narrowing Casting(Manual): double-> float-> long-> int-> char-> short-> byte
    contoh:*/
    byte iniByte = 10;
    short iniShort = iniByte;
    int iniInt = iniShort;
    float iniFloat = iniInt;
    double iniDouble = iniFloat;

    float iniFloat2 = (float) iniDouble;
    long iniLong2 = (long) iniFloat2;
    int iniInt2 = (int) iniLong2;
    short iniShort2 = (short) iniInt2;
}
