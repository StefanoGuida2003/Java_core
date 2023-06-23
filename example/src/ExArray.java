public class ExArray {
    public static void main(String[] args) {
        int[] ints = new int[5];
        System.out.print("[");
        for(int i=0; i<5; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println("]");

        Example[] examples = new Example[2];
        examples[0] = new Example();
        examples[1] = new Example();
        for(int i = 0; i < 2; i++){
            System.out.print(examples[i] + ", ");
        }

    }
}
