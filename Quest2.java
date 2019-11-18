class Quest2 {
  public static void main(String[] args){
    // int x=10; int y=5;
    // System.out.println(x==y);
    // System.out.println(x!=y);
    // System.out.println(x<=y);
    // System.out.println(x>=y);
    // System.out.println(x>y);
    // System.out.println(x<y);
    // System.out.println(!(x<=y));
    // System.out.println(!x==y);


    //Logical peraters  &&
    // System.out.println(true&&true);
    // System.out.println(true&&false);
    // System.out.println(false&&true);
    // System.out.println(false&&false);
    //|| or
    // System.out.println(true||true);
    // System.out.println(true||false);
    // System.out.println(false||true);
    // System.out.println(false||false);
    // System.out.println("line1");
    // if (true) {
    //   System.out.println("line2");
    // } else {
    //   System.out.println("line3");
    // }

    // int x=50;
    // if (x>=10)
    // {
    //   System.out.println("fail");
    // }else{
    //     System.out.println("pass");
    //   }
// int x=50;
// if (x>=10)
//   System.out.println("fail");
// else
//     System.out.println("pass");

int x=110;
if(x>=0 && (x<=100)){
if ((x>75) && (x<=100)){
  System.out.println("A");
}
else if ((x>65) && (x<75)) {
  System.out.println("B");
}
  else if ((x>55) && (x<65)){
  System.out.println("C");
}
  else if ((x>45) && (x<55)){
  System.out.println("D");
}
  else {
  System.out.println("F");}


}

else {
  System.out.println("your mark wrong");
String Result = (x>=50)? "pass" : "fail";
System.out.println(Result);
}
}
}
