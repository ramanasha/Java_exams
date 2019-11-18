class tesst {
  public static void main(String arrr[]) {
            // int x=1;
            // while (x<5) {
            //   System.out.println(x);
            //   x++;

            // int x=1;
            // while (x<11) {
            //   System.out.println(x);
            //   x++;

            // int x=1;
            // while (x<=10){
            //   System.out.println(x);
            //   x=x+2;

            // int x=1;
            //  int y;
            // while (x<=5){ y=x;
            //   System.out.println(y *y);
            //   x=x+1;

            // int x=2;
            // while (x<=11){
            //   System.out.println(x);
            //   x=x+2;

            // int x=5;
            // while (x<=26){
            //   System.out.println(x);
            //   x=x+5;
            //  x=x*1;


            // int x=1;
            // while (x<=5){
            //   System.out.print(x);
            //   System.out.print("*");
            //   x=x+2;

            // int x=1;
            // while (x<=5){
            //   System.out.print(x);
            //   System.out.println("*");
            //   x=x+1;

            //             int x=1;
            //               int y=1;
            //             while (x<=5){
            //
            //               while (y<=3){
            //                 System.out.print(y);
            //                 y++;
            //
            //             }
            //               System.out.println(x);
            //               x++;
            // }

//Q1
                // int x=1;
                // while (x<=5){
                //   int y=1;
                //   while (y<=4){
                //     System.out.print("*");
                //     y++;
                //
                // }
                //   System.out.println("*");
                //   x++;
                // }
//Q2
                // int x=1;
                //
                // while (x<=5){
                //   int y=1;
                //   while (y<=4){
                //     System.out.print(x);
                //     y++;
                // }
                //   System.out.println();
                //   x++;
                // }
//Q3
                // int x=5;
                //
                // while (x>=1){
                //   int y=1;
                //   while (y>=1){
                //     System.out.print(x);
                //     y--;
                // }
                //   System.out.println();
                //   x--;
                // }

              //qs2
              // int x=1;
              //
              // while (x<=5){
              //   int y=1;
              //   while (y<=4){
              //     System.out.print(x);
              //     y++;
              // }
              //   System.out.println();
              //   x++;
              // }

// Q7
              // int a=1,b=1;
              // int x;
              // do {
              //   x=6;
              //   do {
              //     System.out.print("");
              //     x--;
              //   } while (x>=a);
              //   b=1;
              //   do {
              //     System.out.print(b+"");
              //     b++;
              //   } while (b<=a);
              //   System.out.println("");
              //   a++;
              // } while (a<=6);





// Q8
              // for (int i=0; i<5; i++){
              //   for (int j=0; j<5-i; j++){
              //     System.out.print("");
              //   }
              //   for (int k=0; k<=i; k++ ) {
              //     System.out.print("*");
              //
              //   }
              //   System.out.println();
              // }


//for loop
              // for (int x=1; x<=5; x++ ) {
              //   System.out.println(x);
              // }

              // while (x<=5){
              //   int y=1;
              //   while (y<=4){
              //     System.out.print("*");
              //     y++;
              //
              // }
              //   System.out.println("*");
              //   x++;
              // }

//Q1 for nested

              // for (int i=0; i<=5; i++){
              //   for (int j=1; j<=4; j++){
              //     System.out.print("*");
              //   }
              //   System.out.println("*");
              // }


//Q2 for nested

                    //   for (int i=1; i<=5; i++){
                    //     for (int j=1; j<=4; j++){
                    // System.out.print(i);
                    // }
                    // System.out.println(i);
                    // }

  //Q3 for nested

                  // for (int i=5; i>=5; i--){
                  //   for (int j=5; j>=1; j--){
                  //   System.out.print(i);
                  //   }
                  //   System.out.println(i);
                  //   }


//Q1
                    //  int x=1;
                    // for (int i=0; i<5; i++){
                    //   for (int j=0; j<5; j++){
                    //     System.out.print("");
                    //   }
                    //   for (int k=0; k<=i; k++ ) {
                    //     System.out.print("*");
                    //
                    //   }
                    //   System.out.println();
                    // }

//break & countinue
                    // for (int x=1;x<5 ;x++ ) {
                    //   if (x==3){
                    //     break;
                    //   }
                    //   System.out.println(x);
                    // }


                    // while (x<11) {
                    //   System.out.println(x);
                    //   x++;
//arrays
                    // int[] x;
                    // x=new int[5];
                    // x[0]=5;
                    // x[1]=8;
                    // x[2]=9;
                    // x[3]=11;
                    // x[4]=7;
                    // for (int y=0;y<=4 ; y++ ) {
                    //
                    //   System.out.println(x[y]);
                    //   }

//8 subject mark total and average
                    int[] x;
                    x=new int[8];
                    x[0]=50;
                    x[1]=80;
                    x[2]=98;
                    x[3]=22;
                    x[4]=70;
                    x[5]=70;
                    x[6]=75;
                    x[7]=71;
                    int total=0;
                    double ave =0;
                    for (int y=0;y<=7 ; y++ ) {
                      total=total+x[y];
                      System.out.println("marks =" + (y+1) + "is" + x[y]);


                      }
                      ave =total/8.0;       // total/(double)        
                      System.out.println();
                      System.out.println("total is" + total);
                      System.out.println("average is " + ave);















        }
}
