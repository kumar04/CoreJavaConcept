package com.thread.threadlocal;
public class MyClass  {
    
    public static void main(String[] args) throws InterruptedException {
           
           synchronized (args) {
                  System.out.print("1 ");
                  args.wait();
                  System.out.print("2 ");
           }
                        
    }
 
}