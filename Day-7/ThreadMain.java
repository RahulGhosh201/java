class MyThread extends Thread
{
MyThread(String n){super(n); System.out.println("My Thread started");start();}


public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(this+" "+i+"\n\n");
try{sleep(500);}catch(InterruptedException e){}
}

}//run


}//////////////

class ThreadMain{
public static void main(String str[])
{
new MyThread("A");
new MyThread("B"); new MyThread("C");

/* for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread()+" "+i+"\n\n");
try{Thread.sleep(500);}catch(InterruptedException e){}
}*/

}
}