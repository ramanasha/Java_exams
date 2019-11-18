class MainStudent{
  public static void main(String[] args) {
    Student stu1=new Student();
    stu1.setStudent(1000,"ramana");
    stu1.getStudent();
    Student stu2=new Student();
    stu2.setStudent(1001);
    stu2.getStudent();
    Student stu3=new Student();
    stu3.setStudent("Ramana@g1");
    stu3.getStudent();
    Student stu4=new Student();
    stu4.setStudent();
    stu4.getStudent();
    Student stu5=new Student();
    stu5.setStudent("Ramana@g1",2222);
    stu5.getStudent();

  }
}
