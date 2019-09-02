class MyModel1 {
  
  String lock="No lock";
  int cam=2,display=5;
  public MyModel1(){
   //MyModel1 obj = new MyModel1();
      System.out.println("Features of MyModel 1\nCamera mega pixels: "+cam);
  }
}
class MyModel2 extends MyModel1 {
    public MyModel2(){
      this.cam=5;
      this.lock="Fingerprint";
  System.out.println("Features of MyModel 2\nCamera mega pixels: "+ cam+"\nLock mechanism: "+lock+"\nDisplay size: "+display);
    }
     
}
class MyModel2T extends MyModel2 {
       public MyModel2T(){
      this.cam=16;
      //this.lock="Fingerprint";
         this.display=6;
  System.out.println("Features of MyModel 2T\nCamera mega pixels: "+cam+"\nLock mechanism: "+lock+"\nDisplay size: "+display);
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
      MyModel2T obj = new MyModel2T();
         
    }
}