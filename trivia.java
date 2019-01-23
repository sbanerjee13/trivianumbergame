import java.util.*;
import java.io.*;

class trivia {
    public static int op = 0;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, counter=0;
        int score = 0;
        boolean correctAnswer;

        System.out.println("How many questions would you like on today's trivia?");

        int result = in.nextInt();

        while(counter < result && score >= 0){

            System.out.println("Input two numbers.");

            a = in.nextInt();
            b = in.nextInt();

            System.out.println("What is " + a + " " + solution(a, b) + " " + b + "?");

            correctAnswer = (in.nextInt() == op) ? true : false;

            if (correctAnswer == true) {
                score++;
                System.out.println("Correct! You gained a point! Current score: " + score);
            } else {
                score--;
                System.out.println("That's incorrect, sorry! You lost a point. Current score: " + score);
            }


            counter++;

        }


        if(score < 0){
            System.out.println("Sorry, you failed today's trivia. Better luck next time!");
        }else{
            System.out.println("Congratulations! You completed today's trivia with " + score + " points!");
        }

    }



    public static String solution(int a, int b){
        String operation = ""; int test;
        Random rand = new Random();
        test = rand.nextInt(4);
        switch(test){
            case 1 :
                operation = "+";
                op = a+b;
            break;

            case 2 :
                operation = "-";
                op = a-b;
            break;

            case 3 :
                operation = "*";
                op = a*b;
            break;

            case 4 :
                operation = "*";
                op = a*b;
            break;

            default :
                operation = "+";
                op = a+b;
        }
        return operation;
    }
}
