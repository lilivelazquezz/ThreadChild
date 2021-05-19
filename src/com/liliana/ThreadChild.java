package com.liliana;
//Java program to demostrate that a child thread gets same priority as parent

public class ThreadChild extends Thread {
    public void run(){
        System.out.println("Inside run method");
    }
    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        System.out.println("t1 thread priority ;" + Thread.currentThread().getPriority());
        ThreadChild t1 = new ThreadChild();
        // t1 thread is child od main thread
        // t1 thread will also have priority 6
        System.out.println("t1 thread priority ;" + t1.getPriority());

        // if two threads have same priority then we can '' expect which thread will execute first
        // First come, first serve

    }
}
