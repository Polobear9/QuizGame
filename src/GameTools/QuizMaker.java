package GameTools;

import java.util.Random;
import java.util.Scanner;

public class QuizMaker extends User {
    private static Random ran = new Random();
    private static Scanner sc = new Scanner(System.in);
    private static int numberRange;
    private static int quizRange;

    //when you use a this system. you can choose the Quiz Number Range and Quiz question Range.
    public static void QuizMakers() {
        System.out.println("Place Select the Number for Quiz Number Range : (1) 1 ~ 10 (2) 1 ~ 30 (3) 1 ~ 50");
        int range = sc.nextInt();
        switch (range) {
            case 1:
                setnumberRange(10 + 1); //the question are can limit. 1 ~ 10.
                break;
            case 2:
                setnumberRange(30 + 1); //the number will 1 ~ 30 limit.
                break;
            case 3:
                setnumberRange(50 + 1); // number will limit 1　~ 50.
                break;
            default:
                break;
        }

        // after the sellect the Quiz Number Range, you can sellect the Quiz Question Range. how many question you want?
        System.out.println("Place Select the Number for Quiz Question Range : (1) 1 ~ 3 (2) 1 ~ 5 (3) 1 ~ 10");
        int quizrange = sc.nextInt();
        switch (quizrange) {
            case 1:
                setquizRange(3); //just 3 question user have.
                break;
            case 2:
                setquizRange(5); // 5question user have.
                break;
            case 3:
                setquizRange(10); // 10 question user have.
                break;
            default:
                break;
        }

        maker();
    }

    //		---- > beens < ----
    public static int getquizRange() {
        return quizRange;
    }

    public static int getnumberRange() {
        return numberRange;
    }

    public static void setquizRange(int quizRanges) {
        quizRange = quizRanges;
    }

    public static void setnumberRange(int numberRanges) {
        numberRange = numberRanges;
    }
//		---- > beens < ----


    // you must use a user class instance ex : QuizMaker.maker(user1);
    public static void maker() {

        //this (for) sentence get a quizRange from this.quizRange [first you use a this maker method you can choose the Range.]
        for (int i = 0; i < getquizRange(); i++) {
            int Number = ran.nextInt(getnumberRange()) + 1;
            int Number1 = ran.nextInt(getnumberRange()) + 1;

            int Question = Number + Number1;


            //Question is make by Random() class. and Question Number is use a (i) word from (for)sentence.
            System.out.println("Quiz" + (i + 1) + " " + (Number) + " + " + (Number1) + " ?");
            System.out.println("Place Enter the Answer the this Quiz : ");

            //is asnwer variable and Question variable -- > user is correct the answer. else user could not have a point.
            int answer = sc.nextInt();
            if (answer == Question) {
                User.addTheUserPoint(1);
                System.out.println("Good !");
            } else {
                User.addTheUserPoint(0);
                System.out.println("Ooops..");
            }
        }

        //out of (for) sentence system will notice a result of user point and user name.
        System.out.println("Weldone ! " + User.getUserName() + " Your Point is " + User.getUserPoint() + " .");
    }
}