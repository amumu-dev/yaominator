import java.util.concurrent.Executors; 
import java.util.concurrent.ExecutorService; 

/** 
* Java线程：线程池- 
* 
* @author Administrator 2009-11-4 23:30:44 
*/ 
public class ThreadPool{ 
        public static void main(String[] args) { 
                //创建一个可重用固定线程数的线程池 
                ExecutorService pool = Executors.newFixedThreadPool(2); 
                //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口 
                Thread t1 = new MyThread(); 
                Thread t2 = new MyThread(); 
                Thread t3 = new MyThread(); 
                Thread t4 = new MyThread(); 
                Thread t5 = new MyThread(); 

                t1.settname("t1");
                t2.settname("t2");
                t3.settname("t3");
                t4.settname("t4");
                t5.settname("t5");

                //将线程放入池中进行执行 
                pool.execute(t1); 
                pool.execute(t2); 
                pool.execute(t3); 
                pool.execute(t4); 
                pool.execute(t5); 
                //关闭线程池 
                pool.shutdown(); 
        } 
} 

class MyThread extends Thread{ 
        private String tname ;

        public void settname( String name ){
                tname = name ; 
        }

        @Override 
        public void run() { 
                System.out.println(Thread.currentThread().getName()+"正在执行。。。" + tname ); 
        } 

}
