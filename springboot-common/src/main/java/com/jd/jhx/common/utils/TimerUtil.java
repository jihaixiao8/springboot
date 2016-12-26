package com.jd.jhx.common.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantLock;

public class TimerUtil extends ReentrantLock{

	private static final long serialVersionUID = -2318013654844201089L;
	
	public static Map<String, Integer> IP_USER_TIME = new HashMap<>();

	private static final TimerUtil SINGLETON = new TimerUtil();

	private TimerUtil(){
		super();
	}

	public static TimerUtil getInstance(){
		return SINGLETON;
	}

	//5分钟后计数器 -1
	public void notDefined (final String key){
		 Timer timer = new Timer();  
		 timer.schedule(new TimerTask() {  
			 public void run() {  
				 System.out.println("-------设定MAP缓存中对应Key的Value,5分钟后value减一--------");
				 lock();
				 try {
					 int number = IP_USER_TIME.get(key);
					 number--;
					 IP_USER_TIME.put(key,number);
				 } finally {
					unlock();
				 }

			 }  
		 }, 1000*60);// 设定指定的时间time,此处为5000毫秒  
	}
	
	// 查询缓存中是否存在该IP
	public boolean get(String key){
		lock();
		try {
			return IP_USER_TIME.get(key) == null;
		} finally {
			unlock();
		}
	}
	// 对相应IP的计数器 +1
	public void addNum(String key) {
		lock();
		try {
			int number = IP_USER_TIME.get(key);
			number++;
			IP_USER_TIME.put(key, number);
		} finally {
			unlock();
		}
	}
	// 添加新的IP 
	public void addIP(String key){
		lock();
		try {
			IP_USER_TIME.put(key, 1);
		} finally {
			unlock();
		}
	}
	// 查询对应IP计数器 number
	public int getNumber(String key){
		lock();
		try {
			return IP_USER_TIME.get(key);
		} finally {
			unlock();
		}
	}
}

