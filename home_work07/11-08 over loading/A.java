class A{

 int x;
  private A(){
   System.out.println("this is access modifire");
 }
//int x;
  A(int x){
   this();
   this.x=x;

 }
 void getx(){
   System.out.println("x " + this.x);
 }
}
















// class A{
//
// int x;
//  A(int x){
//    this.x=10;
//  }
//  void getx(){
//    System.out.println("x " + this.x);
//  }
// }










// class A{
//
// int x;
//  A(int x){
//    this.x=10;
//  }
//  void getx(){
//    System.out.println("x " + this.x);
//  }
// }










// class A{
//
// int x;
//  A(int x){
//    this.x=10;
//  }
//  void getx(){
//    System.out.println("x " + this.x);
//  }
// }











// class  B extends A{
//
//  B(int y){
//    this.y=5;
//  }
//  void gety(){
//    System.out.println("Y " + this.y);
//  }
// }
//
//
// class Inheritance{
// public static void main (String args[]){
//  A objA = new A();
//  objA.getx();
 //objB.gety();

 /*B objB = new B();
 objB.gety();
 objB.getx();*/
// }
//
// }
