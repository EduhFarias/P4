import java.io.File;
import java.util.*;

public class Content {
    private String name;
    private String type;
    private String author;
    private RealUser sender;
    private File file; // Verificar como armazenar um pdf ou arquivo txt
    private boolean accepted;
    private boolean exclusive;
    private int cost;

    public Content(String name, String type, String author, RealUser sender, File file) {
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

    public RealUser getSender() {
        return sender;
    }

    public void setSender(RealUser sender) {
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

    public static Content getContentByName(ArrayList<Content> contents, String name){
        for(Content current : contents){
            if(current.getName().equals(name) && current.isAccepted()){
                return current;
            }
        }
        System.out.println("Arquivo nao encontrado");
        return null;
    }


}
