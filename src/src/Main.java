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

    /*------------------------------------------------------------------
*
* Mudar nome dos metodos para ingles
*
    ------------------------------------------------------------------*/

public class Main {
    public static void main(String[] args){
        view.TelaInicial frame = new view.TelaInicial();
        Dados dados = new Dados();
        
        //view.TelaInicial.TelaInicialRun();
        /*Scanner input = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Content> contents = new ArrayList<>();

        boolean condition = true;
        Admin admin = new Admin("Edu", "ehfs", "1234", null);
        admin.setVerified(true);
        users.add(admin);

        while(condition){
            View.showHomeScreen();
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    View.showAllContent(contents);
                    break;
                case 2:
                    signUp(users, contents);
                    break;
                case 3:
                    login(users, contents);
                    break;
                default:
                    condition = false;
            }
        }*/
    }

    public static void login(ArrayList<Profile> users, ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);
        System.out.println("Email:");
        String email = input.nextLine();

        for(Profile current : users){
            if(current.getEmail().equals(email)){
                System.out.println("Password");
                String password = input.nextLine();
                if(current.getPassword().equals(password)){
                   if(current instanceof Admin){
                       if(((Admin)current).isVerified()) {
                           MainScreenAdmin.mainMenu(users, (Admin) current, contents);
                       }
                   } else MainScreen.mainMenu(users, (User) current, contents);
                }
            }
        }
    }

    public static void signUp(ArrayList<Profile> users, ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);

        System.out.println("Name:");
        String name = input.nextLine();

        System.out.println("Email:");
        String email = input.nextLine();

        System.out.println("Password:");
        String password = input.nextLine();

        System.out.println("Address:");
        String address = input.nextLine();

        System.out.println("Country:");
        String country = input.nextLine();

        System.out.println("Phone");
        String phone = input.nextLine();

        System.out.println("Birthday: (day / month / year)");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        
        input.nextLine();
        System.out.println("Admin or user?");
        String option = input.nextLine().toLowerCase();

        if(option.equals("admin")){
            Admin admin = new Admin(name, email, password, address, country, new DateB(day, month, year), phone);
            users.add(admin);
        } else{
            User user = new User(name, email, password, address, country, new DateB(day, month, year), phone);
            users.add(user);
            MainScreen.mainMenu(users, user, contents);
        }
    }

}
