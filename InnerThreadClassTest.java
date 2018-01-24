package com.thread.threadlocal;
public class InnerThreadClassTest{
    public static void main(String[] args) {
           System.out.println("1 ");
           InnerClass i=new InnerClass();
           i.start();
           System.out.println("2 ");
    }
           
    static class InnerClass extends Thread{
           public void run()throws RuntimeException{
                  throw new RuntimeException();
           }
    }
}

/*Program will compile as run() method can throw RuntimeException. 1 & 2 will be present in output and will 
throw java.lang.RuntimeException at runtime.*/