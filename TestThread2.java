import java.util.Random;
class Even extends Thread{
    public int num;
    Even(int num){
      this.num=num;
    }
    public void run(){
      System.out.println("Thread Name:Even Thread and " +num+ " has square "+(num*num));
   }
}
class Odd extends Thread{
     public int num;
    Odd(int num){
      this.num=num;
    }
    public void run(){
      System.out.println("Thread Name: Odd Thread and "+num+" has cube "+(num*num*num));
   }
}
class TestThread2 extends Thread{
   int num;
   Random r=new Random();
   @Override
   public void run(){
     for(int i=1;i<=10;i++){
        num=r.nextInt(100);
     System.out.println("Main Thread and Generated Number is "+num);
     if(num%2==0){
       Even t1=new Even(num);
       t1.start();
     }
     else{
        Odd t2=new Odd(num);
        t2.start();
     }
  try{
       Thread.sleep(1000);
      }
    catch(InterruptedException e){
     System.out.println(e);  
      }  
     }
   }
public static void main(String[] args){
    TestThread2 a=new TestThread2();
    a.start();
}
}