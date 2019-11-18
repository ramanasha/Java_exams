class Marks extends Subject{
  int [] marks;

  Marks(int id,String name, String[] sub, int[] marks){
    super(id,name,sub);
    this.marks=marks;
  }

  double [] totAvg(){
    double total=0;
    double avg=0;
    double [] a = new double[2];

    for (int i=0;i<this.marks.length ;i++ ) {
      total=total+marks[i];
  }
  avg = total/marks.length;
  a[0]=total;
  a[1]=avg;
  return a;
  }

  void display(){
    super.display();
    String[] s=this.sub;
    int [] mark =this.marks;
    
    for (int i=0;i<marks.length ;i++ ) {
      System.out.println(s[i]+"\t" + mark[i]);

    }

    double [] b =this.totAvg();
    System.out.println("total\t" +b[0]);
    System.out.println("avrahe\t" +b[1]);
  }
}
