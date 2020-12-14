public class Block {//awal block
    public static void main(String[] args) {//awal block
        System.out.println("hello world1");
        System.out.println("hello world2");
        System.out.println("hello world3");

        //kita bisa membuat block di dalam block
        {

            // tujuan membuat block untuk grouping code
            System.out.println("hello world4");
            System.out.println("hello world5");
            System.out.println("hello world6");

            {
                //ini block di dalam block
                System.out.println("hello world7");
                System.out.println("hello world8");
                System.out.println("hello world9");
            }
        }
    }//akhir block
}//akhir block
