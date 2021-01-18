public class Main {
    public Main(){System.out.println("A "); }//this(10); }

    public Main(int a){
        this(); // A
        System.out.println("B "); // A B
    }
    public Main(String str){
        this(2324);
//        this(100); compilation fails
        System.out.println(str);
    }


    public static void main(String[] args) {
        Main obj = new Main("k");
    }
}
