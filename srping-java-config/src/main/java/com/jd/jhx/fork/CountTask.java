package com.jd.jhx.fork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * Created by jihaixiao on 2016/11/30.
 */
public class CountTask extends RecursiveTask<Integer>{

    private static final int THRESHOLD = 2;

    private int start;

    private int end;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        int sum = 0;

        boolean canCompute = (end - start) <= THRESHOLD;
        if (canCompute){
            for (int i = start;i<=end;i++){
                sum+=i;
            }
        }else {
            int mid = (start + end) /2;
            CountTask leftTask = new CountTask(start,mid);
            CountTask rightTask = new CountTask(mid+1,end);
            leftTask.fork();
            rightTask.fork();

            int leftResult = leftTask.join();
            int rightResult = rightTask.join();
            sum = leftResult + rightResult;
        }
        return sum;

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CountTask task = new CountTask(1,4);
        Future<Integer> result = forkJoinPool.submit(task);
        System.out.println(result.get());
    }

}
