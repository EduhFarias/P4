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
    private String profile;
    private String password;
    private String sex;
    private String city;
    private String address;
    private String country;
    private String birthday;
    private String phone;
    private ArrayList<Product> myProducts = new ArrayList<>();

    public Profile(String name, String email, String profile, String password, String sex, String city, String address, String country, String birthday, String phone) {
        this.name = name;
        this.email = email;
        this.profile = profile;
        this.password = password;
        this.sex = sex;
        this.city = city;
        this.address = address;
        this.country = country;
        this.birthday = birthday;
        this.phone = phone;
    }

    public Profile(){
        
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Product> getMyProducts() {
        return myProducts;
    }

    public void setMyProducts(ArrayList<Product> myProducts) {
        this.myProducts = myProducts;
    }

    

    public Profile login(ArrayList<Profile> profiles, String email, String password){
        for(Profile current : profiles){
            if(current.getEmail().equals(email)){
                if(current.getPassword().equals(password)){
                    return current;
                }
            }
        }
        return null;
    }
    
    public void EditProfile(Profile profile, String name, String phone, String date, String sex, 
            String address, String city, String country, String email, String password){
        
        profile.setName(name);
        profile.setAddress(address);
        profile.setBirthday(date);
        profile.setCity(city);
        profile.setSex(sex);
        profile.setPhone(phone);
        profile.setPassword(password);
        profile.setCountry(country);
        profile.setEmail(email);
    }
}
