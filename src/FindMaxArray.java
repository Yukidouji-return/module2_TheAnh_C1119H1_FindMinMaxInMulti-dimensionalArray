public class FindMaxArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14},
                {15, 16, 17, 18}
        };

        int Max = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > Max) {
                    Max = matrix[row][col];

                }
            }
        }
        System.out.println("Max is: "+Max);
    }
}
