class Student1{

  int id;
  String name;
  int m1,m2,m3;
  int total;
  double avg;
  void setStudent1(int id,String name){
    this.id=id;
    this.name=name;

  }
  void setMarks(int m1,int m2,int m3){
    this.m1=m1;
    this.m2=m2;
    this.m3=m3;
  }
  void calTotal(){
    this.total=this.m1+this.m2+this.m3;
  }
  void calAvg(){
    this.avg=this.total/3.0;
  }
  void display(){
    System.out,println("Student id \t" + this.id);
    System.out,println("Student name\t" + this.name);
    System.out,println("Student M1 \t" + this.m1);
    System.out,println("Student M2 \t" + this.m2);
    System.out,println("Student M3 \t" + this.m3);
    System.out,println("total \t" + this.total);
    System.out,println("Average \t" + this.avg);
  }
}
