package GameTools;

import java.util.Random;
import java.util.Scanner;

public class QuizMaker extends User {
    private final static Random ran = new Random();
    private final static Scanner sc = new Scanner(System.in);

    private static int numberRange;
    private static int quizQuestionRange;

    //when you use this system. you can choose the Quiz Number Range and Quiz question Range.
    public static void quiz_Makers() {
        User user = userSetting();
        setQuizNumberRange();
        // after the sellect the Quiz Number Range, you can sellect the Quiz Question Range. how many question you want?
        selectQuestionRange();

        maker(user);
    }

    private static User userSetting() {
        User user = new User();
        System.out.println("Place Enter the user name...");
        user.setUserName(sc.nextLine());
        return user;
    }

    private static void selectQuestionRange() {
        System.out.println("Place Select the Number for Quiz Question Range : (1) 1 ~ 3 (2) 1 ~ 5 (3) 1 ~ 10");
        int quizrange = sc.nextInt();
        switch (quizrange) {
            case 1:
                setQuizQuestionRange(3); //just 3 question user have.
                break;
            case 2:
                setQuizQuestionRange(5); // 5question user have.
                break;
            case 3:
                setQuizQuestionRange(10); // 10 question user have.
                break;
            default:
                break;
        }
    }

    private static void setQuizNumberRange() {
        System.out.println("Place Select the Number for Quiz Number Range : (1) 1 ~ 10 (2) 1 ~ 30 (3) 1 ~ 50");
        int range = sc.nextInt();
        switch (range) {
            case 1:
                setNumberRange(10 + 1); //the question are can limit. 1 ~ 10.
                break;
            case 2:
                setNumberRange(30 + 1); //the number will 1 ~ 30 limit.
                break;
            case 3:
                setNumberRange(50 + 1); // number will limit 1　~ 50.
                break;
            default:
                break;
        }
    }

    //		---- > beens < ----
    public static int getNumberRange() {
        return numberRange;
    }

    public static void setNumberRange(int number) {
        numberRange = number;
    }

    public static int getQuizQuestionRange() {
        return quizQuestionRange;
    }

    public static void setQuizQuestionRange(int QuestionRange) {
        quizQuestionRange = QuestionRange;
    }
//		---- > beens < ----


    // you must use a user class instance ex : QuizMaker.maker(user1);
    public static void maker(User user) {

        //this (for) sentence get a quizRange from this.quizRange [first you use this maker method you can choose the Range.]
        for (int i = 0; i < getQuizQuestionRange(); i++) {
            int Number = ran.nextInt(getNumberRange()) + 1;
            int Number1 = ran.nextInt(getNumberRange()) + 1;

            int Question = Number + Number1;


            //Question is make by Random() class. and Question Number is use a (i) word from (for)sentence.
            System.out.println("Quiz" + (i + 1) + " " + (Number) + " + " + (Number1) + " ?");
            System.out.println("Place Enter the Answer the this Quiz : ");

            //is asnwer variable and Question variable -- > user is correct the answer. else user could not have a point.
            int answer = sc.nextInt();
            if (answer == Question) {
                user.addUserPoint(1);
                System.out.println("Good !");
            } else {
                user.addUserPoint(0);
                System.out.println("Ooops..");
            }
        }

        //out of (for) sentence system will notice a result of user point and name.
        System.out.println("Weldone ! " + user.getUserName() + " Your Point is " + user.getUserPoint() + " .");
    }
}