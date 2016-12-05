package com.jd.jhx.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jihaixiao on 2016/11/30.
 */
public class CyclicBarrierTest {

    private ExecutorService pool = Executors.newFixedThreadPool(50);

    private static CyclicBarrier barrier = new CyclicBarrier(51);


    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        CyclicBarrierTest test = new CyclicBarrierTest();
        test.test();
    }


    public void test() throws BrokenBarrierException, InterruptedException {
        for (int i=0;i<100;i++){
            System.out.println("分页次数："+i);
            for (int j=0;j<50;j++){
                pool.submit(new VenderTask(j));
            }
            barrier.await();
        }
    }



    class VenderTask implements Runnable{

        private int taskNum;

        public VenderTask(int taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务分解："+taskNum);
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

}
