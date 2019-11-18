class Employe{
  int id;
  String name;
  double basal;
  double bonus;
  void SetEmploye( int id, String name ){
    this.id = id;
    this.name = name;

}
void  Setbsalary(int basal){
  this.basal=basal;
}


    void calbonus(){
      // double bonus 20;
      // int x=10;
      if(basal>=50000){
      this.bonus=0.1*basal;
    } else {
      this.bonus=0.05*basal;
    }
    System.out.println("bonus" + bonus);
    //System.out.println(x);
    //System.out.println(this.x);
}
    void display(){
      System.out.println("Employe id " + id);
      System.out.println("Employe name " + name);
      System.out.println("Employe BasicSalary" + basal);
      System.out.println(bonus);
      System.out.println(basal + bonus);

    }
  }
