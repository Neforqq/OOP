package university;
public class Portal {

    private String login;
    private int access;
    private String schedule;
    private int courseAccess;
    private String[] alerts;

    public Portal(String login, int access, String schedule, int courseAccess, String[] alerts) {
        this.login = login;
        this.access = access;
        this.schedule = schedule;
        this.courseAccess = courseAccess;
        this.alerts = alerts;
    }

    public String getLogin() {
        return login;
    }

    public void sendMessage() {
    }

    void viewGrades() {
    }

    @Override
    public String toString() {
        return "Portal user=" + login;
    }
}