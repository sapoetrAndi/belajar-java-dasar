public class RecursiveMethod {
    public static void main(String[] args) {
        /*# Recursive method adalah kemampuan method memanggil method dirinya sendiri
        # kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti
          contohnya kasus factorial*/

        System.out.println(factorial(5));

        loop(10000);
    }

    //contoh factorial menggunakan looping
    static int factorial(int value){
        var result = 1;
        for (int i = 1; i <= value ; i++) {
            result *= i;
        }
        return result;
    }

    // contoh factorial menggunakan recursive method
    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        }else{
            return value * factorialRecursive(value - 1);
        }
    }

    //beberapa problem dengan recursive
    /*# walaupun recursive method itu sangat menarik, namun kita perlu berhati hati
    # jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error StackOverflow, yaitu error dimana
      stack method terlalu banyak di java
    # kenapa problem ini bisa terjadi? karena ketika kita memanggil method, java akan menyimpannya didalam stack,
      jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack
      akan terlalu besar, dan bisa menyebabkan StackOverflow*/

    //contoh kasus error stackoverflow
    static void loop(int value){
        if (value == 0){
            System.out.println("selesai");
        }else{
            System.out.println("loop ke- "+ value);
            loop(value - 1);
        }
    }


}
