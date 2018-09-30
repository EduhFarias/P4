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
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Data {
    private ArrayList<Profile> profiles = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> contents) {
        this.products = contents;
    }
    
    public static void setData(Data data){ //dps tirar o static
        XStream xstream = new XStream(new DomDriver());
        String xml = xstream.toXML(data); 
        try{
            File file = new File("data.xml");
            PrintWriter print = new PrintWriter(file);
            
            print.write(xml);
            print.flush();
            print.close();
        } catch(FileNotFoundException ex){
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Data getData(){
        Data data = new Data();
        try {
            FileReader file = new FileReader("data.xml");
            XStream xstream = new XStream(new DomDriver());
            
            data = (Data)xstream.fromXML(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}
