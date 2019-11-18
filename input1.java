import java.util.Scanner;
class input {
              public static void main(String[] args) {
              //   int [] marks;
              //   marks = new int [8];
              //   int total=0;
              //   int i=0;
              //   double ave=0;
              //   for (i=0; i<8; i++) {
              //     String name;
              //     Scanner scan=new Scanner(System.in);
              //     System.out.println("Please enter your Sub");
              //     marks[i]=scan.nextInt();
              //     total = total + marks [i];
              //   }
              //     ave =total / marks.length;
              //     System.out.println("total " + total);
              //     System.out.println("average" + ave);
              //   }
              int [] salary;
              int totalsalary =0;
              int netsalary;
              int bonus;
              int netbonus=0;
              int tax;
              int totalincome;



              for (i=0; i<12; i++ ) {
                int salary;
                Scanner scan=new Scanner(System.in);
                System.out.println("please enter the salary");
                salary[i]=scan.nextInt();
                totalsalary += salary[i];

                  if (salary> 50000) {
                    bonus=10/100*salary;

                  } else {
                    bonus =10/100*salary;
                  }
                    netbonus=netbonus+bonus;
                    netbonus=totalsalary+netbonus;
              }

              System.out.println("total basic salary is"+ totalsalary);
              System.out.println("total bonus is"+ netbonus);
              System.out.println("net salary is"+ netsalary);



}

}
