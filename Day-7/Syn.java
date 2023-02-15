class Source{

 //synchronized
 void display(String s){
System.out.print("[ "+s);
  try{Thread.sleep(2000);}catch(InterruptedException e){}
System.out.println(" ]");
}//

}//////

class ChildTh extends Thread{
Source ob; String str;

ChildTh(String st,Source s){str=st;ob=s; start();}
public void run()
{
synchronized(ob){
ob.display(str);}
}//

}/////




class Syn{
public static void main(String str[])
{
Source ob=new Source();
new ChildTh("AAAAA",ob);
new ChildTh("BBBBB",ob);
new ChildTh("CCCCC",ob);
new ChildTh("DDDDD",ob);

}
}