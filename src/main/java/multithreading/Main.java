package multithreading;

import multithreading.example6.*;

public class Main {

    public static void main(String[] args) throws Exception {
//        SequenceGeneratorBroken.main();
//        SequenceGeneratorGood1.main();
//        SequenceGeneratorGood2.main();
//        SemaphoreDemo.main();
//        CountDownLatchDemo.main();
//        LockDemo.main();
//        ExecutorServiceDemo.main();
        Sequential.main();
        ParallelInExecuteService.main();
        ParallelInForkJoinPool.main();
        ParallelStream.main();
        ParallelStreamBroken.main();
        ParallelStreamBrokenTrue.main();
    }
}
