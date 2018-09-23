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

public class MainScreen {
    public static void mainMenu(ArrayList<Profile> users, User logged, ArrayList<Content> contents){
        Scanner input = new Scanner(System.in);
        boolean condition = true;

        while(condition) {
            View.showMainScreen();
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
                    store(contents, logged);
                    break;
                case 5:
                    editProfile(logged);
                    break;
                case 6:
                    //Recomendaçoes
                    break;
                default:
                    condition = false;
            }
        }
    }

    public static void verTodosConteudos(ArrayList<Content> contents, Profile logged){
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha algum conteudo ou digite back para voltar");
        View.showAllContent(contents);
        String choice = input.nextLine();

        if(!choice.equals("back")){
            try{
                View.showContent(Content.getContentByName(contents, choice));
                System.out.println("Deseja add aos favoritos? Sim ou nao");
                if(input.nextLine().toLowerCase().equals("sim")){
                    logged.getFavoriteContent().add(Content.getContentByName(contents, choice));
                }
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
        contents.add(newContent);

        System.out.println("Pedido realizado com sucesso. O arquivo passara por analise dos administradores," +
                "caso seja aceito sera add ao sistema");

    }

    public static void store(ArrayList<Content> contents, User logged){
        Scanner input = new Scanner(System.in);

        System.out.println("Seus pontos: " + logged.getPoints());
        for(Content current : contents){
            if(current.isExclusive()){
                View.showContent(current);
            }
        }
        System.out.println("Digite o nome de algum conteudo ou digite back para voltar");
        String choice = input.nextLine();

        if(!choice.equals("back")){
            Content content = Content.getContentByName(contents, choice);
            System.out.println("Confirmar troca de pontos nesse conteudo? Sim ou nao");
            View.showContent(content);
            choice = input.nextLine().toLowerCase();
            if(choice.equals("sim")){
                try{
                    if(logged.getPoints() >= content.getCost()){
                        logged.getExclusiveContent().add(content);
                        logged.setPoints(logged.getPoints() - content.getCost());
                    }
                } catch (NullPointerException e){
                    System.out.println("Algum erro, ver dps ou pontos insuficientes");
                }
            }
        }

    }

    public static void editProfile(Profile logged){
        Scanner input = new Scanner(System.in);
        boolean condition = true;

        while(condition){
            View.showEdit();
            int choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:
                    System.out.println("New name:");
                    logged.setName(input.nextLine());
                    break;
                case 2:
                    System.out.println("New email:");
                    logged.setEmail(input.nextLine());
                    break;
                case 3:
                    System.out.println("New password:");
                    String password = input.nextLine();
                    System.out.println("Enter old password to confirm:");
                    if(logged.getPassword().equals(input.nextLine())){
                        logged.setPassword(password);
                    } else System.out.println("Password invalid");
                    break;
                case 4:
                    System.out.println("New address:");
                    logged.setAddress(input.nextLine());
                    break;
                case 5:
                    System.out.println("New country:");
                    logged.setCountry(input.nextLine());
                    break;
                case 6:
                    System.out.println("New day, mouth and year");
                    logged.setBirthday(new DateB(input.nextInt(), input.nextInt(), input.nextInt()));
                    break;
                case 7:
                    System.out.println("New phone:");
                    logged.setPhone(input.nextLine());
                    break;
                default:
                    condition = false;
            }
        }
    }
}
