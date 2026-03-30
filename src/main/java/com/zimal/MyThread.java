package com.zimal;

//Implement runnable interfacee
class MyThread implements Runnable {

    // run() method define main work of thread,
    public void run() {

        // thread start print msg
        System.out.println("Thread is Running");

        try {
            // pause thread 2sec
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // if thread interupt exception handle
            System.out.println(e);
        }

        // when run() method complate print this msg
        System.out.println("Thread Work Finished");
    }

    public static void main(String[] args) {

        // Runnable class ka object banaya
        MyThread Mthread = new MyThread();

        // Runnable object ko Thread me pass kiya
        Thread t1 = new Thread(Mthread);

        // thread start kiya (JVM run() ko internally call karegi)
        t1.start();

        // main thread ka output
        System.out.println("Main thread is start..");
    }
}