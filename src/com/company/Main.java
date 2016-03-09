package com.company;

public class Main {

    public static void main(String[] args) {
	// the for loop
        //https://www.youtube.com/watch?v=rjkYAs6gAkk
        //http://learnjavaonline.org/en/Loops
        //https://www.youtube.com/watch?v=s3k0l_e8afQ

       // for (int i = 0; i < 3; i++) {

           /* int i = 0;
            i < 3 // 0 < 3 = true
            // Inside of loop
            i++ // i is now 1
            i < 3 // 1 < 3 = true
            // Inside of loop
            i++ // i is now 2
            i < 3 // 2 < 3 = true
            // Inside of loop
            i++ // i is now 3
            i < 3 // 3 < 3 = false
            // Loop is done...*/

        //for(int counter=1; counter<=10; counter++){
        //for(int counter=1; counter<=10; counter+=3){
        /*for(int counter=6; counter<=21; counter+=3){
            //for(where you want to start or variable; where you want to end, checking is it true or false; how much you want to increment by)
            System.out.println(counter);*/

        /*for (int count=0; count<5; count++){
            System.out.println("The current value of count is " + count);*/
        /*for (int numA=0, numB=10; numA<5 && numB>0; numA++, numB--){
            System.out.println("The current value of numA is " + numA);
            System.out.println("The current value of numB is " + numB);*/

        //while loop
       // https://www.youtube.com/watch?v=8ZuWD2CBjgs

        /*int counter = 0;
        while (counter < 10){
            System.out.println(counter);
            counter++;*/

        //one of the exercises for the link that you sent me: https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
        int mark = 49;         // set the value of mark here!
        System.out.println("The mark is " + mark);

        if (mark>=50 ) {
            System.out.println( "PASS" );
        } else {
            System.out.println( "false" );
        }
    }
}

