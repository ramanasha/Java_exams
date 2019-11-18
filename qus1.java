class qus1 {
  public static void main(String[] args) {
    int a=3; int b=2; int c=1;
    a=b++ + c-- + ++a;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);


    b=--a + ++c + --a;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    b= --b - ++c - a++;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    a+=b -=c;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    c = b =a;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
