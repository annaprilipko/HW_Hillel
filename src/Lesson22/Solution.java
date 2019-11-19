package Lesson22;

import Lesson22.Fibonachy.Fibonachy;
import Lesson22.Fibonachy.PairOfFibonachy;
import Lesson22.Stopwatch.IStopwatchObserver;
import Lesson22.Stopwatch.Stopwatch;

import java.math.BigInteger;
import java.util.concurrent.*;

public class Solution {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        /**
         * Реализовать подсчет факториала в отдельном классе для запуска в потоке с поддержкой отмены.
         * Подробно выводить каждый шаг программы.
         */

        Factorial factorial = new Factorial();
        Future<BigInteger> resultFactorial = executorService.submit(factorial);

        try {
            BigInteger mainResultFactorial = resultFactorial.get(3, TimeUnit.MILLISECONDS);
            System.out.println("Factorial is " + mainResultFactorial);
        } catch (InterruptedException e) {
            System.out.println("Current thread was interrupted/cancelled");
            resultFactorial.cancel(true);
            System.out.println("Factorial has been cancelled");
        } catch (ExecutionException e) {
            System.err.println("Internal factorial exception: " + e.getMessage());
        } catch (TimeoutException e){
            resultFactorial.cancel(true);
            System.out.println("Factorial has timed out and cancelled");
        }

        /**
         * Реализовать подсчет чисел Фибоначчи с сохранением последней пары чисел в полях класса задачи
         * (отдельный класс для задачи; поддержка отмены). Реализовать возможность продолжить
         * вычисления с момента окончания, используя шаблон State. Подробно выводить каждый шаг программы.
         */

        PairOfFibonachy pairOfFibonachy = new PairOfFibonachy(BigInteger.valueOf(1),BigInteger.valueOf(1));
        Fibonachy fibonachy = new Fibonachy(pairOfFibonachy);
        Future<BigInteger> resultFibonachy = executorService.submit(fibonachy);

        try {
            BigInteger resultBigInteger = resultFibonachy.get();
            System.out.println("Result");
            System.out.println(resultBigInteger);
        } catch (InterruptedException e) {
            System.out.println("Current thread was interrupted/cancelled");
            resultFibonachy.cancel(true);
            System.out.println("Fibonachy has been cancelled");
        } catch (ExecutionException e) {
            System.err.println("Fibonachy factorial exception: " + e.getMessage());
        }

        PairOfFibonachy pairOfFibonachy2 = new PairOfFibonachy(pairOfFibonachy.getNumber1(),pairOfFibonachy.getNumber2());
        Fibonachy fibonachy2 = new Fibonachy(pairOfFibonachy2);
        Future<BigInteger> resultFibonachy2 = executorService.submit(fibonachy2);

        try {
            BigInteger resultBigInteger2 = resultFibonachy2.get();
            System.out.println("Result");
            System.out.println(resultBigInteger2);
        } catch (InterruptedException e) {
            System.out.println("Current thread was interrupted/cancelled");
            resultFibonachy.cancel(true);
            System.out.println("Fibonachy has been cancelled");
        } catch (ExecutionException e) {
            System.err.println("Fibonachy factorial exception: " + e.getMessage());
        }

        /**
         * Реализовать секундомер (отдельный класс для задачи; поддержка отмены).
         * Добавить наблюдателей секундомера, используя шаблон Observer. Подробно выводить каждый шаг программы.
         */

        IStopwatchObserver observer = new LoggingStopwatchObserver();

        Stopwatch stopwatch = new Stopwatch(observer);
        Future<?> resultStopwatch = executorService.submit(stopwatch);

        try{
            resultStopwatch.get(10, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            System.out.println("Current thread was interrupted/cancelled");
            resultStopwatch.cancel(true);
            System.out.println("Stopwatch has been cancelled");
        }catch (ExecutionException e){
            System.err.println("Stopwatch exception: " + e.getMessage());
        }catch (TimeoutException e){
            resultStopwatch.cancel(true);
            observer.StopwatchEnds();
            System.out.println("Stopwatch has timed out and cancelled");
        }

        /**
         * Реализовать копирование файловых потоков (отдельный класс для задачи; поддержка отмены).
         * Подробно выводить каждый шаг программы.
         */

        Copy copy = new Copy();
        Future<?> resultCopy = executorService.submit(copy);

        try{
            resultCopy.get(2, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            System.out.println("Current thread was interrupted/cancelled");
            resultCopy.cancel(true);
            System.out.println("Copy has been cancelled");
        }catch (ExecutionException e){
            System.err.println("Copy factorial exception: " + e.getMessage());
        }catch (TimeoutException e){
            resultCopy.cancel(true);
            System.out.println("Copy has timed out and cancelled");
        }


        executorService.shutdown();
    }


    private static class LoggingStopwatchObserver implements IStopwatchObserver {
        @Override
        public void StopwatchStarts() {
            System.out.println("Stopwatch starts");
        }

        @Override
        public void StopwatchEnds() {
            System.out.println("Stopwatch ends");
        }
    }




}
