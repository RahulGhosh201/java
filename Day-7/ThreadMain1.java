class MyThread implements Runnable
{Thread t;
MyThread(String n){t=new Thread(this,n); t.start();}


public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread().getName()+" "+i+"\n\n");
try{t.sleep(500);}catch(InterruptedException e){}
}

}//run


}//////////////

class ThreadMain1{
public static void main(String str[])
{
new MyThread("A");
new MyThread("B"); new MyThread("C");

 for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread().getName()+" "+i+"\n\n");
try{Thread.sleep(500);}catch(InterruptedException e){}
}

}
}