public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // operasi ke dirinya sendiri (augmented assignment)
        a += 10; // sama dengan a = a + 10;
        a -= 10; // sama dengan a = a - 10;
        a *= 10; // sama dengan a = a * 10;
        a /= 10; // sama dengan a = a / 10;
        a %= 10; // sama dengan a = a % 10;

        System.out.println(a % b);

        // unary operator
/*      # ++ sama dengan a = a + 1
        # -- sama dengan a = a - 1
        # - sama dengan negative
        # + sama dengan positive
        # ! sama dengan boolean kebalikan (negasi)*/

        //System.out.println(-b);
        //b++;
        //System.out.println(b);

        //++b;
        //System.out.println(b);

        //b--;
        //System.out.println(b);

        --b;
        System.out.println(b);
    }
}
