public class MethodOverloading {
    public static void main(String[] args) {
        /*# method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali meskipun
            secara default kita tidak bisa membuat method dengan nama yang sama kemampuan ini disebut juga static
            polymorphism
        # namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda beda, entah jumlah
          atau tipe data parameternya
        # jika ada yang sama, maka program java kita akan error*/

        sayHello();
        sayHello("andi");
        sayHello("andi", "saputra");

    }

    //contoh overloading method
    static void sayHello(){
        System.out.println("Hello World");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String firsName, String lastName){
        System.out.println("Hello "+ firsName +" "+ lastName);
    }
}
