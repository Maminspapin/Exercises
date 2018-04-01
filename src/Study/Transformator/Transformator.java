/*
Транспонирование матрицы
*/

package Study.Transformator;

public class Transformator {

    private static int [][] transform (int [][] array) {

        int [][] newArray = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                newArray[j][i] = array[i][j];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [][] array = {{5, 5, 5},{4, 4, 4},{3, 3, 3},{2, 2, 2},{1, 1, 1}};
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<3; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        int [][] newArray = transform(array);
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<5; j++) {
                System.out.print(newArray[i][j]);
            }
            System.out.println();
        }
    }
}
