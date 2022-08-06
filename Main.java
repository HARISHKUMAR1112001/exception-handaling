/*Create a thread using Thread class and print the thread name */

import java.io.*;

class ThreadNaming extends Thread {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }
}

class Main {

  public static void main(String[] args) {
    ThreadNaming t1 = new ThreadNaming();

    t1.start();
  }
}
