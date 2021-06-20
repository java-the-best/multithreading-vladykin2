package multithreading.example6;

public class Sequential {

    public static void main() {
        int[] array = Commons.prepareArray();

        long startTime = System.currentTimeMillis();

        double sum = Commons.calculate(array);

        long endTime = System.currentTimeMillis();

        System.out.println("sum = " + sum);
        System.out.println("time = " + (endTime - startTime) + " ms");
    }
}
