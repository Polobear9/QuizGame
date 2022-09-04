package GameTools;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    private int userPoint;
    private String userName;

    //if user, use a this class. user must set a Name userself.
    User() {
        System.out.println("Place Set the User Name : ");
        String userName = sc.nextLine();
        this.setUserName(userName);
    }

    public int getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }

    public void addTheUserPoint(int userPoint) {
        this.setUserPoint(this.getUserPoint() + userPoint);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

