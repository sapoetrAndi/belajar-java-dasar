import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
/*        # Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi single value atau sederhananya sebauh perintah yang memberikan nilai ke suatu kode
        # Expression adalah core component dari sebuah statement*/

        //ini adalah expression
        int value;
        value = 10;

        //ini adalah statement yang berisi expression
        System.out.println(value = 10);


        /** STATEMENT / KUMPULAN EXPRESSION
        # statement bisa dibilang adalah kalimat lengkap dalam bahasa.
        # sebuah statement berisikan execution complete, biasanya diakiri titik koma
        # ada beberapa jenis statement:
            - Assignment expression
            - Penggunaan ++ dan --
            - Method invocation
            - object creation expression*/

        // assignment statement
        double aValue = 8933.234;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World");
        // object creation statement
        Date date = new Date();

        /** BLOCK / kumpulan statement
        # block adalah kumpulan statement yang terdiri dari nol atau lebih statement
        # block diawali dan diakhiri dengan kurung kurawal{} //implementasi block lebih jelas sialahkan liat class block
         */


    }
}