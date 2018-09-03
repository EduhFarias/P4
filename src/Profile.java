import java.util.*;
import java.util.Date;

public class Profile {
    private String address;
    private String country;
    private Date birthday;
    private String phone;
    private ArrayList<Content> sentContents = new ArrayList<>();
    private ArrayList<Content> favoriteContent = new ArrayList<>();
    private ArrayList<Content> exclusiveContent = new ArrayList<>();

    public Profile(String address, String country,
                   Date birthday, String phone) {
        this.address = address;
        this.country = country;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Content> getSentContents() {
        return sentContents;
    }

    public void setSentContents(ArrayList<Content> sentContents) {
        this.sentContents = sentContents;
    }

    public ArrayList<Content> getFavoriteContent() {
        return favoriteContent;
    }

    public void setFavoriteContent(ArrayList<Content> favoriteContent) {
        this.favoriteContent = favoriteContent;
    }

    public ArrayList<Content> getExclusiveContent() {
        return exclusiveContent;
    }

    public void setExclusiveContent(ArrayList<Content> exclusiveContent) {
        this.exclusiveContent = exclusiveContent;
    }
}
