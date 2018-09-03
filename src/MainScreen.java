import java.io.File;
import java.util.*;

public class MainScreen {
    public static void mainMenu(ArrayList<User> users, User logged, ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);
        boolean condition = true;

        while(condition) {
            View.showMainScreen();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    verTodosConteudos(contents);
                    break;
                case 2:
                    search(contents);
                    break;
                case 3:
                    cadastrarConteudo(contents, (RealUser) logged);
                    break;
                case 4:
                    //criar parceria();
                    break;
                case 5:
                    store(contents, (RealUser) logged);
                    break;
                case 6:
                    //Editar perfil
                    break;
                case 7  :
                    //Recomendaçoes
                    break;
                default:
                    condition = false;
            }
        }
    }

    public static void verTodosConteudos(ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha algum conteudo ou digite back para voltar");
        View.showAllContent(contents);
        String choice = input.nextLine();

        if(!choice.equals("back")){
            try{
                View.showContent(Content.getContentByName(contents, choice));
            } catch (NullPointerException e){
                System.out.println("Arquivo nao encontrado");
            }
        }
    }

    public static void search(ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);

        // talvez fazer algo que retorne uma lista de conteudos, se o nome for exato so retonará 1
        System.out.println("Digite o nome do arquivo");
        String name = input.nextLine();
        try{
            View.showContent(Content.getContentByName(contents, name));
        } catch (NullPointerException e){
            System.out.println("Arquivo não encontrado");
        }

    }

    public static void cadastrarConteudo(ArrayList<Content> contents, RealUser logged){
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

        System.out.println("Pedido realizado com sucesso. O arquivo passara por analise dos administradores," +
                "caso seja aceito sera add ao sistema");

        Content newContent = new Content(name, type, author, logged, null);
        contents.add(newContent);
    }

    public static void parceria(ArrayList<Content> contents, User logged){ //criar classe empresa
        cadastrarConteudo(contents, (RealUser) logged);
        //dar um jeito de pegar esse conteudo que foi add e fazer o content.setExclusive(true);
    }

    public static void store(ArrayList<Content> contents, RealUser logged){
        Scanner input = new Scanner(System.in);

        System.out.println("Seus pontos: " + logged.getPoints());
        for(Content current : contents){
            if(current.isExclusive()){
                View.showContent(current);
            }
        }

    }


}
