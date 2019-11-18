 class A{


	A(int x;){
		this.x=10;
	}
	void getx(){
		System.out.println("x " + this.x);
	}
}


class  B extends A{
	int y;
	B(){
		this.y=5;
	}
	void gety(){
		System.out.println("Y " + this.y);
	}
}


class Inheritance{
public static void main (String args[]){
	A objA = new A();
	objA.getx();
	//objB.gety();

	/*B objB = new B();
	objB.gety();
	objB.getx();*/
}

}
