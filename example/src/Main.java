public class Main {
    int a;
    int b;

    static Main instanceOfMain = new Main();

    public static void main(String[] args) {
        /*
        Main e = new Main();
        Main a = e;
        e = new Main();
        */
        Example a = new Example();
        System.out.println(a.x);
        a.x = 10;
        System.out.println(a.x);
        Example e = a;
        e.x = 20;
        System.out.println("x di a = " + a.x);
        System.out.println("x di e = " + e.x);
     }

    public static void method1(){
        int y = 0;
        System.out.println("method1 y = " + y);
    }

    public static void method2(){
        int x = 3;
        System.out.println("method2 x = " + x);
    }

    public void method3(){
        int z = 5;
        System.out.println("method3 z = " + z);
    }
}