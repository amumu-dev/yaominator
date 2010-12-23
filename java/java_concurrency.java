/*
 * Two ways 
 * 1. implements Runnable 
 * 2. extends Thread 
 */

public class HelloRunnable implements Runnable {
    public void run()
    {
    }
}

public class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }
}

/*
 * Thread.sleep causes the current thread to suspend execution for a specified period.
 */

/* The join method allows one thread to wait for the completion of another.
 * If t is a Thread object whose thread is currently executing,
 */
    t.join();

/*
 * The Java programming language provides two basic synchronization idioms: synchronized methods and synchronized statements.
 */
public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}

/*
 * http://download.oracle.com/javase/tutorial/essential/concurrency/locksync.html
 * Synchronization is built around an internal entity known as the intrinsic lock or monitor lock.
 * 
 * Every object has an intrinsic lock associated with it.
 * 
 * When a thread invokes a synchronized method, it automatically acquires the intrinsic lock for that
 * method's object and releases it when the method returns. 
 *
 * In this case, the thread acquires the intrinsic lock for the Class object associated with the class. 
 * Thus access to class's static fields is controlled by a lock that's distinct from the lock for any instance of the class.
 *
 *
 */

public void addName(String name) {
    synchronized(this) {
        lastName = name;
        nameCount++;
    }
    nameList.add(name);
}

public class MsLunch {
    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void inc1() {
        synchronized(lock1) {
            c1++;
        }
    }

    public void inc2() {
        synchronized(lock2) {
            c2++;
        }
    }
}

/*
 * Atomic Access
 *
 * Reads and writes are atomic for reference variables and for most primitive variables (all types except long and double).
 * Reads and writes are atomic for all variables declared volatile (including long and double variables).
 * 
 * This means that changes to a volatile variable are always visible to other threads. 
 * What's more, it also means that when a thread reads a volatile variable, it sees not just the latest change to the volatile, 
 * but also the side effects of the code that led up the change.
 * 
 */

public class Drop {
    //Message sent from producer to consumer.
    private String message;
    //True if consumer should wait for producer to send message, false
    //if producer should wait for consumer to retrieve message.
    private boolean empty = true;

    public synchronized String take() {
        //Wait until message is available.
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        //Toggle status.
        empty = true;
        //Notify producer that status has changed.
        notifyAll();
        return message;
    }

    public synchronized void put(String message) {
        //Wait until message has been retrieved.
        while (!empty) {
            try { 
                wait();
            } catch (InterruptedException e) {}
        }
        //Toggle status.
        empty = false;
        //Store message.
        this.message = message;
        //Notify consumer that status has changed.
        notifyAll();
    }
}


import java.util.Random;

public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
        Random random = new Random();

        for (int i = 0; i < importantInfo.length; i++) {
            drop.put(importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
        drop.put("DONE");
    }
}

import java.util.Random;

public class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        Random random = new Random();
        for (String message = drop.take(); ! message.equals("DONE");
                message = drop.take()) {
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
    }
}
          
public class ProducerConsumerExample {
    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}

/*
 * A Strategy for Defining Immutable Objects
 * 
 * Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
 * Make all fields final and private.
 * Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final. 
 * A more sophisticated approach is to make the constructor private and construct instances in factory methods.
 * 
 * If the instance fields include references to mutable objects, don't allow those objects to be changed:
        Don't provide methods that modify the mutable objects.
        Don't share references to the mutable objects. Never store references to external, mutable objects passed to the constructor; if necessary, create copies, and store references to the copies. Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.
 */

