
// Java program to illustrate
// ThreadPool
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task class to be executed (Step 1)
class Task implements Runnable {
  private String name;
  public int num = 1;

  public Task(String s) {
    name = s;
  }

  // Prints task name and sleeps for 1s
  // This Whole process is repeated 5 times
  public void run() {
    try {
      System.out.println(num);
      num++;
      System.out.println(name + " complete");
    }

    catch (Exception e) {
      e.printStackTrace();
    }
  }
}

public class Main {
  // Maximum number of threads in thread pool
  static final int MAX_T = 5;

  public static void main(String[] args) {
    // creates five tasks
    Runnable r1 = new Task("task 1");
    Runnable r2 = new Task("task 2");
    Runnable r3 = new Task("task 3");
    Runnable r4 = new Task("task 4");
    Runnable r5 = new Task("task 5");

    // creates a thread pool with MAX_T no. of
    // threads as the fixed pool size(Step 2)
    ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

    // passes the Task objects to the pool to execute (Step 3)
    pool.execute(r1);
    pool.execute(r2);
    pool.execute(r3);
    pool.execute(r4);
    pool.execute(r5);

    // pool shutdown ( Step 4)
    pool.shutdown();
  }
}
