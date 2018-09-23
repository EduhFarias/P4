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
    private boolean verified = false;

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Admin(String name, String email, String password, String address, String country, DateB birthday, String phone) {
        super(name, email, password, address, country, birthday, phone);
    }

    public static void acceptAdmin(ArrayList<Profile> users){
        Scanner input = new Scanner(System.in);

        for(Profile current :  users){
            if(current instanceof Admin){
                if(!((Admin)current).isVerified()){
                    //User.showUser(current); fazer a tela jframe
                    System.out.println("Deseja add esse usuario como admin? Sim ou nao");
                    if(input.nextLine().toLowerCase().equals("sim")){
                        ((Admin)current).setVerified(true);
                    }
                }
            }
        }
    }

    public static void checkContent(ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);

        for(Content current : contents){
            if(!current.isAccepted()){
                View.showContent(current);
                System.out.println("Aceitar o pedido? S ou N");
                String choice = input.nextLine().toLowerCase();

                if(choice.equals("s")){
                    current.setAccepted(true);
                    if(current.getSender() instanceof User){
                        ((User)current.getSender()).setPoints(calcularPontos(current));
                    }
                    current.getSender().getSentContents().add(current);
                } else contents.remove(current);
            }
        }
    }

    public static int calcularPontos(Content content){
        //dar um jeito de calcular pontos com base no conteudo postado
        return 0;
    }
}

