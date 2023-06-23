public class IfExamples {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        String s = (x % 2 == 0)? "PARI" : "DISPARI";
        if (x%2 == 0){
            System.out.println("Divisibile per 2");
        } else if(x%3 == 0){
            System.out.println("Divisibile per 3");
        } else if (x % 5 == 0) {
            System.out.println("Divisibile per 5");
        } else {
            System.out.println("Non divisibile per 5, per 3, per 2");
        }
        System.out.println("END");
    }
}
