package Studying;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        System.out.println("Исходный массив:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("После преобразования:");
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 10; j++) {
                if(arr[0][0] != 0){
                    int temp = arr[0][9];
                    arr[0][0] = 0; /*присвоил ячейке значение 0, требуется
                            переместить ее в конец думерного массива, но не успел сделать*/

                }
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
