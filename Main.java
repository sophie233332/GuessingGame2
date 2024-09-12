import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan =  new Scanner(System.in);

        int x = rand.nextInt(100);
        int guess;
        System.out.println("enter your first guess");
        guess = scan.nextInt();
        int count = 0;

        while(guess!=x){
            if(count<7){
                if(guess<x){
                    System.out.println("too low");
                    System.out.println("enter your first guess");
                    guess = scan.nextInt();
                    count++;

                }
                else if(guess>x){
                    System.out.println("too high");
                    System.out.println("enter your first guess");
                    guess = scan.nextInt();
                    count++;
                } 
                else {
                    System.out.println("You got an impossibly good score!");
                }

            }
            else if(count <11){
                if(guess<x){
                    System.out.println("too low");
                    System.out.println("enter your first guess");
                    guess = scan.nextInt();
                    count++;

                }
                else if(guess>x){
                    System.out.println("too high");
                    System.out.println("enter your first guess");
                    guess = scan.nextInt();
                    count++;
                } 
                else {
                    System.out.println("You did a good job");
                }

            }
            else {
                System.out.println("Try the divide and conquer strategy next time");
                break;

            }


        }


    }
}
