package GameTools;

public class User {
    protected int userPoint;
    protected String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPoint() {
        return userPoint;
    }

    public void addUserPoint(int userPoints) {
        userPoint += userPoints;
    }

    public String getUserName() {
        return this.userName;
    }
}
