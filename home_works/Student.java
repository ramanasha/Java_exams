class Student{
  int id;
  String name;

  Student(int id, String name){
    this.id=id;
    this.name=name;
  }

  void  getStudent(){
    System.out.println("Id \t "+ id);
    System.out.println("name \t"+ name);
  }
}
