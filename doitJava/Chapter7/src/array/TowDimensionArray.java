package array;

public class TowDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[i].length; j ++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
