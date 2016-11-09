package cn.com.jd.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * Created by jihaixiao on 2016/11/8.
 */
public class CopyOnWrite {

//    static List<String> list = new CopyOnWriteArrayList<String>();

    static List<String> list = new ArrayList<String>();

    static CountDownLatch count = new CountDownLatch(500);

    public static void main(String[] args) throws InterruptedException {
//        list.add("abc");
        long s = System.currentTimeMillis();
        for (int i = 0; i< 500;i++){
            TsThread t = new TsThread();
            t.start();
        }
        count.await();
        System.out.println(System.currentTimeMillis() - s);
    }


    static class TsThread extends Thread{
        @Override
        public void run() {
//            System.out.println(list.get(0));
            list.add("abc");
            System.out.println(Thread.currentThread().getId());
            count.countDown();
        }
    }
}
