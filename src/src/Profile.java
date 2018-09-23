/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author PC
 */
import java.util.*;

public class Profile {
    private String name;
    private String email;
    private String password;
    private String address;
    private String country;
    private DateB birthday;
    private String phone;
    private ArrayList<Content> sentContents = new ArrayList<>();
    private ArrayList<Content> favoriteContent = new ArrayList<>();
    private ArrayList<Content> exclusiveContent = new ArrayList<>();

    public Profile(String name, String email, String password, String address, String country, DateB birthday, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.country = country;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public DateB getBirthday() {
        return birthday;
    }

    public void setBirthday(DateB birthday) {
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
