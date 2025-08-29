import java.lang.*;
class MyThread extends Thread
{
  public void run()
{
 System.out.println("Inside run method");
}
 public static void main(String[] args)
{
 Thread.currentThread().setPriority(6);
 System.out.println("Main thread priority:"+Thread.currentThread().getPriority());
 MyThread t1=new MyThread();
 System.out.println("t1 thread priority:"+t1.getPriority());
}
}
