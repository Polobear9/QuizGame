package GameTools;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    protected static int userPoint;
    protected static String userName;

    //if user, use a this class. user must set a Name userself.
    User() {
        System.out.println("Place Set the User Name : ");
        String userName = sc.nextLine();
        setUserName(userName);

    }

    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static int getUserPoint() {
        return userPoint;
    }

    public static void addTheUserPoint(int userPoints) {
        userPoint += userPoints;
    }

    public static String getUserName() {
        return userName;
    }
}
