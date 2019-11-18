class Student{
	int id;
	String Name;
	int [] marks;

	Student(int id, String Name){
		this.id= id;
		this.Name= Name;
	}

	void SetMarks(int [] marks){
		this.marks = marks;
	}

	int CalTotal(){
		int total=0;
		for (int i = 0; i<marks.length; i++){
			total= total+marks[i];
		}
		return total;
	}

	double CalAvg(int total){
		double avg = total / marks.length;
		return avg;
	}

	char getgrade(double avg){
		char grade;

		if(avg >=70){
			grade = 'A';
		}

		else {
			grade = 'B';
		}
		return grade;
	}

	void display(){
		System.out.println(id);
		System.out.println(Name);

		int t = this.CalTotal();
		double a = this.CalAvg(t);
		System.out.println(t);
		System.out.println(a);
		char g = this.getgrade(a);
		System.out.println(g);
	}

}




















// class Student{
//   int id;
//   String name;
//     void SetStudent( int ids, String names){
//       id = ids;
//       name = names;
// }
//     void getStudent(){
//       System.out.println("id" + id);
//       System.out.println("name" + name);
//
//
//     }
// }










// class Student{
//   int id;
//   String name;
//     void SetStudent(){
//       id = 1000;
//       name = "Yarl IT";
// }
//     void getStudent(){
//       System.out.println("id" + id);
//       System.out.println("name" + name);
//
//
//     }
// }
