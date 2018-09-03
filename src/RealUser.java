public class RealUser extends User{
    private int points;

    public RealUser(String name, String email, String password, Profile profile) {
        super(name, email, password, profile);
        this.points = 0;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
