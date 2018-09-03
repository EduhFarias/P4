import java.util.*;
import java.util.Date;


    /*------------------------------------------------------------------
*
* Mudar os dialogos para ingles, apesar que todos serao mostrados na gui
* Mudar nome dos metodos para ingles
*
*
    ------------------------------------------------------------------*/

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Content> contents = new ArrayList<>();

        boolean condition = true;


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
        }
    }

    public static void login(ArrayList<User> users, ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);
        System.out.println("Email:");
        String email = input.nextLine();

        for(User current : users){
            if(current.getEmail().equals(email)){
                System.out.println("Password");
                String password = input.nextLine();
                if(current.getPassword().equals(password)){
                    System.out.println("Success");
                    MainScreen.mainMenu(users, current, contents);
                }
            }
        }
    }


    public static void signUp(ArrayList<User> users, ArrayList<Content> contents){
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

        Profile newProfile = new Profile(address, country, new DateB (day, month, year), phone);

        input.nextLine();
        System.out.println("Admin or user?");
        String option = input.nextLine();
        option = option.toLowerCase();
        //Colocar um try catch aqui
        if(option.equals("admin")){
            Admin admin = new Admin(name, email, password, newProfile);
            users.add(admin);//arrumar n da pra criar direto, pedido ter que ser feito por outro admin
        } else{
            RealUser user = new RealUser(name, email, password, newProfile);
            users.add(user);
            MainScreen.mainMenu(users, user, contents);
        } // colocar um finally com chamada para mainscreen
    }

}
