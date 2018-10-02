
package src;

/**
 *
 * @author @EduhFarias
 */

public class User extends Profile{
    private int points;

    public User(String name, String email, String password, String sex, String city, String address, String country, String birthday, String phone) {
        super(name, email, "user", password, sex, city, address, country, birthday, phone);
        this.points = 0;
    }

    public User(){}
    
    public void createAccount(String name, String email, String sex, String password, String city, String address, 
            String country, String birthday, String phone){
        User newUser = new User(name, email, sex, password, city, address, country,  birthday, phone);
        Data data = new Data();
        data = data.getData();
        data.getProfiles().add(0, newUser);
        data.setData(data);
    }
    
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}