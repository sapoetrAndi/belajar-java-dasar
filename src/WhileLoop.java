public class WhileLoop {
    public static void main(String[] args) {
        /*# while loop adalah versi perulangan yang lebih sederhana dibanding for loop
        # di while loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement*/

        var counter = 1;
        while (counter <= 10) {
            System.out.println("perulangan ke-" + counter);
            counter++;
        }

        /*# do while
        # pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di
          do while loop dilakukan setelah perulangan dilakukan
        # oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi
          tidak bernilai true*/

        var counter2 = 100;

          do {
              System.out.println("perulangan ke- "+ counter2);
              counter2++;
          }while(counter2 <= 100);
    }
}
