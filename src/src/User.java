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

public class User extends Profile{
    private int points;

    public User(String name, String email, String password, String address, String country, DateB birthday, String phone) {
        super(name, email, password, address, country, birthday, phone);
        this.points = 0;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
