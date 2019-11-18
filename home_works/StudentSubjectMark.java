class StudentSubjectMark{
  public static void main(String[] args) {
    String [] subj={"tamil","english", "maths"};
    int [] mark={77,55,77};

    Marks obj =new Marks (1,"ramana",subj,mark);
    obj.getStudent();
    obj.display();
  }
}
