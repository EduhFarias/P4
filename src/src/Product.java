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
import java.io.File;

public class Product {
    private String name;
    private String type;
    private String author;
    private Profile sender;
    private File file; // Verificar como armazenar um pdf ou arquivo txt
    private boolean accepted;
    private boolean exclusive;
    private int cost;

    public Product(){}
    
    public Product(String name, String type, String author, Profile sender, File file) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.sender = sender;
        this.file = file;
        this.accepted = false;
        this.exclusive = false;
        this.cost = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Profile getSender() {
        return sender;
    }

    public void setSender(Profile sender) {
        this.sender = sender;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isExclusive() {
        return exclusive;
    }

    public void setExclusive(boolean exclusive) {
        this.exclusive = exclusive;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void registerProduct(String title, String type, String author, File file, boolean exclusive, int cost){
        Data data = new Data();
        data = data.getData();
        Product newProduct = new Product(title, type, author, data.getProfiles().get(0), file);
        if(data.getProfiles().get(0).getProfile().equals("admin")){
            newProduct.setAccepted(true);
        }
        if(exclusive == true){
            newProduct.setExclusive(true);
            newProduct.setCost(cost);
        }
        data.getProducts().add(newProduct);
        data.setData(data);
    }
    
    public Product getProduct(String txt){
        Data data = new Data();
        data = data.getData();
        for(Product current : data.getProducts()){
            if(current.isAccepted()){
                if(current.getName().toLowerCase().equals(txt.toLowerCase()) || current.getAuthor().toLowerCase().equals(txt.toLowerCase())){
                    data.getProducts().remove(current);
                    data.getProducts().add(0, current);
                    data.setData(data);
                    return current;
                }
            }
        }
        return null;
    }


}

