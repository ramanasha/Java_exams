class Student{
  int id;
  String name;
  Student(int id, String name){
    this.id=id;
    this.name=name;
  }
  Student(int id){
    this.id=id;
    this.name="sharma";
  }
  Student(String name){
    this.id=2000;
    this.name=name;
  }
  Student(){
    this.id=1000;
    this.name="test";
  }
  Student(String name, int id){
    this.id=id;
    this.name=name;
  }


  void getStudent(){
    System.out.println(id);
    System.out.println(name);
  }
}
