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

public class Admin extends Profile{
    private boolean verified;

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Admin(String name, String email, String password, String sex, String city, String address, String country, String birthday, String phone) {
        super(name, email, "admin", password, sex, city, address, country, birthday, phone);
        this.verified = false;
    }
    
    public Admin(){}

    public void AcceptProduct(String title){
        Data data = new Data();
        data = data.getData();
        
        for(Product current : data.getProducts()){
            if(current.getName().equals(title)){
                int size = (int) current.getFile().length();
                if(size >= 100){
                    size = 100;
                }
                User user = (User) current.getSender();
                user.getMyProducts().add(current);
                user.setPoints(user.getPoints() + size);
                current.setAccepted(true);
            }
        }
        data.setData(data);
    }
    
    public void RemoveProduct(ArrayList<Product> products,String title){
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getName().equals(title)){
                products.remove(i);
            }
        }
    }
}

