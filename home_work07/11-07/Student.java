class Student{
  int id;
  String name;
  void setStudent(int id, String name){
    this.id=id;
    this.name=name;
  }
  void setStudent(int id){
    this.id=id;
    this.name="sharma";
  }
  void setStudent(String name){
    this.id=2000;
    this.name=name;
  }
  void setStudent(){
    this.id=1000;
    this.name="test";
  }
  void setStudent(String name, int id){
    this.id=id;
    this.name=name;
  }


  void getStudent(){
    System.out.println(id);
    System.out.println(name);
  }
}
