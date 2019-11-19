package Lesson22.Stopwatch;

import java.util.concurrent.Callable;

public class Stopwatch implements Callable<Integer> {

    private IStopwatchObserver observer;

    public Stopwatch(IStopwatchObserver observer) {
        this.observer = observer;
    }

    @Override
    public Integer call() throws Exception {
        stopwatch();
        return null;
    }

    public void stopwatch() throws Exception{
        observer.StopwatchStarts();
        int i = 0;
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(i);
            Thread.sleep(1000);
            i++;
        }
        observer.StopwatchEnds();
    }
}
