public class LoopExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        int i = 0;
        while (i <= 10) {
            System.out.println("w = " + i);
            i++;
        }

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j : ints) {
            System.out.println("j = " + j);
        }

        int[][] matrix = {{1, 2, 3, 5}, {6, 7, 8, 9, 10}};
        System.out.println("Matrix: \n");
        for(int k = 0; k < matrix.length; k++) {
            for (int j = 0; j < matrix[k].length; j++) {
                System.out.print(matrix[k][j] + " ");
            }
            System.out.print("\n");

            // System.out.println(matrix[0].length);
        }
        /*
        System.out.println("Matrix foreach: \n");
        for (int[] k:matrix) {
            for (int ks:k) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        */
        /*
        for(int k = 0; k<matrix.length; k++){
            for(int l = 0; l<matrix[k].length){
                System.out.println();
            }
        }
         */
    }
}
