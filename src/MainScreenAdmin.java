import java.util.*;

public class MainScreenAdmin extends MainScreen{
    public static void mainMenu(ArrayList<User> users, Admin logged, ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);
        boolean condition = true;

        while(condition) {
            View.showMainScreenAdmin();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    verTodosConteudos(contents, logged);
                    break;
                case 2:
                    search(contents);
                    break;
                case 3:
                    cadastrarConteudo(contents, logged);
                    break;
                case 4:
                    Admin.checkContent(contents);
                    break;
                case 5:
                    Admin.acceptAdmin(users);
                    break;
                case 6:
                    editProfile(logged);
                    break;
                default:
                    condition = false;
            }
        }
    }

    public static void cadastrarConteudo(ArrayList<Content> contents, User logged){
        Scanner input = new Scanner(System.in);

        System.out.println("Name:");
        String name = input.nextLine();

        System.out.println("Type:");
        String type = input.nextLine();

        System.out.println("Author:");
        String author = input.nextLine();

        System.out.println("Caminho do arquivo:"); // ainda a ser testado, ver como funciona o armazenamento de pdf
        String file = input.nextLine();

        //Converter de string para file ou ver como fazer dps

        Content newContent = new Content(name, type, author, logged, null);
        newContent.setAccepted(true);
        contents.add(newContent);

        System.out.println("Conteudo exclusivo? Sim ou nao");
        String choice = input.nextLine().toLowerCase();

        if(choice.equals("sim")){
            newContent.setExclusive(true);
            System.out.println("Quantos pontos custa?");
            newContent.setCost(input.nextInt());
        }
    }
}
