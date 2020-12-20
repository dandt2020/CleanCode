/**
 * GenericTest
 */
public class GenericTest {

    /**
     * print array using generic
     * @param <T>
     */
    public static <T> void printArray (T[] array) {
        for (T item : array) {
            System.out.printf("%s ", item);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.2, 1.5, 2.3, 4.5 };
        Character[] charArray = { 'H', 'D', 'C', 'S' };

        printArray(intArray);
    }
}