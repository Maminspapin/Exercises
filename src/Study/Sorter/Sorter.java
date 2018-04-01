/*
Сортировка элементов массива по возрастанию
*/

package Study.Sorter;

public class Sorter {

    // Пузырьковая сортировка

    private static void sortArray(int[] array) {

        if (array != null || array.length != 0) {
            int temp;
            for (int j = array.length; j > 0; j--) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
        }
    }

    // Сортировка методом выбора

    private static void sortArray2(int[] array) {

        if (array != null || array.length != 0) {

            int temp, min, out, in;

            for (out = 0; out < array.length - 1; out++) {

                min = out;

                for (in = out + 1; in < array.length; in++) {
                    if (array[in] < array[min]) {
                        min = in;
                    }
                }

                temp = array[out];
                array[out] = array[min];
                array[min] = temp;
            }
        }
    }

    // Сортировка методом вставки

    private static void sortArray3(int[] array) {

        if (array != null || array.length != 0) {

            int temp, out, in;

            for (out = 1; out < array.length; out++) {
                temp = array[out];
                in = out;

                while (in > 0 && array[in - 1] >= temp) {
                    array[in] = array[in - 1];
                    in--;
                }

                array[in] = temp;
            }
        }
    }



    public static void main(String[] args) {

        int[] myArray = {25, 0, 12, 45, 10, 33, 12, 9, 7, 39, 42, 1, 18};

        sortArray(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
        System.out.println();

        sortArray2(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
        System.out.println();

        sortArray3(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
        }
        System.out.println();

    }
}