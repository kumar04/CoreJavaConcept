package com.thread.threadlocal;
class MyThread extends Thread {
}
 
public class RunOfThreadClass{
    public static void main(String[] args) {
           Thread thread1=new MyThread();
           thread1.start();
    }
 
}