package multithreading.example6;

import java.util.Arrays;
import java.util.concurrent.atomic.DoubleAdder;

public class ParallelStreamBrokenTrue {

    public static void main() {
        int[] array = Commons.prepareArray();

        long startTime = System.currentTimeMillis();

        DoubleAdder sum = new DoubleAdder();
        Arrays.stream(array).parallel().mapToDouble(Commons::function).forEach(sum::add);

        long endTime = System.currentTimeMillis();

        System.out.println("sum = " + sum.doubleValue());
        System.out.println("time = " + (endTime - startTime) + " ms");
    }
}
