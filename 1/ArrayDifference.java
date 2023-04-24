package исключения;

public class ArrayDifference {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        try {
            int[] result = getDifference(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод, который вычисляет разность элементов двух входящих массивов.
     * Если длины массивов не равны, выбрасывается IllegalArgumentException.
     */
    public static int[] getDifference(int[] arr1, int[] arr2) throws IllegalArgumentException {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длины массивов не равны");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    /**
     * Метод, который делит одно число на другое.
     * Если второе число равно нулю, выбрасывается ArithmeticException.
     */
    public static double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return (double) numerator / denominator;
    }
}

