public class Scope {
    public static void main(String[] args) {
        /*# di java, variable hanya bisa diakses di dalam area dimana mereka () -> dibuat
        # hal ini disebut scope.
        # contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut, atau jika dibuat
          didalam block, maka hanya bisa diakses didalam block tersebut*/


    }

    static void sayHello(String name){
        String hello = "Hello" + name;
        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
        //System.out.println(hi);//akan error karna hi berada diluar scope
    }
}
