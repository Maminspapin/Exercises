/*
Поиск лемента в массиве
*/

package Study.Finder;

public class Finder {

    // Линейный поиск

    private static int findIdx(int[] array, int el) {

        if (array != null || array.length != 0) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] == el) return i;
            }
        }
        return -1;
    }

    // Бинарный поиск
    // Ограничение: Массив д.б. упорядоченным по возрастанию, без дубликатов

    private static int findIdx2(int[] array, int el) {

        if (array != null || array.length != 0) {

            int leftVal = 0;
            int rightVal = array.length-1;
            int middleVal;

        while (leftVal <= rightVal) {

                middleVal = (leftVal + rightVal)/2;

                if (el == array[middleVal]) return middleVal;
                else if (el < array[middleVal]) {
                    rightVal = middleVal-1;
                }
                else if (el > array[middleVal]) {
                    leftVal = middleVal+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] myArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.print(findIdx(myArr, 5));
        System.out.println();
        System.out.print(findIdx2(myArr, 0));

    }
}
