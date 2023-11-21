/*
    (runs on)
    Software --> Operating System --> Hardware.

    Multiple softwares can run at the same time.

    Extends Thread
    Thread.sleep()
    Thread.setPriority()

    Implements Runnable , Thread n = new Thread(obj) n.start();

    Using Anonymous class for implementing runnable

    syscronised keyword.

//1. 1st method

class Bear extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Griffin");
            // make the thread spleep
            try{Thread.sleep(100);}catch(Exception e){} // We make the thread sleep so that thread 2 will work simultaneously.
        }
    }
}

class Dear extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Annshual");

            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}
 */

//2nd method:

class Bear implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Griffin");
            // make the thread spleep
            try{Thread.sleep(50);}catch(Exception e){} // We make the thread sleep so that thread 2 will work simultaneously.
        }
    }
}

class Dear implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Annshual");

            try{Thread.sleep(50);}catch(Exception e){}
        }
    }
}

class Bouncer{
    int count;
    public synchronized void bounce(){
        count++;
    }
}

public class ThreadsLesson {

    public static void main(String[] args) throws InterruptedException {
        
    /* Make two threads run in parallel 

    1. (Extending thread class)
        Bear b1 = new Bear();
        Dear d1 = new Dear();
        b1.setPriority(Thread.MAX_PRIORITY);
        b1.start();
        d1.start();                    */

    /* 2. (Creating thread objects using implemented runnable)

        Runnable b1 = new Bear();
        Runnable d1 = new Dear();

        // Create threads (t1,t2) object and using the runnable object b1,d1
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(d1);
        
        t1.start();
        t2.start();                     */
    /* 
    3. (Use Anonymous class to implement the threads.)

        Runnable bear = new Runnable(){
            public void run(){
                for (int i=0;i<10;i++){
                    System.out.println("Griffin");
                }
            }
        };
    */
        Bouncer b = new Bouncer();
        // implementing runnable (functional interface) using lambda function

        Runnable bear = () -> {
            for(int i=0;i<1000;i++){
                b.bounce();
            }
        };

        Runnable child = () -> {
            for(int i=0;i<1000;i++){
                b.bounce();
            }
        };

        Thread t1 = new Thread(bear);
        Thread t2 = new Thread(child);

        t1.start(); // Begin the execution of the thread.
        t2.start();

        // t1.join();   // Wait till the thread die (end.)
        // t2.join();   // Running each thread one by one.

        // Adding synchronized keyword to bounce method [ make sure that that method is hit by only one thread at a time.]
        // Else it may be hit by both t1 and t2 at a time , this make it execute only once instead of twice.
        try{Thread.sleep(10);}catch(Exception e){}
        System.out.println(b.count);
/*
 It is not advised to use mutation in threads as it may cause defects
 */
    } 
}
