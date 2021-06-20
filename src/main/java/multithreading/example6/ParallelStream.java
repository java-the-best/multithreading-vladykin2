package multithreading.example6;

import java.util.Arrays;

public class ParallelStream {

    public static void main() throws Exception {
        int[] array = Commons.prepareArray();

        long startTime = System.currentTimeMillis();

        double sum = Arrays.stream(array).parallel().mapToDouble(Commons::function).sum();

        long endTime = System.currentTimeMillis();

        System.out.println("sum = " + sum);
        System.out.println("time = " + (endTime - startTime) + " ms");
    }
}
