package com.springboot.doma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDomaApplication {

	public static void main(String[] args) {
		new CopyOnWriteArrayList<>();
		new Vector<>();
		List<String> list=Collections.synchronizedList(new ArrayList<String>());
		Collections.synchronizedMap(null);
		new ConcurrentHashMap();
		new ReentrantLock();
		new ReentrantReadWriteLock();
		new CyclicBarrier();
		new Semaphore();
	}
}
